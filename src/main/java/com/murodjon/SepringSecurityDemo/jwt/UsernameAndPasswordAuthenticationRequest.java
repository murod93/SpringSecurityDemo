package com.murodjon.SepringSecurityDemo.jwt;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsernameAndPasswordAuthenticationRequest {

    private String username;
    private String password;

    public UsernameAndPasswordAuthenticationRequest(){}

    public UsernameAndPasswordAuthenticationRequest(String username, String password){
        this.username = username;
        this.password = password;
    }
}
