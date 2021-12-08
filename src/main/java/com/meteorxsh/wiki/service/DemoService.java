package com.meteorxsh.wiki.service;

import com.meteorxsh.wiki.domain.Demo;
import com.meteorxsh.wiki.mapper.DemoMapper;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @author shMeteor
 * @create 2021-11-24-23:49
 */
@Service
public class DemoService {

  @Resource
  private DemoMapper demoMapper;

  public List<Demo> list() {
    return demoMapper.selectByExample(null);
  }
}
