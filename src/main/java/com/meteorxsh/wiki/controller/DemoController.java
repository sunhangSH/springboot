package com.meteorxsh.wiki.controller;

import com.meteorxsh.wiki.domain.Demo;
import com.meteorxsh.wiki.service.DemoService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shMeteor
 * @create 2021-11-17-23:23
 */

@RestController
@RequestMapping("/demo")
public class DemoController {

  @Resource
  private DemoService demoService;

  @GetMapping("/list")
  public List<Demo> list() {
    return demoService.list();
  }
}
