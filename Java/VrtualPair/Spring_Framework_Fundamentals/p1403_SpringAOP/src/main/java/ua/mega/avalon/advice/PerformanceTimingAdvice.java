package ua.mega.avalon.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class PerformanceTimingAdvice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation method) throws Throwable {

       // before
        long startTime = System.nanoTime();

        try {
            // proceed to Target
            Object returnValue = method.proceed();
            return returnValue;
        } finally {
            // after
            long endTime = System.nanoTime();
            long timer = (endTime - startTime);
            System.out.println("The method " + method.getMethod().getName() + " took " + timer + " nanoseconds");
        }
    }
}
