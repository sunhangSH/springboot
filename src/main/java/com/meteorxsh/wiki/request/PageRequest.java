// Copyright 2022 Mobvoi Inc. All Rights Reserved.
package com.meteorxsh.wiki.request;

/**
 * @author sunhang (hang.sun@mobvoi.com)
 * @date 2022/1/29 14:22
 **/
public class PageRequest {

  private int page;

  private int pageSize;

  public int getPage() {
    return page;
  }

  public void setPage(int page) {
    this.page = page;
  }

  public int getPageSize() {
    return pageSize;
  }

  public void setPageSize(int pageSize) {
    this.pageSize = pageSize;
  }

  @Override
  public String toString() {
    return "PageRequest{" +
        "page=" + page +
        ", pageSize=" + pageSize +
        '}';
  }
}