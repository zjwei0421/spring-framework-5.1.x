/**
 * Allrights Reserved,Designed By www.maihaoche.com
 *
 * @Package com.qinghe.example
 * @author 清禾 (qinghe@maihaoche.com)
 * @date 2019/4/12 3:32 PM
 * @Copyright 2017-2018 www.maihaoche.comInc.Allrightsreserved.
 * 注意: 本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业项目
 */
package com.qinghe.example;

import com.qinghe.service.MessageService;
import com.qinghe.service.MessageServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>  </p> 
 *
 * @author 清禾 (qinghe@maihaoche.com)
 * @date 2019/4/12 3:32 PM
 * @since V1.0
 */
public class XmlMain {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("classpath:spring.xml");
		System.out.println("context 启动成功");
		MessageService service = context.getBean(MessageService.class);
		System.out.println(service.getMessage());

	}
}
