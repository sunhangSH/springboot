package com.meteorxsh.wiki.service;

import com.meteorxsh.wiki.domain.Ebook;
import com.meteorxsh.wiki.domain.EbookExample;
import com.meteorxsh.wiki.mapper.EbookMapper;
import com.meteorxsh.wiki.request.EbookRequest;
import com.meteorxsh.wiki.response.EbookResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author shMeteor
 * @create 2021-11-24-23:49
 */
@Service
public class EbookService {
    @Resource
    private EbookMapper ebookMapper;

    public List<EbookResponse> list(EbookRequest ebookRequest){
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();//类似where 条件
        criteria.andNameLike("%"+ebookRequest.getName()+"%");

        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);

        List<EbookResponse> responseList = new ArrayList<>();
        for (Ebook ebook : ebookList) {
            EbookResponse ebookResponse = new EbookResponse();
            BeanUtils.copyProperties(ebook, ebookResponse);
            responseList.add(ebookResponse);
        }
        return responseList;
    }
}
