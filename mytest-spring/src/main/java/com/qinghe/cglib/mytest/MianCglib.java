/**
 * Allrights Reserved,Designed By www.maihaoche.com
 *
 * @Package com.qinghe.cglib
 * @author 清禾 (qinghe@maihaoche.com)
 * @date 2019/4/11 11:16 AM
 * @Copyright 2017-2018 www.maihaoche.comInc.Allrightsreserved.
 * 注意: 本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业项目
 */
package com.qinghe.cglib.mytest;


import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

/**
 * <p>  </p> 
 *
 * @author 清禾 (qinghe@maihaoche.com)
 * @date 2019/4/11 11:16 AM
 * @since V1.0
 */
public class MianCglib {

	public static void main(String[] args) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(Chinese.class);
		Callback[] callbacks = new Callback[]{new MyMethodInterceptor(), NoOp.INSTANCE};
//		enhancer.setCallbacks(callbacks);
		enhancer.setCallback(new MyMethodInterceptor());

//		enhancer.setCallbackFilter(new MyCallbackFilter());
		Chinese chinese = (Chinese) enhancer.create();
		System.out.println(chinese.sayHello("hello"));
		System.out.println("*****************************");
		chinese.eat("eat");

	}
}
