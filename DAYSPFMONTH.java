package 연습용수업용프로젝스p92_conditionstmt;

public class DAYSPFMONTH {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("해당월을 입력하세요 : ");
		int month =in.nextint():
		int days =-1;
		switch(month) {
		case 1 :case 3:case	5:case	7:case	8:case	10:case	12:
			days =30;
			break;
		case 2 : case 6: case 9: case11:
			break;
		default:
			System.out.println("월은 1~12 사이의 값으로 입력하세요");
		}
		System.out.println("해당월의 날짜는"+days+"입니다.");	

	}

}
