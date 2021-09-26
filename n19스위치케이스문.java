package 연습용프로젝트1;

public class n19스위치케이스문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rank =1;
		char medalColor;
		
		switch(rank) {
		case 1:medalColor  = 'g';
				break;
		case 2:medalColor  = 's';
				break;		
		case 3:	medalColor = 'b';
				break;
		default:medalColor = 'a';		
		}
		System.out.println(rank+"동 메달의 색깔은"+ "입니다");
	}

}
