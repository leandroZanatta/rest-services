package br.com.sysmo.rest.services;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class DataSourceAutoConfigurer {

    @Bean
    public DataSource getDataSource() {

        DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();

        dataSourceBuilder.driverClassName("org.postgresql.Driver");
        dataSourceBuilder.url("jdbc:postgresql://localhost:5432/lar");
        dataSourceBuilder.username("postgres");
        dataSourceBuilder.password("4fjJKS#2");
        dataSourceBuilder.type(HikariDataSource.class);
        return dataSourceBuilder.build();
    }

}
