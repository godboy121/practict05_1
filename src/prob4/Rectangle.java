package prob4;

public class Rectangle extends Shape implements Resizable {
	double width;
	double height;
	
	public Rectangle(double w, double h)
	{
		this.width=w;
		this.height=h;
	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		double result=this.height*this.width;
		return result;
	}

	@Override
	double getParameter() {
		// TODO Auto-generated method stub
		double result=2*(this.height+this.width);
		return result;
	}

	@Override
	public void resize(double s) {
		this.height=height/2;
		this.width=width/2;
		
		// TODO Auto-generated method stub
		
		
		
	}

}
