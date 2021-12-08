package com.meteorxsh.wiki.service;

import com.meteorxsh.wiki.domain.Test;
import com.meteorxsh.wiki.mapper.TestMapper;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @author shMeteor
 * @create 2021-11-24-23:49
 */
@Service
public class TestService {

  @Resource
  private TestMapper testMapper;

  public List<Test> list() {
    return testMapper.list();
  }
}
