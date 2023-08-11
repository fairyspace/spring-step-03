package io.github.fairyspace.service;

public class UserService {
    private String name;
    public void queryUserInfo(){
        System.err.println("查询用户信息"+name);
    }

    public UserService(String name) {
        this.name = name;
    }

    public UserService() {
    }
}
