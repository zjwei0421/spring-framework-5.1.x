/**
 * Allrights Reserved,Designed By www.maihaoche.com
 *
 * @Package com.qinghe.myimports
 * @author 清禾 (qinghe@maihaoche.com)
 * @date 2019/4/10 2:32 PM
 * @Copyright 2017-2018 www.maihaoche.comInc.Allrightsreserved.
 * 注意: 本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业项目
 */
package com.qinghe.myimports;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * <p>  </p> 
 *
 * @author 清禾 (qinghe@maihaoche.com)
 * @date 2019/4/10 2:32 PM
 * @since V1.0
 */
public class MyImportSelector implements ImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{AopSimulate.class.getName()};
	}
}
