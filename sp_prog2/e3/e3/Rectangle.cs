using System;

namespace e3
{

	public class Rectangle : IDrawable{

		private Point origin;
		private int heigh;
		private int width;

		public Pen Pen { get; set; }

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

		public static bool operator ==(Rectangle a, Rectangle b){
			return (a.origin == b.origin && a.heigh == b.heigh && a.width == b.width);
		}

        public static bool operator !=(Rectangle a, Rectangle b){
			return (a.origin != b.origin && a.heigh != b.heigh && a.width != b.width);
		}

		public override String ToString() {
			return "origin = "+origin.ToString()+", height = "+heigh+", width = "+width;
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
			string centerHash = origin.GetHashCode().ToString();
			string hash = centerHash + "0" + heigh + "0" + width;

			return Int32.Parse(hash);
		}

	}

}

