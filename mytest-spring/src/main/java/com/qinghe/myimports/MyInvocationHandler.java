/**
 * Allrights Reserved,Designed By www.maihaoche.com
 *
 * @Package com.qinghe.myimports
 * @author 清禾 (qinghe@maihaoche.com)
 * @date 2019/4/10 2:48 PM
 * @Copyright 2017-2018 www.maihaoche.comInc.Allrightsreserved.
 * 注意: 本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业项目
 */
package com.qinghe.myimports;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * <p>  </p> 
 *
 * @author 清禾 (qinghe@maihaoche.com)
 * @date 2019/4/10 2:48 PM
 * @since V1.0
 */
public class MyInvocationHandler implements InvocationHandler {

	private Object target;

	public MyInvocationHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("我是代理");
		return method.invoke(target, args);
	}
}
