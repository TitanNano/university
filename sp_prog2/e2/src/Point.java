
public class Point extends GeometricalType{
	private int x = 0;
	private int y = 0;

	public void setX(int x) { this.x = x; }
	public void setY(int y) { this.y = y; }

	public int getX() { return x; }
	public int getY() { return y; }

	public Point() {}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public boolean equals(Point point){
		if(this.x == point.x && this.y == point.y){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public String toString(){
		return "("+x+"|"+y+")";
	}
}
