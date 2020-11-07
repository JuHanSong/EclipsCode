package objectTest;

public class Feeder extends Employee{
	
	@Override
	public void eatLunch() {
		System.out.println("Feeder가 점심을 먹습니다.");
	}

	public void goHome() {
		System.out.println("Feeder가 집으로 갑니다.");
	}
}
