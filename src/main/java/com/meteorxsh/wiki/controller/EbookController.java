package com.meteorxsh.wiki.controller;

import com.meteorxsh.wiki.request.EbookQueryRequest;
import com.meteorxsh.wiki.request.EbookSaveRequest;
import com.meteorxsh.wiki.response.CommonResponse;
import com.meteorxsh.wiki.response.EbookQueryResponse;
import com.meteorxsh.wiki.response.PageResponse;
import com.meteorxsh.wiki.service.EbookService;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shMeteor
 * @create 2021-11-17-23:23
 */

@RestController
@RequestMapping("/ebook")
public class EbookController {

  @Resource
  private EbookService ebookService;

  @GetMapping("/list")
  public CommonResponse list(EbookQueryRequest ebookRequest) {
    CommonResponse<PageResponse<EbookQueryResponse>> resp = new CommonResponse<>();
    PageResponse<EbookQueryResponse> list = ebookService.list(ebookRequest);
    resp.setContent(list);
    return resp;
  }

  @PostMapping("/save")
  public CommonResponse save(
      @RequestBody EbookSaveRequest ebookRequest
  ) {
    CommonResponse resp = new CommonResponse<>();
    ebookService.save(ebookRequest);
    return resp;
  }
}
