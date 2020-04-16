package p03001;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		KoreaFood koreaFood = new KoreaFood();
		ChianFood chianFood = new ChianFood();
		
		GlobalFood globalFood = new GlobalFood();
		
		globalFood.makeFood(koreaFood); // korea food
		globalFood.makeFood(chianFood); // china food
		*/
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		GlobalFood food = ctx.getBean("gFood", GlobalFood.class);
		
		food.makeFood(ctx.getBean("kFood", KoreaFood.class));
		food.makeFood(ctx.getBean("cFood", ChianFood.class));
		
		ctx.close();
		
	}

}
