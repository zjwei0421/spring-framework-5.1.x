/**
 * Allrights Reserved,Designed By www.maihaoche.com
 *
 * @Package com.qinghe.dao
 * @author 清禾 (qinghe@maihaoche.com)
 * @date 2019/3/31 12:32 AM
 * @Copyright 2017-2018 www.maihaoche.comInc.Allrightsreserved.
 * 注意: 本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业项目
 */
package com.qinghe.dao;

import org.springframework.stereotype.Repository;

/**
 * <p>  </p> 
 *
 * @author 清禾（qinghe@maihaoche.com）
 * @date 2019/3/31 12:32 AM
 * @since V1.0
 */
@Repository
public class UserDaoImpl implements UserDao {
	@Override
	public void query() {
		System.out.println("query");
	}
}
