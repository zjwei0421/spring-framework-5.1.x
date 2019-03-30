/**
 * @Package com.qinghe.proxy
 * @author 清禾 (zjwei0421@163.com)
 * @date 2019/3/31 12:47 AM
 */
package com.qinghe.proxy;

import com.qinghe.dao.UserDao;
import org.springframework.stereotype.Component;

/**
 * <p>  </p> 
 *
 * @author 清禾 (zjwei0421@163.com)
 * @date 2019/3/31 12:47 AM
 * @since V1.0
 */
@Component
public class UserDaoLogProxy implements UserDao {

	private UserDao target;


	public UserDaoLogProxy(UserDao target) {
		this.target = target;
	}

	@Override
	public void query() {
		System.out.println("-------logging-------");
		target.query();
	}

	@Override
	public String query(String s) {
		return null;
	}
}
