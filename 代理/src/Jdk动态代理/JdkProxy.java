package Jdk动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JdkProxy<T> implements InvocationHandler {
    T target;

    public JdkProxy(T target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Come!");
        return method.invoke(target,args);
    }
}
