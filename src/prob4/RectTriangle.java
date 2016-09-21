package prob4;


public class RectTriangle extends Shape {
	double width;
	double height;
	
	public RectTriangle(double w,double h)
	{
		this.width=w;
		this.height=h;
	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		double result=(this.width*this.height)/2;
		return result;
	}

	@Override
	double getParameter() {
		// TODO Auto-generated method stub
		double result=this.height+this.width+Math.sqrt((this.height*this.height)+(this.width*this.width));
		return result;
	}

	@Override
	public void resize(double s) {
		// TODO Auto-generated method stub
		
	}

}
