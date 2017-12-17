package com.cmos.ha.cmms.gearbx;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cmos.ha.cmms.gearbx.config.RootConfig;
import com.cmos.ha.cmms.gearbx.service.DubboServiceTest;

/**
 * @author lixinjie
 * @since 2017-12-17
 */
public class GearbxApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext rootAppContext = new AnnotationConfigApplicationContext(RootConfig.class);
		DubboServiceTest ds = rootAppContext.getBean(DubboServiceTest.class);
		System.out.println(ds.sayHello("李新杰"));
		try {
			synchronized (GearbxApplication.class) {
				GearbxApplication.class.wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		rootAppContext.close();
	}

}
