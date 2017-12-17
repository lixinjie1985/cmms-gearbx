package com.cmos.ha.cmms.gearbx.service;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cmos.ha.cmms.dubbo.IDubboService;

/**
 * @author lixinjie
 * @since 2017-12-17
 */
@Service
public class DubboServiceTest {

	@Reference
	private IDubboService dubboService;
	
	public String sayHello(String who) {
		return dubboService.sayHello(who);
	}
}
