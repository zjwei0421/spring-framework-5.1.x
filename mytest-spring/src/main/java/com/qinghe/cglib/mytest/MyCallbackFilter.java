/**
 * Allrights Reserved,Designed By www.maihaoche.com
 *
 * @Package com.qinghe.cglib
 * @author 清禾 (qinghe@maihaoche.com)
 * @date 2019/4/11 11:28 AM
 * @Copyright 2017-2018 www.maihaoche.comInc.Allrightsreserved.
 * 注意: 本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业项目
 */
package com.qinghe.cglib.mytest;

import net.sf.cglib.proxy.CallbackFilter;

import java.lang.reflect.Method;

/**
 * <p>  </p> 
 *
 * @author 清禾 (qinghe@maihaoche.com)
 * @date 2019/4/11 11:28 AM
 * @since V1.0
 */
public class MyCallbackFilter implements CallbackFilter {
	@Override
	public int accept(Method method) {
		if("eat".equals(method.getName())) {
			System.out.println("方法 ：" + method.getName() + "被过滤了");
			return 1;
		}
		return 0;
	}
}
