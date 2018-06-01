package com.msolo.config;

import org.omg.CORBA.Environment;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;

@Configuration
@EnableJpaRepositories ("com.msolo.repository")
@EnableTransactionManagement
@PropertySource("classpath:db.properties")
@ComponentScan("com.msolo")
public class DatabaseConfig {

    @Resource
    private Environment env;

}
