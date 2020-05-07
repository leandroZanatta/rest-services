package br.com.sysmo.rest.services.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = { "br.com.sysmo.rest.services.repository" })
public class JpaConfiguration {

}
