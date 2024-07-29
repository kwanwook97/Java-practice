package chapter03.ex07.readonly;

public class Main {

	public static void main(String[] args) {
		Person p = new Person("KOREA", "강관욱");
		
		// final은 read only이므로 생성자에서 초기화 후 값을 변경할 수 없다.
//		p.name = "kwanwook";
//		p.nation = "한국";		
		
		System.out.println(p.name);
		System.out.println(p.nation);
		System.out.println(Person.ssn);      

	}

}
