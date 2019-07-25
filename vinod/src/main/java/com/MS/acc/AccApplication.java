Opackage com.MS.acc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import com.MS.controller.LoadBal;

@EnableEurekaServer
@EnableDiscoveryClient
@EnableZuulProxy
@SpringBootApplication
@EnableHystrixDashboard
@EnableCircuitBreaker
@RibbonClient(name = "say Laod", configuration = LoadBal.class)

public class AccApplication {
	
	 @Bean
	    public MessageSource messageSource() {
	        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
	        messageSource.setBasename("classpath:messages");
	        messageSource.setDefaultEncoding("UTF-8");
	        return messageSource;
	    }
	
	    @Bean
	    public LocalValidatorFactoryBean validator() {
	        LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
	        bean.setValidationMessageSource(messageSource());
	        return bean;
	    }


	public static void main(String[] args) {
		SpringApplication.run(AccApplication.class, args);
	}

}

