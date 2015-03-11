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
