package com.libing.dto;

/**
 * @Description: 请求返回结果封装
 * @Auther: LEE
 * @Date: Create in 2018/2/12 22:31
 */
public class Result<T> {

    private boolean success;

    private T data;

    private String error;

    public Result(boolean success, T data) {
        this.success = success;
        this.data = data;
    }

    public Result(boolean success, String error) {
        this.success = success;
        this.error = error;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

}
