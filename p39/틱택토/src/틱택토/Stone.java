package 틱택토;
////e설정은 나열이라고 한다.
public enum Stone {
	Black('o'),white('x');
	
	private char shape;
	
	private Stone(char shape) {
		this.shape = shape;
}
	}
