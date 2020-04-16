package p04001;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		KoreaFood koreaFood = new KoreaFood();
		ChianFood chinaFood = new ChinaFood();
		
		GlobalFood globalFood = new GlobalFood();
		
		globalFood.makeFood(koreaFood); // korea food
		globalFood.makeFood(chinaFood); // china food
		*/
		
		/*
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		GlobalFood food = ctx.getBean("gFood", GlobalFood.class);
		
		food.makeFood(ctx.getBean("kFood", KoreaFood.class));
		food.makeFood(ctx.getBean("cFood", ChinaFood.class));
		
		ctx.close();
		*/
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(FoodConf.class);
		
		GlobalFood food = ctx.getBean("gFood", GlobalFood.class);
		
		food.makeFood(ctx.getBean("kFood", KoreaFood.class));
		food.makeFood(ctx.getBean("cFood", ChinaFood.class));
		
		ctx.close();
		
	}

}
