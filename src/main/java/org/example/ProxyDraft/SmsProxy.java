package org.example.ProxyDraft;

/**
 * @Program: javaweb
 * @ClassName SmsProxy
 * @Description:
 * @Author: JashoVan
 * @Create: 2024-06-26 09:18
 * @Version 1.0
 */
public class SmsProxy implements SmsService {
    private final SmsService smsService;


    public SmsProxy(SmsService smsService) {
        this.smsService = smsService;
    }

    @Override
    public String sendSms(String phoneNumber, String message) {
        System.out.println("Before send message!");
        smsService.sendSms(phoneNumber, message);
        System.out.println("After send message!");
        return "Ok!";
    }
}
