using System;

namespace e3{

	public class Point : IDrawable{
		private int x = 0;
		private int y = 0;

		public void setX(int x) { this.x = x; }
		public void setY(int y) { this.y = y; }

		public int getX() { return x; }
		public int getY() { return y; }

		public Pen Pen { get; set; }

		public Point() {}

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public override String ToString(){
			return "("+x+"|"+y+")";
		}

		public static bool operator ==(Point a, Point b){
			if(a.x == b.x && a.y == b.y){
				return true;
			}else{
				return false;
			}
		}

        public static bool operator !=(Point a, Point b){
			if(a.x != b.x && a.y != b.y){
				return true;
			}else{
				return false;
			}
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
			string x = this.x.ToString();
			string y = this.y.ToString();
			string hash = x + "0" + y;

			return Int32.Parse(hash);
		}
	}

}

