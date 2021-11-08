package ru.ibs.springhomework.beans;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@EnableAspectJAutoProxy
@Aspect
@Component
public @interface FuelExceptionMethod {

    @Pointcut("execution(public * ru.ibs.springhomework.beans+.*())")
    String callAtBusinessMethods();

    @Around("callAtBusinessMethods")
    public default Object fuelExceptionThrower(ProceedingJoinPoint pjp){
        try {
            return pjp.proceed();
        } catch (Exception e){
            System.out.println("Что-то пошло не так!");
        }
        return null;
    }
}
