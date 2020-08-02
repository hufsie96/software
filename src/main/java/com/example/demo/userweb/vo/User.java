package com.example.demo.userweb.vo;

public class User {
	 
    private String userId;
    private String userPwd;
    private String name;
    private String age;
    
    public User(String userId, String name, String age) {
        
        this.userId = userId;
        this.name = name;
        this.age = age;
    }
    
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getUserPwd() {
        return userPwd;
    }
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "User [userId=" + userId + ", userPwd=" + userPwd + ", name=" + name + ", age=" + age + "]";
    }
}
