package 틱택토;

import java.util.ArrayList;
import java.util.List;

public class Cell {

		private Stone 놓인돌 = null;
		// TODO Auto-generated method stub
		private List<Line> lines = new ArrayList<>();
		//Line 아 너가 신경써야하는것은 셀이란다.
		//리스트 설명
		public void addCell(Line line) {
			lines.add(line);
			//리턴이 없으므로 void 소문자 셀이 대문자 셀을
			///신경써라 는의미
			
		}
		public int getAttachecLineCount() {
			return lines.size();
		}
		
}
