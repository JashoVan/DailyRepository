package org.example.ProxyDraft;

import java.lang.reflect.Proxy;

/**
 * @Program: javaweb
 * @ClassName VanProcyFactory
 * @Description:
 * @Author: JashoVan
 * @Create: 2024-06-26 10:26
 * @Version 1.0
 */
public class VanProxyFactory {
    public static Object getProxy(Object object) {
        return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), new VanInvocationHandler(object));

    }
}
