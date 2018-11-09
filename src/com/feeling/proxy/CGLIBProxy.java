package com.feeling.proxy;

import java.lang.reflect.Method;

public class CGLIBProxy implements MethodInterceptor{
    private Object target;

    public Object getInstance(final Object target){
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    public Object intercept(Object object, Method method,Object[] args,
                            MethodProxy methodProxy) throws Throwable{
        Object result = methodProxy.invoke(object,args);
    }

}
