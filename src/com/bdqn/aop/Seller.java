package com.bdqn.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class Seller {
	
	public void beforeSeller() {
		System.out.println("����ǿ��Ĺ���");
	}

    public void afterSeller() {
		System.out.println("��������͸ֻ�Ĥ");
	}
    
   
}
