package ua.mega;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackOperation {

//    @Pointcut("execution(* Operation.*(..))") // for all methods in Operation class with any parameters
    @Pointcut("execution(* Operation.m*(..))") // for all methods starting with m in Operation class with any parameters
    public void k() { //pointcut name
    }

    @Before("k()") //applying pointcut on before advice
    public void myAdvice(JoinPoint jp) { //it is advice (before advice)
        System.out.println(".......... additional concern");
        //System.out.println("Method Signature: "  + jp.getSignature());
    }


}
