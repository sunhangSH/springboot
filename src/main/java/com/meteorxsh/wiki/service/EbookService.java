package com.meteorxsh.wiki.service;

import com.meteorxsh.wiki.domain.Ebook;
import com.meteorxsh.wiki.mapper.EbookMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shMeteor
 * @create 2021-11-24-23:49
 */
@Service
public class EbookService {
    @Resource
    private EbookMapper ebookMapper;

    public List<Ebook> list(){
        return ebookMapper.selectByExample(null);
    }
}
