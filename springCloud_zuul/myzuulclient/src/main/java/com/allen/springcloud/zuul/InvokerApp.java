package com.allen.springcloud.zuul;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 简单路由使用的过滤器类 SimpleHostRoutingFilter
 * 跳转路由使用的过滤器类 SendForwardFilter
 * ribbon面向服务的路由使用的过滤器类 RibbonRoutingFilter
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy //打开Zuul客户端功能的注解
public class InvokerApp {

	public static void main(String[] args) {
		new SpringApplicationBuilder(InvokerApp.class).web(true).run(args);
	}

}
