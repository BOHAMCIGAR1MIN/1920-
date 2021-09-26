package 연습용프로젝트1;

public class n20케이스동시쓰기 {

	public static void main(String[] args) {
		
		int floor = 2;
		char name;
	
		switch(floor) {
		case 1 : System.out.println(floor+"층"+"약국입니다.");
		break;
		case 2 : System.out.println(floor+"층"+"정형외과입니다.");
		break;
		case 3 : System.out.println(floor+"층"+"피부과입니다.");
		break;
		case 4 : System.out.println(floor+"층"+"치과입니다");
		break;
		default : System.out.println(floor+"층"+"헬스클럽입니다");
		break;
		}
		//굳이 층을 저리 안써도돼
	}
}