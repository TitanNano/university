**Studienleistung Programmieren 2 Teil 4 - Jovan Gerodetti**

###Studienleistung Programmierung II Teil 4
####Teil A - Datenstrukturen

Stack.java:
```java
package Silly;

import java.util.ArrayList;
import java.util.List;

public class Stack<E> {
	private List<E> list;
	
	public Stack(){
		list= new ArrayList<E>();
	}
	
	public void push(E item){
		list.add(item);
	}
	
	public E pop(){
		return list.remove(list.size() - 1);
	}
	
	public boolean isEmpty(){
		return list.isEmpty();
	}
}
```

Test.java:  
```java
import Misc.*;
import Silly.Stack;

public class Test {
	public static void main(String[] args) {
		Console console = new Console();
		Stack<String> stack= new Stack<String>();
        console.log("IS STACK EMPTY", stack.isEmpty());
		stack.push("test");
		console.log("PUSH ITEM");
		console.log("IS EMPTY", stack.isEmpty());
		console.log("POP ITEM", stack.pop());
	}
}
```

####Teil B - "Geometrische Objekte"
siehe bitbucket --> https://bitbucket.org/TitanNano/vectorsketchbook
