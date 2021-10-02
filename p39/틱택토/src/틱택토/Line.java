package 틱택토;

import java.util.ArrayList;
import java.util.List;

public class Line {
	private List<Cell> cells = new ArrayList<>();
		//Line 아 너가 신경써야하는것은 셀이란다.
		//리스트 설명
	
	
	public void addCell(Cell cell) {
			cells.add(cell);
			//리턴이 없으므로 void 소문자 셀이 대문자 셀을
			///신경써라 는의미
			cell.addLine(this);//
		}
	}
 