/**
 * @Package com.qinghe.service
 * @author 清禾 (zjwei0421@163.com)
 * @date 2019/3/31 12:50 AM
 */
package com.qinghe.service;

import com.qinghe.dao.UserDao;
import com.qinghe.dao.UserDaoImpl;
import com.qinghe.proxy.UserDaoLogProxy;

/**
 * <p>  </p> 
 *
 * @author 清禾 (zjwei0421@163.com)
 * @date 2019/3/31 12:50 AM
 * @since V1.0
 */
public class TestProxy {
	public static void main(String[] args) {
		UserDao userDao = new UserDaoImpl();
		UserDaoLogProxy proxy = new UserDaoLogProxy(userDao);
		proxy.query();
	}
}
