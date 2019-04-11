/**
 * Allrights Reserved,Designed By www.maihaoche.com
 *
 * @Package com.qinghe.cglib.example
 * @author 清禾 (qinghe@maihaoche.com)
 * @date 2019/4/11 2:28 PM
 * @Copyright 2017-2018 www.maihaoche.comInc.Allrightsreserved.
 * 注意: 本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业项目
 */
package com.qinghe.cglib.example;

/**
 * <p>  </p> 
 *
 * @author 清禾 (qinghe@maihaoche.com)
 * @date 2019/4/11 2:28 PM
 * @since V1.0
 */
public class InfoManager {
	// 模拟查询操作
	public void query() {
		System.out.println("query");
	}
	// 模拟创建操作
	public void create(){
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("create");
	}
	// 模拟更新操作
	public void update() {
		try {
			Thread.sleep(15);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("update");
	}
	// 模拟删除操作
	public void delete(){
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("delete");
	}
}
