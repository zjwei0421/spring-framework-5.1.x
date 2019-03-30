/**
 *
 * @Package com.qinghe.service
 * @author 清禾 (zjwei0421@163.com)
 * @date 2019/3/31 12:33 AM
 */
package com.qinghe.service;

import com.qinghe.config.AppConfig;
import com.qinghe.dao.UserDao;
import com.qinghe.proxy.UserDaoLogProxy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p>  </p> 
 *
 * @author 清禾 (zjwei0421@163.com)
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
