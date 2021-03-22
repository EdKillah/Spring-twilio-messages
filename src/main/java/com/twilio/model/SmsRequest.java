package com.twilio.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SmsRequest {

    private final String phoneNumber;
    private final String message;

    public SmsRequest(@JsonProperty("phoneNumber") String phoneNumber,@JsonProperty("message") String message) {
        System.out.println("On model smsRequest | PhoneNumber: "+phoneNumber + " | message: "+message);
        this.phoneNumber = phoneNumber;
        this.message = message;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "SmsRequest{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
