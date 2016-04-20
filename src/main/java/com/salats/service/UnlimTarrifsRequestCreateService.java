package com.salats.service;

import com.salats.utils.UserInfo;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by aleksandrpliskin on 19.04.16.
 */
public interface UnlimTarrifsRequestCreateService {

    public String createRequest(UserInfo userInfo);

}
