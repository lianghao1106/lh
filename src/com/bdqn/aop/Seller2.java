package com.bdqn.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Seller2 {

	@Before("execution(*  com.bdqn.aop.Customer.*(..))")
	public void beforeSeller() {
		System.out.println("介绍强大的功能");
	}

	@AfterReturning("execution(*  com.bdqn.aop.Customer.*(..))")
    public void afterSeller() {
		System.out.println("购买后赠送钢化膜");
	}
	
	@Around(" execution(*  com.bdqn.aop.Customer.*(..))")
	public Object round(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("环绕前业务方法");
		Object obj=pjp.proceed();
		System.out.println("环绕后业务方法");
		return obj;	
	}
	
	@After(" execution(*  com.bdqn.aop.Customer.*(..))")
	public void after() {
		System.out.println("欢迎下次光临！");
	}
}
