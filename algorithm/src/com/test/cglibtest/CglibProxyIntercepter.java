package com.test.cglibtest;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;


public class CglibProxyIntercepter implements MethodInterceptor {

	@Override
	public Object intercept(Object sub, Method arg1, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("执行前...");
        Object object = methodProxy.invokeSuper(sub, objects);
        System.out.println("执行后...");
        return object;
	}



}
