package com.ikeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.env.SimpleCommandLinePropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.net.InetAddress;


@EnableTransactionManagement
@SpringBootApplication(scanBasePackages = { "com.ikeapp"})
@ConfigurationProperties
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Application {

	public static void main(String[] args) {

		//SpringApplication.run(Application.class, args);

		SpringApplication app = new SpringApplication(Application.class);
		SimpleCommandLinePropertySource source = new SimpleCommandLinePropertySource(args);
		addDefaultProfile(app, source);
		Environment env = app.run(args).getEnvironment();
	}

	private static void addDefaultProfile(SpringApplication app, SimpleCommandLinePropertySource source) {
		if (!source.containsProperty("spring.profiles.active") &&
				!System.getenv().containsKey("SPRING_PROFILES_ACTIVE")) {

			app.setAdditionalProfiles("dev");
		}
	}


}
