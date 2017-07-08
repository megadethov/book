package ua.mega.avalon.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.ProceedingJoinPoint;

public class PerformanceTimingAdvice {

    public Object performTimingMeasurement(ProceedingJoinPoint method) throws Throwable {

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
            System.out.println("The method " + method.getSignature().getName() + " took " + timer + " nanoseconds");
        }
    }

    public void beforeAdviceLogging() {
        System.out.println("Start the method ...");
    }
}
