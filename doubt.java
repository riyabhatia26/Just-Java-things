//when in doubt, kill a man.

public class doubt{
	public static void main(String[] args){
		B x = new B();
		B.met();
	}
}

class A{
	A(){
		System.out.println("A");
		met();
	}

	void met(){
		System.out.println("Parent");
	}
}

class B extends A{
	B(){
		System.out.println("B");
	}

	void met(){
		System.out.println("Child");
	}
}
