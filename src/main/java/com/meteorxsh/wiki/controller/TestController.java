package com.meteorxsh.wiki.controller;

import com.meteorxsh.wiki.domain.Test;
import com.meteorxsh.wiki.service.TestService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shMeteor
 * @create 2021-11-17-23:23
 */

/**
 * GET,POST,PUT,DELETE
 * <p>
 * /user?id=1 /user/1
 */
@RestController
public class TestController {

  @Value("${test.hello:TEST}")
  private String testHello;

  @Resource
  private TestService testService;

  //RequestMapping支持所有的请求方式
//    @RequestMapping(value = "/user/1",method = RequestMethod.DELETE)
//    @RequestMapping(value = "/user/1",method = RequestMethod.GET)
  @GetMapping("/hello")
  public String hello() {
    return "Hello World!" + testHello;
  }

  @PostMapping("/hello/post")
  public String helloPost(String name) {
    return "Hello World! Post," + name;
  }

  @GetMapping("/test/list")
  public List<Test> list() {
    return testService.list();
  }
}
