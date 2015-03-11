using System;

namespace e3
{

	public class Circle : IDrawable{
		private Point center;
		private int radius = 1;

		public void setRadius(int radius) { this.radius = radius; }
		public int getRadius() { return radius; }

		public Pen Pen { get; set; }

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

		public override String ToString(){
			return "x = "+center.getX()+", y = "+center.getY()+", radius = "+radius;
		}

		public static bool operator ==(Circle a, Circle b){
			if(a.radius == b.radius && a.center == b.center){
				return true;
			}else{
				return false;
			}
		}

        public static bool operator !=(Circle a, Circle b){
			return (a.radius != b.radius && a.center != b.center);
		}

		public override bool Equals(object obj)
		{
			if (obj.GetHashCode() == this.GetHashCode())
			{
				return true;
			}
			else
			{
				return false;
			}
		}

		public override int GetHashCode()
		{
			string centerHash = center.GetHashCode().ToString();
			string hash = centerHash + "0" + radius;
			return Int32.Parse(hash);
		}
	}

}

