package com.myproject.common;

/**
 * Created by Administrator on 2017/3/16.
 */
public class CommonResponse<T> implements ICommonResponse{

  private String code;
  private String msg;

  private T datas;

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public T getDatas() {
    return datas;
  }

  public void setDatas(T datas) {
    this.datas = datas;
  }
}
