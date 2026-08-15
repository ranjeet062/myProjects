package org.design.behavioral.pattern.chainofresponsibility2;


public class Request {
    private String token;
    private String data;
    private String role;
    public Request(String token, String data, String role) {
        this.token = token;
        this.data = data;
        this.role = role;
    }
    public String getToken() {
        return token;
    }
    public String getData() {
        return data;
    }
    public String getRole() {
        return role;
    }
}
