/**
 * @Package com.qinghe.service
 * @author 清禾 (zjwei0421@163.com)
 * @date 2019/4/2 11:42 PM
 */
package com.qinghe.service;

import com.qinghe.dao.UserDao;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <p>  </p> 
 *
 * @author 清禾 (zjwei0421@163.com)
 * @date 2019/4/2 11:42 PM
 * @since V1.0
 */
public class MyFactoryBean implements FactoryBean {

	@Autowired
	UserDao userDao;

	@Override
	public Object getObject() throws Exception {
		return userDao;
	}

	@Override
	public Class<?> getObjectType() {
		return null;
	}

	public void query() {
		System.out.println("MyFactoryBean");
	}
}
