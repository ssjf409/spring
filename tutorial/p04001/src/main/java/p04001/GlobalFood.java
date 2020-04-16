package p04001;

public class GlobalFood {
	
	public GlobalFood() {
		// TODO Auto-generated constructor stub
		System.out.println(" --- GolbalFood() Construct ---");
	}
	
	public void makeFood(IFood food) {
		System.out.println(" --- makeFood() START ---");
		food.makeFood();

	}
}
