/**
 * Allrights Reserved,Designed By www.maihaoche.com
 *
 * @Package com.qinghe.cglib.example
 * @author 清禾 (qinghe@maihaoche.com)
 * @date 2019/4/11 2:42 PM
 * @Copyright 2017-2018 www.maihaoche.comInc.Allrightsreserved.
 * 注意: 本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业项目
 */
package com.qinghe.cglib.example;

import net.sf.cglib.proxy.CallbackFilter;

import java.lang.reflect.Method;

/**
 * <p>  </p> 
 *
 * @author 清禾 (qinghe@maihaoche.com)
 * @date 2019/4/11 2:42 PM
 * @since V1.0
 */
public class AuthProxyFilter implements CallbackFilter {

	private static final int AUTH_NEED     = 0;
	private static final int AUTH_NOT_NEED = 2;

	/**
	 * 方法的返回值表示走到第几个MethodInterceptor
	 * @param method
	 * @return
	 */
	@Override
	public int accept(Method method) {
//		if ("query".equals(method.getName())) {
//			return AUTH_NOT_NEED;
//		}
		return AUTH_NEED;
	}
}
