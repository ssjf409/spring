package p02001;

public class MainClass {

	public static void main(String[] args) {
		
		KoreaFood koreaFood = new KoreaFood();
		ChinaFood chinaFood = new ChinaFood();
		
		GlobalFood food = new GlobalFood();
		food.makeFood(koreaFood);
		food.makeFood(chinaFood);

	}
	
}
