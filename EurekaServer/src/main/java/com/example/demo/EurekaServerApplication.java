package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@EnableEurekaServer
@EnableEurekaClient
@SpringBootApplication
/*@EnableConfigServer*/ 

public class EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	/*}
	@RequestMapping(value = "/")
	@HystrixCommand(fallbackMethod = "fallback_hello", commandProperties = {
	   @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000")
	})
	public String hello() throws InterruptedException {
	   Thread.sleep(3000);
	   return "Welcome Hystrix";
	}
	private String fallback_hello() {
	   return "Request fails. It takes long time to response";
	}*/

}
}
