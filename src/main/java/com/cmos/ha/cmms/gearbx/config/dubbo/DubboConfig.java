package com.cmos.ha.cmms.gearbx.config.dubbo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;

/**
 * @author lixinjie
 * @since 2017-12-17
 */
@Configuration
@DubboComponentScan(basePackages = {"com.cmos.ha.cmms.gearbx.service"})
public class DubboConfig {

	@Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("consumer-test");
        return applicationConfig;
    }
	
	@Bean
    public RegistryConfig registryConfig() {
		RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("127.0.0.1");
        registryConfig.setProtocol("zookeeper");
        registryConfig.setPort(2181);
        registryConfig.setClient("curator");
        return registryConfig;
    }
}
