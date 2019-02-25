package com.bionexo.ubsapi.swaggerdoc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
    public Docket ubsApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select().apis(RequestHandlerSelectors.basePackage("com.bionexo.ubsapi.resource"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(this.informationApi().build());
             
    }
	
	private ApiInfoBuilder informationApi() {
		 
		ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
 
		apiInfoBuilder.title("Api-BasicHealthUnit");
		apiInfoBuilder.description("Api for UBS location.");
		apiInfoBuilder.version("1.0");
		apiInfoBuilder.termsOfServiceUrl("Used for Bionexo challenge.");
		apiInfoBuilder.license("License - Open Source");
 
		return apiInfoBuilder;
 
	}
}
