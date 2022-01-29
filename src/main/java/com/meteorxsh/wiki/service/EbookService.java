package com.meteorxsh.wiki.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.meteorxsh.wiki.domain.Ebook;
import com.meteorxsh.wiki.domain.EbookExample;
import com.meteorxsh.wiki.mapper.EbookMapper;
import com.meteorxsh.wiki.request.EbookRequest;
import com.meteorxsh.wiki.response.EbookResponse;
import com.meteorxsh.wiki.response.PageResponse;
import com.meteorxsh.wiki.util.CopyUtil;
import java.util.List;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

/**
 * @author shMeteor
 * @create 2021-11-24-23:49
 */
@Service
public class EbookService {

  private static final Logger LOG = LoggerFactory.getLogger(EbookService.class);
  @Resource
  private EbookMapper ebookMapper;

  public PageResponse<EbookResponse> list(EbookRequest ebookRequest) {
    EbookExample ebookExample = new EbookExample();
    EbookExample.Criteria criteria = ebookExample.createCriteria();//类似where 条件
    if (!ObjectUtils.isEmpty(ebookRequest.getName())) {
      criteria.andNameLike("%" + ebookRequest.getName() + "%");
    }
    PageHelper.startPage(ebookRequest.getPage(), ebookRequest.getPageSize());
    List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);

    PageInfo<Ebook> pageInfo = new PageInfo<>(ebookList);
    LOG.info("总行数:{}", pageInfo.getTotal());
    LOG.info("总页数:{}", pageInfo.getPages());

//        List<EbookResponse> responseList = new ArrayList<>();
//        for (Ebook ebook : ebookList) {
////            EbookResponse ebookResponse = new EbookResponse();
////            BeanUtils.copyProperties(ebook, ebookResponse);
    //对象复制
//              EbookResponse ebookResponse = CopyUtil.copy(ebook, EbookResponse.class);
//            responseList.add(ebookResponse);
//        }
    //列表复制
    List<EbookResponse> responseList = CopyUtil.copyList(ebookList, EbookResponse.class);
    PageResponse<EbookResponse> pageResp = new PageResponse<>();
    pageResp.setTotal((int) pageInfo.getTotal());
    pageResp.setList(responseList);
    return pageResp;
  }
}
