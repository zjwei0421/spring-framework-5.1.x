/**
 * Allrights Reserved,Designed By www.maihaoche.com
 *
 * @Package com.qinghe.dao
 * @author 清禾 (qinghe@maihaoche.com)
 * @date 2019/4/3 9:40 PM
 * @Copyright 2017-2018 www.maihaoche.comInc.Allrightsreserved.
 * 注意: 本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业项目
 */
package com.qinghe.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * <p>  </p> 
 *
 * @author 清禾 (qinghe@maihaoche.com)
 * @date 2019/4/3 9:40 PM
 * @since V1.0
 */
@Component
public class IndexServiceImpl implements IndexService {

	@Autowired
	private UserDao userDao;

	private FacadeTest facadeTest;

	@Override
	public void query() {

	}
}
