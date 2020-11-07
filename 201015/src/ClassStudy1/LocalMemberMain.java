package ClassStudy1;

public class LocalMemberMain {

	public static void main(String[] args) {
		LocalMember localMember = new LocalMember();
		localMember.Member = "멤버 변수입니다.";
//		localMember.Local = "값을 바꾼 지역변수입니다.";
		localMember.showLocalMember();
		
	}

}
