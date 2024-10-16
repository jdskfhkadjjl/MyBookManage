package com.bookmanage.bookmanagesystem.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectClass {
    @Pointcut("execution(void *.*(..))")
    public void pt(){}

    //@Around("pt()")
    @Around("execution(void *.*(..))")
    public Object methods(ProceedingJoinPoint proceedingJoinPoint){
        //...
        try {
            proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        //...
        return null;
    }
    @Before("@annotation(*.Myannocation)")
    public void me(){
        //...
    }
}
