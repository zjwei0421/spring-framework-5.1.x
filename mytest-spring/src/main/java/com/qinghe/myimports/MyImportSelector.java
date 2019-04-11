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

import com.qinghe.dao.UserDao;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.filter.AssignableTypeFilter;
import org.springframework.core.type.filter.TypeFilter;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
		Map<String, Object> annotationAttributes = importingClassMetadata.getAnnotationAttributes(ComponentScan.class.getName());
		String[] basePackages = (String[]) annotationAttributes.get("basePackages");
		ClassPathScanningCandidateComponentProvider scanner = new ClassPathScanningCandidateComponentProvider(false);
		TypeFilter helloServiceFilter = new AssignableTypeFilter(UserDao.class);
		scanner.addIncludeFilter(helloServiceFilter);
		Set<String> classes = new HashSet<>();
		for (String basePackage : basePackages) {
			scanner.findCandidateComponents(basePackage).forEach(beanDefinition -> classes.add(beanDefinition.getBeanClassName()));
		}
//		return classes.toArray(new String[classes.size()]);

		return new String[]{AopSimulate.class.getName()};
	}
}
