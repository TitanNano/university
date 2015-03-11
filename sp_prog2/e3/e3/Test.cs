using System;

namespace e3
{
	public static class Test {
		public static void Main(String[] args) {
			Circle c1 = new Circle(5, 7, 10);
			Circle c2 = new Circle(5, 7, 10);
			Rectangle rect = new Rectangle(3, 4, 2, 2);

			Console.WriteLine("Radius: " + c1.getArea());
			Console.WriteLine("Circle 1 and 2 are: "+ (c1 == c2));
			Console.WriteLine(c1.ToString());
			Console.WriteLine(rect.ToString());
		}
	}
}
