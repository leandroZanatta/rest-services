package br.com.sysmo.rest.services.service.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration()
@ComponentScan(basePackages = { "br.com.sysmo.rest.services.repository" }, lazyInit = false)
public class ComponentScanServiceConfiguration {

}
