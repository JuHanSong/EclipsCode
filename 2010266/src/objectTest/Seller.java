package objectTest;

public class Seller extends Employee{

	@Override
	public void eatLunch() {
		System.out.println("Seller 가 점심을 먹습니다.");
	}
	
	public void goHome() {
		System.out.println("Seller 가 집으로 갑니다,");
	}
	
}
