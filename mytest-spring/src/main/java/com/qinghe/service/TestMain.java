/**
 *
 * @Package com.qinghe.service
 * @author 清禾 (zjwei0421@163.com)
 * @date 2019/3/31 12:33 AM
 */
package com.qinghe.service;

import com.qinghe.config.AppConfig;
import com.qinghe.dao.IndexService;
import com.qinghe.dao.UserDao;
import com.qinghe.dao.UserDaoImpl;
import com.qinghe.myimports.Dao;
import com.qinghe.proxy.UserDaoLogProxy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>  </p> 
 *
 * @author 清禾 (zjwei0421@163.com)
 * @date 2019/3/31 12:33 AM
 * @since V1.0
 */
public class TestMain {
	public static void main(String[] args) {

		//把Spring所有的前提准备好
		AnnotationConfigApplicationContext context
				= new AnnotationConfigApplicationContext(AppConfig.class);
//		context.register(AppConfig.class);
//		context.refresh();
//		Dao userDao = (Dao) context.getBean("indexDao");
//		userDao.query();
		IndexService indexService = context.getBean(IndexService.class);

	}
}
