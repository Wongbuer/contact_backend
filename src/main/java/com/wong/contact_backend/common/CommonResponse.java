package com.wong.contact_backend.common;

public class CommonResponse<T> {
    private String status;
    private T data;

    public CommonResponse(String status, T data) {
        this.status = status;
        this.data = data;
    }
}
