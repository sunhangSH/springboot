package com.meteorxsh.wiki.controller;

import com.meteorxsh.wiki.request.EbookRequest;
import com.meteorxsh.wiki.response.CommonResponse;
import com.meteorxsh.wiki.response.EbookResponse;
import com.meteorxsh.wiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

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
    public CommonResponse list(EbookRequest ebookRequest){
        CommonResponse<List<EbookResponse>> resp = new CommonResponse<>();
        List<EbookResponse> list = ebookService.list(ebookRequest);
        resp.setContent(list);
        return resp;
    }
}
