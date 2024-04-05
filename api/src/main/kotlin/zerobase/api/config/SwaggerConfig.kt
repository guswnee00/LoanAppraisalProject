package zerobase.api.config

import org.springframework.context.annotation.Bean
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket

class SwaggerConfig {
    // http://localhost:8080/swagger-ui/index.html
    @Bean
    fun api(): Docket {
        return Docket(DocumentationType.OAS_30)
            .useDefaultResponseMessages(false)
            .select()
            .apis(RequestHandlerSelectors.basePackage("zerobase.api"))
            .paths(PathSelectors.any())
            .build()
            .apiInfo(apiInfo())
    }

    private fun apiInfo(): ApiInfo {
        return ApiInfoBuilder()
            .title("Swagger")
            .description("fintech")
            .version("1.0")
            .build()
    }
}