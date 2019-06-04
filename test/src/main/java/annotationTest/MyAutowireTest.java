package annotationTest;

import pojo.Action;
import pojo.People;

public class MyAutowireTest {
	
	@MyAutowire
	private Action ac;
	public static void main(String[] args) {
		People people = new People();
		System.out.println(people.getName());
		System.out.println(people.getAge());
	}
}
