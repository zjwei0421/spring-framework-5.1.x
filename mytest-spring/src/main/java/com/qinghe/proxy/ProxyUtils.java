/**
 * @Package com.qinghe.proxy
 * @author 清禾 (zjwei0421@163.com)
 * @date 2019/3/31 1:09 AM
 */
package com.qinghe.proxy;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * <p> 模拟JDK动态代理 </p>
 *
 * @author 清禾 (zjwei0421@163.com)
 * @date 2019/3/31 1:09 AM
 * @since V1.0
 */
public class ProxyUtils {

	public static Object newInstance(Object target) {

		//换行符
		String line = "\n";
		//缩进
		String tab = "\t";
		//接口
		Class interfaceName = target.getClass().getInterfaces()[0];
		//接口方法
		Method[] methods = interfaceName.getDeclaredMethods();
		String methodContent = "";
		//组装方法
		for (Method method : methods) {
			String methodName = method.getName();
			Class retureTypes = method.getReturnType();
			Class[] paramTypes = method.getParameterTypes();
			String paramContent = "";
			String param = "";
			Integer flag = 0;
			//组装方法参数
			for (Class paramType : paramTypes) {
				paramContent += paramType.getSimpleName() + " p" + flag + ",";
				param += "p" + flag + ",";
			}
			if(paramTypes.length > 0) {
				paramContent = paramContent.substring(0, paramContent.lastIndexOf(",")-1);
				param = param.substring(0, param.lastIndexOf(",")-1);
			}
			String returnStr = "";
			if("void".equals(retureTypes.getSimpleName())) {
				returnStr = tab+tab+"target."+methodName+"("+param+");";
			}
			else {
				returnStr = tab+tab+"return target."+methodName+"("+param+");";
			}
			methodContent += tab + "public " + retureTypes.getSimpleName()  +" " + methodName + " (" + paramContent + ") {" +line
					+ tab + tab + "System.out.println(\"------logging----\");" + line
					+ returnStr+line
					+tab+"}" + line + line;
		}

		try {
			String source = "package com.qinghe;" + line + line
					+ "import " + interfaceName.getName() +";"+ line + line
					+ "public class $Proxy implements " + interfaceName.getSimpleName() + "{" + line + line
					+ tab + "private " + interfaceName.getSimpleName() + " target;" + line + line
					+ tab + "public $Proxy (" + interfaceName.getSimpleName()+" target) {" +line
					+ tab + tab + "this.target = target;" + line
					+ tab +"}" + line + line
					+ methodContent + line
					+ "}";
			File file = new File("/Users/shuimu/com/qinghe/$Proxy.java");
			FileWriter fw = new FileWriter(file);
			fw.write(source);
			fw.flush();
			fw.close();
			//加载到JVM
			JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
			StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);
			Iterable units = fileManager.getJavaFileObjects(file);
			JavaCompiler.CompilationTask task = compiler.getTask(null, fileManager, null, null, null, units);
			task.call();
			fileManager.close();
			//loader
			URL[] urls = new URL[]{new URL("file:///Users/shuimu/")};
			URLClassLoader classLoader = new URLClassLoader(urls);
			Class clazz = classLoader.loadClass("com.qinghe.$Proxy");
			Constructor constructor = clazz.getConstructor(interfaceName);
			Object proxy = constructor.newInstance(target);
			return proxy;
		} catch(Exception e) {
			e.printStackTrace();
		}

		return null;
	}
}
