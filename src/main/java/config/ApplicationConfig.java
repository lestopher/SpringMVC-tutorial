/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "controller" })
public class ApplicationConfig extends WebMvcConfigurerAdapter {

	//@Override
	//public void addResourceHandlers(ResourceHandlerRegistry registry) {
		//registry.addResourceHandler("/css/**").addResourceLocations("/css/");
		//registry.addResourceHandler("/img/**").addResourceLocations("/img/");
		//registry.addResourceHandler("/js/**").addResourceLocations("/js/");
	//}

	@Override
	public void configureDefaultServletHandling(
			DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

	@Bean
	public InternalResourceViewResolver getInternalResourceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/pages/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

}
