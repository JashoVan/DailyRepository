package org.example.ProxyDraft;

/**
 * @Program: javaweb
 * @ClassName Test
 * @Description:
 * @Author: JashoVan
 * @Create: 2024-06-26 09:39
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        SmsService service = new SmsServiceImpl();
        SmsProxy proxy = new SmsProxy(service);
        proxy.sendSms("911", "SOS!!!");


        SmsService smsService = (SmsService) VanProxyFactory.getProxy(service);
        smsService.sendSms("119", "SOS!!!");

    }
}
