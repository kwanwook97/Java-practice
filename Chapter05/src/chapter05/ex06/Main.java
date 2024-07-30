package chapter05.ex06;

public class Main {

	public static void main(String[] args) {
		
		
		VingsuConcrete maker = new VingsuConcrete();
		
		maker.makeVingsu(new RedBeanVingsu());
		maker.makeVingsu(new ChocoVingsu());
		maker.makeVingsu(new CookieVingsu());

	}

}