package prob2;

public class Duck extends Bird {
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
		System.out.println("오리("+this.name+")는 소리내어 웁니다");
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("오리("+this.name+")는 날지않습니다");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String c="오리의이름은"+this.name+"입니다";
		return c;
	}

	
	
}
