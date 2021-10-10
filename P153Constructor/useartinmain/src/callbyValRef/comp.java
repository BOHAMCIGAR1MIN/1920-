package callbyValRef;

public class comp {
	int	age;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		age = 22;
		
		yearPass(age);
		
		System.out.println(age +"이 당신의 나이");
		
		comp cmp=new comp();
		
		yearPass(cmp);
		System.out.println(cmp.age+"이 당신의 나이");
	}
	public static void yearPass(int age) {
		age++;
		System.out.println(age +"이 당신의 나이");
	}
	public static void yearPass(comp obj) {
		obj.age++;
		System.out.println(obj.age + "이 당신의 나이");
	}
}
