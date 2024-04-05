package zerobase.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@EntityScan(basePackages = ["zerobase.domain"])
@ComponentScan(basePackages = ["zerobase"])
class ApiApplication

fun main(args: Array<String>) {
    runApplication<ApiApplication>(*args)
}