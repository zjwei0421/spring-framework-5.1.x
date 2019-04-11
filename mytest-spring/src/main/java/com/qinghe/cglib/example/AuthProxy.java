/**
 * Allrights Reserved,Designed By www.maihaoche.com
 *
 * @Package com.qinghe.cglib.example
 * @author 清禾 (qinghe@maihaoche.com)
 * @date 2019/4/11 2:30 PM
 * @Copyright 2017-2018 www.maihaoche.comInc.Allrightsreserved.
 * 注意: 本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业项目
 */
package com.qinghe.cglib.example;


import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * <p>  </p> 
 *
 * @author 清禾 (qinghe@maihaoche.com)
 * @date 2019/4/11 2:30 PM
 * @since V1.0
 */
public class AuthProxy implements MethodInterceptor {

	/**
	 * 登录名
	 */
	private String name;

	public AuthProxy(String name) {
		this.name = name;
	}

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		if(!"maurice".equals(this.name)) {
			System.out.println("AuthProxy:you have no permits to do manager!");
			return null;
		}
		return proxy.invokeSuper(obj, args);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
