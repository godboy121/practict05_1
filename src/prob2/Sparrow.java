package prob2;

public class Sparrow extends Bird {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("참새("+this.name+")는 소리내어 웁니다");
		
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("참새("+this.name+")는 날아다닙니다");
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String c="참새의이름은"+this.name+"입니다";
		return c;
	}

	
}
