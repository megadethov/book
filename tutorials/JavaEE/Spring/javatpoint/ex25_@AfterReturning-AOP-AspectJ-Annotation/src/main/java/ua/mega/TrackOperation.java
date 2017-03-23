package ua.mega;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

// By using after returning advice, we can get the result in the advice.

@Aspect
public class TrackOperation {

    @AfterReturning(pointcut = "execution(* Operation.*(..))", returning = "result")
    public void myAdvice(JoinPoint jp, Object result) {
        System.out.println("..........additional concern");
        System.out.println("Method Signature: " + jp.getSignature());
        System.out.println("Result in advice: " + result);
        System.out.println("end of after returning advice...");
    }
}
