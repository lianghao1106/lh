package com.bdqn.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class Seller {
	
	public void beforeSeller() {
		System.out.println("介绍强大的功能");
	}

    public void afterSeller() {
		System.out.println("购买后赠送钢化膜");
	}
    
   
}
