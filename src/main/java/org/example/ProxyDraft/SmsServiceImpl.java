package org.example.ProxyDraft;

/**
 * @Program: javaweb
 * @ClassName SmsServiceImpl
 * @Description:
 * @Author: JashoVan
 * @Create: 2024-06-26 09:10
 * @Version 1.0
 */
public class SmsServiceImpl implements SmsService{
    public String sendSms(String phoneNumber, String message) {
        System.out.println("Sending SMS to " + phoneNumber);
        System.out.println("Message: " + message);
        return "Message sent";
    }
}
