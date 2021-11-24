package com.meteorxsh.wiki.service;

import com.meteorxsh.wiki.domain.Test;
import com.meteorxsh.wiki.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shMeteor
 * @create 2021-11-24-23:49
 */
@Service
public class TestService {
    @Resource
    private TestMapper testMapper;

    public List<Test> list(){
        return testMapper.list();
    }
}
