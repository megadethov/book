package ua.mega.avalon.advice;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.List;

public class SimpleLoggingAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {

        // HACK returnValue
        if (returnValue instanceof List) {
            List hackReturningValue = (List) returnValue;
            hackReturningValue.clear();
        }

        System.out.println("METHOD is done - " + method.getName());
        System.out.println("Target method return: " + returnValue);
    }
}
