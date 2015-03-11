
public class Rectangle extends GeometricalType{

	private Point origin;
	private int heigh;
	private int width;

	public Rectangle(){
		this.origin= new Point();
		this.heigh= 0;
		this.width= 0;
	}

	public Rectangle(Point origin, int heigh, int width) {
		this.origin= origin;
		this.heigh= heigh;
		this.width= width;
	}

	public Rectangle(int x, int y, int heigh, int width) {
		this.origin= new Point(x, y);
		this.heigh= heigh;
		this.width= width;
	}

	public boolean equals(Rectangle rect){
		return (this.origin.equals(rect.origin) && this.heigh == rect.heigh && this.width == rect.width);
	}

	@Override
	public String toString() {
		return "origin = "+origin.toString()+", height = "+heigh+", width = "+width;
	}

}
