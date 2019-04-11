/**
 * Allrights Reserved,Designed By www.maihaoche.com
 *
 * @Package com.qinghe.cglib.example
 * @author 清禾 (qinghe@maihaoche.com)
 * @date 2019/4/11 3:10 PM
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
 * @date 2019/4/11 3:10 PM
 * @since V1.0
 */
public class LogProxy implements MethodInterceptor {


	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		if(!"query".equals(method.getName())) {
		}
		System.out.println(method.getName() + "方法开始执行");
		Long start = System.currentTimeMillis();
		Object retult = proxy.invokeSuper(obj,args);
		System.out.println(method.getName() + "方法执行完成，耗时：" + (System.currentTimeMillis()-start));
		return retult;
//		return proxy.invokeSuper(obj, args);
	}
}
