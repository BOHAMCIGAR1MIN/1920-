package Constructor;

public class personTest {

	public static void main(String[] args) {
		person personkim = new person();
		personkim.name = "김유신";
		personkim.weight = 85.5F;
		personkim.height = 180.0F;
		
		person personLee =new person("이순신",175,75);
	}

}
