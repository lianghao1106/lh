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
		System.out.println("����ǿ��Ĺ���");
	}

	@AfterReturning("execution(*  com.bdqn.aop.Customer.*(..))")
    public void afterSeller() {
		System.out.println("��������͸ֻ�Ĥ");
	}
	
	@Around(" execution(*  com.bdqn.aop.Customer.*(..))")
	public Object round(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("����ǰҵ�񷽷�");
		Object obj=pjp.proceed();
		System.out.println("���ƺ�ҵ�񷽷�");
		return obj;	
	}
	
	@After(" execution(*  com.bdqn.aop.Customer.*(..))")
	public void after() {
		System.out.println("��ӭ�´ι��٣�");
	}
}
