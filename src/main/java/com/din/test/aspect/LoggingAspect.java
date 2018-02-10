package com.din.test.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.din.test.source.model.Circle;

@Aspect
public class LoggingAspect {
	
	@Before("allGetters()")
	public void loggingAdvice()
	{
		System.err.println("logging advice"+System.currentTimeMillis());
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters()
	{
		
	}
	@AfterReturning(pointcut= "args(nam)",returning="test")
	public void afterSettingName(Circle nam,String test)
	{
		System.out.println("My name is "+nam + " returning"+test);
	}
	
	@AfterThrowing(pointcut="args(name)",throwing="ex")
	public void afterThrowingException(String name, Exception ex)
	{
		
	}
	
}
