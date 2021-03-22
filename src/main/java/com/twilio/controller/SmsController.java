package com.twilio.controller;


import com.twilio.model.SmsRequest;
import com.twilio.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sms")
public class SmsController {

    @Autowired
    private SmsService smsService;

    @PostMapping
    public void sendSMS(@RequestBody SmsRequest smsRequest){
        System.out.println("Entra en controller: "+smsRequest);
        smsService.sendSms(smsRequest);
    }
}
