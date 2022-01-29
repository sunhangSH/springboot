// Copyright 2022 Mobvoi Inc. All Rights Reserved.
package com.meteorxsh.wiki.response;

import java.util.List;

/**
 * @author sunhang (hang.sun@mobvoi.com)
 * @date 2022/1/29 14:46
 **/
public class PageResponse<T> {

  private int total;

  private List<T> list;

  public int getTotal() {
    return total;
  }

  public void setTotal(int total) {
    this.total = total;
  }

  public List<T> getList() {
    return list;
  }

  public void setList(List<T> list) {
    this.list = list;
  }

  @Override
  public String toString() {
    return "PageResponse{" +
        "total=" + total +
        ", list=" + list +
        '}';
  }
}