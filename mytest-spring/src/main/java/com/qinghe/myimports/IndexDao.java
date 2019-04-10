/**
 * Allrights Reserved,Designed By www.maihaoche.com
 *
 * @Package com.qinghe.myimports
 * @author 清禾 (qinghe@maihaoche.com)
 * @date 2019/4/10 2:44 PM
 * @Copyright 2017-2018 www.maihaoche.comInc.Allrightsreserved.
 * 注意: 本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业项目
 */
package com.qinghe.myimports;

import org.springframework.stereotype.Component;

/**
 * <p>  </p> 
 *
 * @author 清禾 (qinghe@maihaoche.com)
 * @date 2019/4/10 2:44 PM
 * @since V1.0
 */
@Component
public class IndexDao implements Dao {

	@Override
	public void query() {
		System.out.println("query");
	}
}
