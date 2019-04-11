/**
 * Allrights Reserved,Designed By www.maihaoche.com
 *
 * @Package com.qinghe.cglib.example
 * @author 清禾 (qinghe@maihaoche.com)
 * @date 2019/4/11 2:29 PM
 * @Copyright 2017-2018 www.maihaoche.comInc.Allrightsreserved.
 * 注意: 本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业项目
 */
package com.qinghe.cglib.example;


import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

/**
 * <p>  </p> 
 *
 * @author 清禾 (qinghe@maihaoche.com)
 * @date 2019/4/11 2:29 PM
 * @since V1.0
 */
public class InfoManagerFactory {

	private static InfoManager manger = new InfoManager();
	/**
	 * 创建原始的InfoManager
	 *
	 * @return
	 */
	public static InfoManager getInstance() {
		return manger;
	}

	/**
	 * 创建原始的InfoManager
	 *
	 * @return
	 */
	public static InfoManager getAuthInstance(AuthProxy authProxy) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(InfoManager.class);
		enhancer.setCallbacks(new Callback[]{authProxy, new LogProxy(), NoOp.INSTANCE});
		enhancer.setCallbackTypes(new Class[]{AuthProxy.class, LogProxy.class, NoOp.INSTANCE.getClass()});
		enhancer.setCallbackFilter(new AuthProxyFilter());
		return (InfoManager) enhancer.create();
	}
}
