package abs.good;

public class Store extends HeadStore {

	@Override
	public void orderApple() {
		System.out.println("사과쥬스의 가격은 3000원 입니다.");
	}

	@Override
	public void orderBanana() {
		System.out.println("바나나쥬스의 가격은 3200원 입니다.");		
	}

	@Override
	public void orderGrape() {
		System.out.println("포도쥬스의 가격은 3400원 입니다.");		
	}

	@Override
	public void orderMelon() {
		System.out.println("멜론쥬스의 가격은 3600원 입니다.");		
	}

}
