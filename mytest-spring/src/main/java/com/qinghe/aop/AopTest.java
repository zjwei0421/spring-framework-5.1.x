/**
 *
 * @author 清禾 (zjwei0421@163.com)
 * @date 2019/3/31 12:35 AM
 */
package com.qinghe.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * <p> 面向切面编程 </p>
 *
 * @author 清禾 (zjwei0421@163.com)
 * @date 2019/3/31 12:35 AM
 * @since V1.0
 */
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
