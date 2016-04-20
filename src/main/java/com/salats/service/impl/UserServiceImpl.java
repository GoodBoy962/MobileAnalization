package com.salats.service.impl;

import com.salats.model.User;
import com.salats.repository.*;
import com.salats.service.UserService;
import com.salats.utils.SecurityUtils;
import com.salats.utils.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by aleksandrpliskin on 20.04.16.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    CallRepository callRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    SmsRepository smsRepository;

    @Autowired
    WebConnectionRepository webConnectionRepository;

    @Autowired
    WifiConnectionRepository wifiConnectionRepository;

    @Override
    public UserInfo getInfoByCurrentUser() {
        User user = SecurityUtils.getCurrentUser();
        Integer sms = smsRepository.findSmsCountByUserBetweenStartDateAndEndDate(user);
        Integer web;
        Integer wifi;
        web = webConnectionRepository.findDurationByUser(user);
        if (web == null) {
            web = 0;
        }
        wifi = wifiConnectionRepository.findDurationByUser(user);
        if (wifi == null) {
            wifi = 0;
        }
        Integer call = callRepository.findSumDurationByUserBetweenStartDateAndEndDate(user);
        Integer webTraffic = web - wifi;
        UserInfo userInfo = new UserInfo();
        userInfo.setSms(sms);
        userInfo.setCall(call);
        userInfo.setWebTraffic(webTraffic);
        return userInfo;
    }
}
