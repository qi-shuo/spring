package com.qis.edu;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @author qishuo
 * @date 2021/2/18 9:40 下午
 */
@Component
@Aspect
@EnableAspectJAutoProxy  //开启注解的Aop 功能

public class LogUtils {
	@Pointcut("execution(* com.qis.edu.*.*(..))")
	public void logAspect(){

	}
	@Before("logAspect()")
	public void before() {
		System.out.println("前置通知");
	}
}
