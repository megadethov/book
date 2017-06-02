package ua.mega.hibernate.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by mega on 23.12.2016.
 */
public class ExecutorInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("Interceptor Before execution of: " + invocation.getMethod().getName());
        Object result = invocation.proceed();
        System.out.println("Interceptor After execution of: " + invocation.getMethod().getName());
        return result;
    }
}
