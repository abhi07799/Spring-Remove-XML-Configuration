package tutorial.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationClass 
{
	
	@Bean
	public ExampleClass getObject()
	{
		return new ExampleClass(); 
	}
}
