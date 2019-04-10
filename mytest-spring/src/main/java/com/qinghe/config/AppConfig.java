/**
 *
 * @Package com.qinghe.config
 * @author 清禾 (zjwei0421@163.com)
 * @date 2019/3/31 12:26 AM
 */
package com.qinghe.config;


import com.qinghe.myimports.MyImportSelector;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

/**
 * <p>  </p> 
 *
 * @author 清禾 (zjwei0421@163.com)
 * @date 2019/3/31 12:26 AM
 * @since V1.0
 */
@Configuration
@ComponentScan("com.qinghe")
@Import(MyImportSelector.class)
public class AppConfig {
}
