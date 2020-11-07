package SuperTest;

public class SupersonicAir extends AirPlain{
	
	private int spd;
	
	public SupersonicAir(String name, int spd) {
		super(name);
		this.spd = spd;
	}
	
	@Override
	public void fly() {
		if(spd > 900) {
		System.out.println(name + "비행기가 초음속 비행을 합니다.");
		System.out.println("MaxSpeed[km/h] = " + spd + "입니다." );
		}else {
			super.fly();
		}
	}
	
}
