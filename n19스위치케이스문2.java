package 연습용프로젝트1;

public class n19스위치케이스문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 스위치치 케이스 문으로 등급표를 만들어라
		int ranking = 1;
		char medalcoler;
		
		switch (ranking) {
		case 1 : medalcoler = '금';
				break;
		case 2 : medalcoler = '은';
				break;
		case 3 : medalcoler = '동';
				break;
		default :
				medalcoler =	'a';
		}
		System.out.println(ranking+"등 메달은"+medalcoler+"입니다");
	}

}
