package ru.ibs.springhomework.beans;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;

public class FuelExceptionThrower {
    @Pointcut("execution(public * ru.ibs.springhomework.beans+.*()) && @annotation(ru.ibs.springhomework.beans.FuelExceptionHandle)")
    public void callAtBusinessMethods() {

    }

    @Around("callAtBusinessMethods")
    public  Object fuelExceptionThrower(ProceedingJoinPoint pjp) throws Throwable {
        try {
            return pjp.proceed();
        } catch (Exception e){
            return "error";
        }
    }
}
