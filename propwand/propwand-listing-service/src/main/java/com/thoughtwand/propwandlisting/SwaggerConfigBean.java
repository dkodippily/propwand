package com.thoughtwand.propwandlisting;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfigBean {
	@Bean
	public Docket swaggerConfig() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.thoughtwand.propwandlisting.api"))
				.build()
				.apiInfo(apiInfo());
	}
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.description("Create Properties for to list")
				.contact(new Contact("Rajitha", "rajitha@github", "rajitha@thoughtwand.com"))
				.license("Free to use and play with ;-)")
				.title("Property Listing Service")
				.version("0.0.1")
				.build();
	}
}
