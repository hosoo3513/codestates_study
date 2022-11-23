package com.codestates.section4week1filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfiguration {

    @Bean
    public FilterRegistrationBean<FirstFilter> firstFilterRegister() {
        return new FilterRegistrationBean<>(new FirstFilter());
    }
}
