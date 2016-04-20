package com.salats.service.impl;

import com.salats.service.UnlimTarrifsRequestCreateService;
import com.salats.utils.UserInfo;
import org.springframework.stereotype.Service;

/**
 * Created by aleksandrpliskin on 19.04.16.
 */
@Service
public class UnlimTarrifsRequestCreateServiceImpl implements UnlimTarrifsRequestCreateService {
    @Override
    public String createRequest(UserInfo userInfo) {
        String result = "?";
        String[] operators = new String[]{"1", "3", "4", "5"};
        Integer duration = userInfo.getCall() / 60;
        Integer durationID = 0;
        if (duration < 30) {
            durationID = 1;
        } else if (duration < 100) {
            durationID = 2;
        } else {
            durationID = 3;
        }
        String[] byRussian = {"0"};
        Integer sms = userInfo.getCall() / 30;
        Integer smsID = 0;
        if (sms < 2) {
            smsID = 0;
        } else if (sms < 10) {
            durationID = 1;
        } else {
            durationID = 2;
        }
        Integer internet = userInfo.getCall() / 30;
        Integer internetID = 0;
        if (internet < 2000) {
            smsID = 0;
        } else if (internet < 100000) {
            durationID = 1;
        } else {
            durationID = 2;
        }
        for (String operator : operators) {
            result += "operators%5B%5D=" + operator + "&";
        }
        result += "duration=" + durationID + "&" + "by_russia=" + byRussian[0] + "&internet=" + internetID + "sms=" + smsID;
        return result;
    }
}
