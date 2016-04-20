package com.salats.utils;

/**
 * Created by aleksandrpliskin on 20.04.16.
 */
public class UserInfo {

    private Integer sms;

    private Integer call;

    private Integer webTraffic;

    public Integer getCall() {
        return call;
    }

    public void setCall(Integer call) {
        this.call = call;
    }

    public Integer getSms() {
        return sms;
    }

    public void setSms(Integer sms) {
        this.sms = sms;
    }

    public Integer getWebTraffic() {
        return webTraffic;
    }

    public void setWebTraffic(Integer webTraffic) {
        this.webTraffic = webTraffic;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "call=" + call +
                ", sms=" + sms +
                ", webTraffic=" + webTraffic +
                '}';
    }
}
