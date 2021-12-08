package com.meteorxsh.wiki.response;

/**
 * @author shMeteor
 * @create 2021-11-28-20:21
 */
public class CommonResponse<T> {

  /**
   * 业务上的成功或失败
   */
  private boolean success = true;

  /**
   * 返回信息
   */
  private String message;

  /**
   * 返回范型数据，自定义类型
   */
  private T content;

  public boolean getSuccess() {
    return success;
  }

  public void setSuccess(boolean success) {
    this.success = success;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public T getContent() {
    return content;
  }

  public void setContent(T content) {
    this.content = content;
  }
}
