package com.company.tasks;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by Yevhen on 25.04.2016.
 */
public class LogAspect {

    public void onExecute(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("LogAspect: Before execution of: " + pjp.getSignature().getName());
        pjp.proceed();
        System.out.println("LogAspect: After execution of: " + pjp.getSignature().getName());
    }
}
