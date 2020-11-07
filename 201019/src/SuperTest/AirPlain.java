package SuperTest;

public class AirPlain {
	protected String name;
	
	
	public AirPlain(String name) {
		this.name = name;
	} // 생성자
	
	public void fly() {
		System.out.println(name +"비행기가 하늘을 날라갑니다.");
		System.out.println("최대 속도는 900km/h 입니다.");
	}
}
