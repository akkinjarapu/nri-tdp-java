package day011;

public class Prog011 {
	int a;
	
	public Prog011() {
		a = 20;
	}
	
	public Prog011(int a) {
		this.a = a;
	}
	
	public Prog011(Prog011 p) {
		this.a = p.a;
	}

	@Override
	public String toString() {
		return "Prog011 [a=" + a + "]";
	}

}
