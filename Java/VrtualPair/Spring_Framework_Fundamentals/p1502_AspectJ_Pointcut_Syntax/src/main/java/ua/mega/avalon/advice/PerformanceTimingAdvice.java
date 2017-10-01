package ua.mega.avalon.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PerformanceTimingAdvice {

    @Pointcut("execution(* ua.mega.avalon.services.*.*(..))")
    public void allServiceMethods() {

    }

    @Around("allServiceMethods()")
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

    @Before("allServiceMethods()")
    public void beforeAdviceLogging(JoinPoint jp) {
        System.out.println("Start the method ..." + jp.getSignature().getName());
    }
}
