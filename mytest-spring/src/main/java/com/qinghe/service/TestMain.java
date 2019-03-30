/**
 * Allrights Reserved,Designed By www.maihaoche.com
 *
 * @Package com.qinghe.service
 * @author 清禾 (qinghe@maihaoche.com)
 * @date 2019/3/31 12:33 AM
 * @Copyright 2017-2018 www.maihaoche.comInc.Allrightsreserved.
 * 注意: 本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业项目
 */
package com.qinghe.service;

import com.qinghe.config.AppConfig;
import com.qinghe.dao.UserDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p>  </p> 
 *
 * @author 清禾（qinghe@maihaoche.com）
 * @date 2019/3/31 12:33 AM
 * @since V1.0
 */
public class TestMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context
				= new AnnotationConfigApplicationContext(AppConfig.class);
		UserDao userDao = context.getBean(UserDao.class);
		userDao.query();
	}
}
