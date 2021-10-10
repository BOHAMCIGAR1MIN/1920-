package Constructor;

public class person {

	String name;
	float height;
	float weight;

	public person() {}
	
	public person(String pname) {
		name = pname;
	}
	
	public person(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
}
}