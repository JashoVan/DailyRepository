package org.example.ProxyDraft;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Program: javaweb
 * @ClassName VanInvocationHandler
 * @Description:
 * @Author: JashoVan
 * @Create: 2024-06-26 10:18
 * @Version 1.0
 */
public class VanInvocationHandler implements InvocationHandler {
    private final Object target;

    public VanInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before message send!" + method.getName());
        Object result = method.invoke(target, args);
        System.out.println("After message send!" + method.getName());
        return result;
    }
}
