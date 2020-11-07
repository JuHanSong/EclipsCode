package multiinheritance;

public class Smartphone implements CellPhone, Computer, TeleVision{

	@Override
	public void watchTV() {
		System.out.println("스마트폰으로  TV를 봅니다");
	}

	@Override
	public void InterNet() {
		System.out.println("스마트폰으로 인터넷을 합니다.");
	}

	@Override
	public void Call() {
		System.out.println("스마트폰으로 전화를 합니다.");
	}
	

}
