package com.security.acl.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages= "com.security.acl.repository")
@PropertySource("classpath:application.yml")
@EntityScan(basePackages = "com.security.acl.domain")
public class JPAPersistenceConfig {
}
