package p91contorflow;

import java.util.scanner;

public class Daysofmonth {

	public static void main(String[] args) {
		scanner in = new scanner(system.in);
		
		System.out.print("해당월을 입력하시오:");
		int month = in.nextint();
		int days; = -1
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			days = 31;
			break;
		case 2:
			days =28;
			break;
		default:
			systemm.out.print("월은 1~12사이의 값으로 입력하세요");
		}
		System.out.print("희망월의 날짜는+ days +" 입니다);
	}

}
