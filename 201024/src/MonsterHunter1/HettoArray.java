package MonsterHunter1;

public class HettoArray {

	public static void main(String[] args) {
		Monster[] mArr = new Monster[4];
		
		Orc o1 = new Orc();
		Orc o2  = new Orc();
		Orc o3 = new Orc();
		
		Golem g1 = new Golem();
		
		mArr[0] = o1;
		mArr[1] = o2;
		mArr[2] = o3;
		mArr[3] = g1;
		
		for(int i = 0; i < mArr.length; i ++) {
			System.out.println(mArr[i].getName());
		}

	}

}
