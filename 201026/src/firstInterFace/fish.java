package firstInterFace;

public class fish implements Aquatic {

	@Override
	public void swimming() {
		System.out.println("물고기가 수영을 합니다.");
		
	}

	@Override
	public void breathUnderWater() {
		System.out.println("물고기가 물속에서 호흡합니다.");
		
	}
	

}
