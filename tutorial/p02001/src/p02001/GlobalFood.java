package p02001;

public class GlobalFood {
	
	public GlobalFood() {
		System.out.println(" --- GlobalFood() Construct ---");
	}
	
	public void makeFood(IFood food) {
		System.out.println(" --- makeFood() START ---");
		food.makeFood();
	}
	
}
