package 창작배열실전;

public class 이일차골치아픈놈 {

	private static char[][] data = {
			// TODO Auto-generated method stub
			{ 'a', 'b', 'c', 'd', 'e', 'f', 'g' }, 
			{ 'h', 'i', 'j', 'k', 'l', 'm', 'n' },
			{ 'o', 'p', 'q', 'r', 's', 't', 'u' },
			{ 'v', 'w', 'x', 'y', 'z', 'A', 'B' },
			{ 'C', 'D', 'E', 'F', 'G', 'H', 'I' }, 
			{ 'J', 'K', 'L', 'M', 'N', 'O', 'P' }
	};

	private static void howAccessData() {
		// 2차원 배열(행row,렬 column)에 담긴 원하는 원소 뽑기
		System.out.println(data[0][0]);// a
		System.out.println(data[0][6]);
		System.out.println(data[5][3]);
	}
	private static void drawRect() {
		// 42개의 데이타를 담겨있는 모양 그대로 출력
		for (int row = 0; row < data.length; row++) {//length 6
			for (int col = 0; col < data[row].length; col++) {
				System.out.print(data[row][col]);
			}
			System.out.println();
		
	}
	}
/**          row 출당출력개수
 * a         0    1  
 * hi		1	2							
 * opq		2	3
 * vwxy		3	4
 * CDEFG	4	5
 * JKLMNO	5	6
 */
	private static void drawTriangle() {
		for (int row = 0; row < data.length; row++){//length 6 {
			for (int col = 0; col <= row; col++) {
				System.out.print(data[row][col]);
			}
			System.out.println();
		}
	}

	private static void main(String[] args) {
		drawTriangle();
	}
}
