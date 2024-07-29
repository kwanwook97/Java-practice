package chapter04.ex07;

public class Cast {

	public static void main(String[] args) {
		Mammal m = new Mammal();
		Mammal c = new Cat();
		Mammal d = new Dog();
		
		Mammal mal = null;
		
		// 부모형태로 묵시적 형변환(다형성)하면
		mal = new Dog();
		mal.birth();
		mal.eat();
		// mal.bark();    // 개의 고유특성(자기 메서드)는 사용할 수 없다.
		
		// 나의 고유특성을 살리고싶다면?
		// 나의 특성(집)으로 되돌아 가야한다.
		// 이것을 명시적형변환(Casting)이라고 한다.
		Dog dog = (Dog)mal;     
		dog.bark();
		
		/* 캐스팅시 본인의 원형이 아닌 형태로 돌아가려고하면
		ClassCastException을 만나게 된다.
		Cat cat = (Cat)mal;
		cat.mew();
		*/
		
		// 상속받은 자식객체가 캐스팅시 헷갈리는 경우가 많다.
		// 이럴경우 아래와 같이 확인 가능하다.
		if(mal instanceof Cat) { // 원형을 확인하는 키워드
			Cat cat = (Cat)mal;
		}else {
			System.out.println("집 잘못 찾아 오셨어요.");
		}
		
	}

}
