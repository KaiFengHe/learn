package com.example.demo;

public class HelloService {
    private String msg;

    public String sayHello() {
        return "Hello" + msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
