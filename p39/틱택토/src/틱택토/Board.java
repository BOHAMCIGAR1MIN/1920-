package 틱택토;

import java.util.ArrayList;
import java.util.List;

///따라 써가며 솔직히 아는거만 체크해보자. 
			///창조는 무리고 일단 모방이다. 

public class Board {
	private static final int RooT=3;
	//3*3col=3row=3
	private Cell[][] cells = new Cell[RooT][RooT];
	//전체 9칸 이 2차원 배열로 하였음
	private List<Line> lines = new ArrayList<>();
	///new cell [RooT][RooT]컨트롤 시프트 o 자바 유틸처리 import
	///이유를 알고 싶습니다. 무슨기능인지 알고 싶습니다.
	/**
	 * 생성자 : 만들어지는 과정을 문장으로 채우는곳 이다 디폴트로 끌수 있다
	 * (){}
	 */
	public Board() {
		//9개의 칸을 만들어서 이를 Cell에 담들걸
		///나무위키 클래스 안에 작은 클래스 를 담을수 있다. 문법항목
			for(int row = 0; row < RooT; row++) {
				/// row는 영에서 루트 작을떄까지 1씩 추가한다. 
				
				for(int col = 0; col<RooT; row++) {
				/// col 로 변경했을뿐 상기와 같다.	
					cells[row][col] = new Cell();
				///책의 구구단 만들기와 같다 둘다 9까지 나온다,
			}
	}
	//수평 줄 만들기
			for(int row = 0; row < RooT; row++) {
			///상기와 같다 다만 aHoriLine에 넣는것뿐
			///여기서 하는 for( 초기화값;조건문;증감식 
				
				Line aHoriLine = new Line();
				///수평줄은 클래스 안에 클래스 즉 인스턴스가 만들어서 라인 이 만들었다.
				///아마도 여기 안에 넣을 장소가 만들어졌다. 
				for (int col = 0; col <RooT; col++) {
					//상기 for문을 말한다. 반대와 같다.
					aHoriLine.addCell(cells[row][col]);
					//수행문 8번 까지 수행할것이다.add는 왜?
					//태령이 조언 함수 부분적으로 써도 오케이 
					
				}
				lines.add(aHoriLine);///라인안에 만들어갔다는데 왜 라인인 막혀?
			}//수직 줄 만들기
			Line aDiogLine = new Line();///수직선을 인스턴스 처리
			for(int col = 0; col <RooT; col++) {
				Line aVertLine = new Line();
				for (int row = 0; row < RooT; row++) {
					//객체간 협력
					aVertLine.addCell(cells[row][col]);
					}
				lines.add(aVertLine);
			
			//-1기울기의 대각 줄 만들기
			 aDiogLine = new Line();
			for (int idx = 0; idx < RooT; idx++) {
				aDiogLine.addCell(cells[idx][idx]);
			}
			lines.add(aDiogLine);
	
			//1 기울기의 대각줄 만들기
			aDiogLine = new Line();
				for(int idx = 0; idx < RooT; idx++) {
					/// row는 영에서 루트 작을떄까지 1씩 추가한다. 
					aDiogLine.addCell(cells[idx][RooT- idx -1]);
				}
				lines.add(aDiogLine);
	}
			
	public void print() {
		for(int row = 0; row < RooT; row++)
			/// row는 영에서 루트 작을떄까지 1씩 추가한다. 
			{
			for(int col = 0; col<RooT; row++) {
			/// col 로 변경했을뿐 상기와 같다.	
				System.out.print(cells[row][col].getAttachecLineCount());
				}
		System.out.println();
		}
}
	public  static void main(String[] args) {
		Board board = new Board();
		
		board.print();
	}
}