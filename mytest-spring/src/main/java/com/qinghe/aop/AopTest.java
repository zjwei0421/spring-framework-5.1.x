/**
 * Allrights Reserved,Designed By www.maihaoche.com
 *
 * @Package com.qinghe.aop
 * @author 清禾 (qinghe@maihaoche.com)
 * @date 2019/3/31 12:35 AM
 * @Copyright 2017-2018 www.maihaoche.comInc.Allrightsreserved.
 * 注意: 本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业项目
 */
package com.qinghe.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * <p>  </p> 
 *
 * @author 清禾（qinghe@maihaoche.com）
 * @date 2019/3/31 12:35 AM
 * @since V1.0
 */
@Component
@Aspect
public class AopTest {

	@Pointcut("execution(* com.qinghe.dao.*.*(..))")
	public void pointcut(){

	}

	@Before("pointcut()")
	public void before() {
		System.out.println("-----before-----");
	}
}
