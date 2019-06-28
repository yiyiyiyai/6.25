package com.fyy.service;

import com.fyy.po.Login;

public interface LoginService {
    public Login findLoginUser(String userId, String password,String userState);
    public int updateRemarks(String remarks, String userId);
}
