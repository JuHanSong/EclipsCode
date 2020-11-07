package firstInterFace;

public class Tutle implements Aquatic {

	@Override
	public void swimming() {
		System.out.println("거북이가 수영을 합니다.");
		
	}

	@Override
	public void breathUnderWater() {
		System.out.println("거북이가 물속에서 호흡합니다.");
		
	}
	
}
