package ua.mega.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LogAspect2 {

   /* @Around("execution( * Executor.*(..))")
    public Object onExecute(ProceedingJoinPoint pgp) throws Throwable {
        System.out.println("LogAspect2 Before execution of: " + pgp.getSignature().getName());
       Object result =  pgp.proceed();
        System.out.println("LogAspect2 After execution of: " + pgp.getSignature().getName());
        return result;
    }*/

    @Around("execution( * Executor.addTask(Task)) && args(task))")
    public void onExecute(Task task) throws Throwable {
//        System.out.println("LogAspect2 Before execution of: " + pgp.getSignature().getName());
//        Object result =  pgp.proceed();
//        System.out.println("LogAspect2 After execution of: " + pgp.getSignature().getName());
//        return result;
        System.out.println(task.toString());
    }
}
