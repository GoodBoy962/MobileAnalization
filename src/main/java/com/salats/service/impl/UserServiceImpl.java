package com.salats.service.impl;

import com.salats.model.User;
import com.salats.repository.*;
import com.salats.service.UserService;
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
    public UserInfo getInfoByUserId(Long id) {
        UserInfo userInfo = new UserInfo();
        User user = userRepository.findOne(id);
        userInfo.setCall(callRepository.findSumDurationByUserBetweenStartDateAndEndDate(user));
        userInfo.setSms(smsRepository.findSmsCountByUserBetweenStartDateAndEndDate(user));
        userInfo.setWebTraffic(webConnectionRepository.findDurationByUser(user) -
                wifiConnectionRepository.findDurationByUser(user));
        return userInfo;
    }
}
