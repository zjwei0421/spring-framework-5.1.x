/**
 * Allrights Reserved,Designed By www.maihaoche.com
 *
 * @Package com.qinghe.cglib
 * @author 清禾 (qinghe@maihaoche.com)
 * @date 2019/4/11 10:52 AM
 * @Copyright 2017-2018 www.maihaoche.comInc.Allrightsreserved.
 * 注意: 本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业项目
 */
package com.qinghe.cglib.mytest;

import org.springframework.stereotype.Component;

/**
 * <p>  </p> 
 *
 * @author 清禾 (qinghe@maihaoche.com)
 * @date 2019/4/11 10:52 AM
 * @since V1.0
 */
@Component
public class Chinese {

	public String sayHello(String name) {
		System.out.println("-- 正在执行 sayHello 方法 --");
		// 返回简单的字符串
		return name + " Hello , Spring AOP";
	}
	public void eat(String food) {
		System.out.println("我正在吃 :"+ food);
	}
}
