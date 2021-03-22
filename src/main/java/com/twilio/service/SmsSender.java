package com.twilio.service;

import com.twilio.model.SmsRequest;

public interface SmsSender {

    void sendSms(SmsRequest smsRequest);
}
