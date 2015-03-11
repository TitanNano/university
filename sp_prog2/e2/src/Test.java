import Misc.*;
import Silly.Stack;
import SketchBook.List;

public class Test {
	public static void main(String[] args) {
		Circle c1 = new Circle(5, 7, 10);
		Circle c2 = new Circle(5, 7, 10);
		Rectangle rect = new Rectangle(3, 4, 2, 2);
		Console console = new Console();
		Stack<String> stack= new Stack<String>();

		c1.equals((Object) c2);

		console.log("Radius", c1.getArea());
		console.log("Circle 1 and 2 are", c1.equals(c2));
		console.log(c1.toString());
		console.log(rect.toString());

		List testList= new List();
		console.log(testList.get(5));

		testList.add(c1);
		testList.add(rect);
		testList.add(c2);

		console.log(testList.get(1));
		console.log(testList.indexOf(c2));

		console.log("IS STACK EMPTY", stack.isEmpty());
		stack.push("test");
		console.log("PUSH ITEM");
		console.log("IS EMPTY", stack.isEmpty());
		console.log("POP ITEM", stack.pop());
	}
}
