package br.com.dynamicdev.zuulserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import br.com.dynamicdev.zuulserver.filters.ErrorFilter;
import br.com.dynamicdev.zuulserver.filters.PostFilter;
import br.com.dynamicdev.zuulserver.filters.PreFilter;
import br.com.dynamicdev.zuulserver.filters.RouteFilter;

@EnableZuulProxy
@SpringBootApplication
public class ZullServer {

	public static void main(String[] args) {
		SpringApplication.run(ZullServer.class, args);
	}

	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}

	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}

	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}

	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}

}
