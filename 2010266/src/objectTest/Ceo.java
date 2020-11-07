package objectTest;

public class Ceo extends Employee {
	
	@Override
	public void eatLunch() {
		System.out.println("CEO가 점심을 냠냠 합니다.");
	}

	public void goHome() {
		System.out.println("CEO가 고급세단으로 집으로 갑니다.");
	}

}
