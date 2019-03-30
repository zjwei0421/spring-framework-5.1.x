/**
 *
 * @Package com.qinghe.dao
 * @author 清禾 (zjwei0421@163.com)
 * @date 2019/3/31 12:32 AM
 */
package com.qinghe.dao;

import org.springframework.stereotype.Repository;

/**
 * <p>  </p> 
 *
 * @author 清禾 (zjwei0421@163.com)
 * @date 2019/3/31 12:32 AM
 * @since V1.0
 */
@Repository
public class UserDaoImpl implements UserDao {
	@Override
	public void query() {
		System.out.println("query");
	}

	@Override
	public String query(String s) {
		return s;
	}
}
