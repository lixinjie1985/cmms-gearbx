package com.cmos.ha.cmms.gearbx.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.cmos.ha.cmms.gearbx.config.dubbo.DubboConfig;

/**
 * @author lixinjie
 * @since 2017-12-17
 */
@Import(DubboConfig.class)
@ComponentScan(basePackages = {"com.cmos.ha.cmms.gearbx.service"})
@Configuration
public class RootConfig {

}
