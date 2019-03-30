/**
 * Allrights Reserved,Designed By www.maihaoche.com
 *
 * @Package com.qinghe.config
 * @author 清禾 (qinghe@maihaoche.com)
 * @date 2019/3/31 12:26 AM
 * @Copyright 2017-2018 www.maihaoche.comInc.Allrightsreserved.
 * 注意: 本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业项目
 */
package com.qinghe.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * <p>  </p> 
 *
 * @author 清禾（qinghe@maihaoche.com）
 * @date 2019/3/31 12:26 AM
 * @since V1.0
 */
@Configuration
@ComponentScan("com.qinghe")
@EnableAspectJAutoProxy
public class AppConfig {
}
