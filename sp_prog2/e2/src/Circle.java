
public class Circle{
	private Point center;
	private int radius = 1;

	public void setRadius(int radius) { this.radius = radius; }
	public int getRadius() { return radius; }

	public Circle() {
		this.center = new Point();
	}

	public Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	public Circle(int x, int y, int radius) {
		this.center = new Point(x, y);
		this.radius = radius;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	public boolean equals(Circle circle){
		if(this.radius == circle.radius && this.center.equals(circle.center)){
			return true;
		}else{
			return false;
		}
	}
}
