/**
 * Allrights Reserved,Designed By www.maihaoche.com
 *
 * @Package com.qinghe.cglib
 * @author 清禾 (qinghe@maihaoche.com)
 * @date 2019/4/11 10:49 AM
 * @Copyright 2017-2018 www.maihaoche.comInc.Allrightsreserved.
 * 注意: 本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业项目
 */
package com.qinghe.cglib.mytest;


import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * <p>  </p> 
 *
 * @author 清禾 (qinghe@maihaoche.com)
 * @date 2019/4/11 10:49 AM
 * @since V1.0
 */
public class AroundAdvice implements MethodInterceptor {

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("cglib代理...");
		// 执行目标方法，并保存目标方法执行后的返回值
		Object rvt = proxy.invokeSuper(obj, new String[]{"被改变的参数"});
		System.out.println("执行目标方法之后，模拟结束事务 ...");
		return rvt + " 新增的内容";
	}
}
