package p04001;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FoodConf {
	
	@Bean
	public KoreaFood kFood() {
		return new KoreaFood();
	}
	
	@Bean
	public ChinaFood cFood() {
		return new ChinaFood();
	}
	
	@Bean
	public GlobalFood gFood() {
		return new GlobalFood();
	}
	
}
