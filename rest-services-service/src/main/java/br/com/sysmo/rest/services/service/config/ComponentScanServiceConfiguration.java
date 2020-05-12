package br.com.sysmo.rest.services.service.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration()
@ComponentScan(basePackages = { "br.com.sysmo.rest.services.repository" }, lazyInit = false)
public class ComponentScanServiceConfiguration {

}
