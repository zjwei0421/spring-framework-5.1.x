/**
 * Allrights Reserved,Designed By www.maihaoche.com
 *
 * @Package com.qinghe.cglib
 * @author 清禾 (qinghe@maihaoche.com)
 * @date 2019/4/11 11:26 AM
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
 * @date 2019/4/11 11:26 AM
 * @since V1.0
 */
public class MyMethodInterceptor implements MethodInterceptor {
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("原方法名是 ： " + method.getName());
		System.out.println("原方法声明的类为 " + method.getDeclaringClass());
		System.out.println("我是 " + proxy.invokeSuper(obj, args));
		System.out.println("我调用结束了");
		return proxy.invokeSuper(obj, args);
	}
}
