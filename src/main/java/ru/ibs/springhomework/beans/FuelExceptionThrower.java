package ru.ibs.springhomework.beans;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class FuelExceptionThrower {
    @Pointcut("@annotation(ru.ibs.springhomework.beans.FuelExceptionHandle)")
    public void callAtBusinessMethods() {}


    @Around("callAtBusinessMethods()")
    public  String fuelExceptionThrower(ProceedingJoinPoint pjp) throws Throwable {

        try {
            pjp.proceed();
        } catch (Exception e){
            return "error";
        }
        return "engineType";
    }
}
