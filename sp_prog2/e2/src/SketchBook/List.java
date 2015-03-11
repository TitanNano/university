package SketchBook;

public class List {
	protected ListNode first;
	protected ListNode last;
	protected int length;

	public List(){
		length= 0;
	}

	public List(ListNode first){
		length= 0;
		this.add(first);
	}

	public int add(Object item){
		ListNode nextNode= new ListNode(item);

		if (first == null){
			first= nextNode;
		}

		if(last != null){
			last.next= nextNode;
		}

		nextNode.last= last;
		last= nextNode;
		length++;
		return length-1;
	}

	public void remove(int index){
		ListNode item= this.getNode(index);
		ListNode last= item.getLast();
		ListNode next= item.getNext();

		last.next= next;
		next.last= last;
		length--;

		if(this.first == item){
			this.first= item.getNext();
		}

		if(this.last == item){
			this.last= item.getLast();
		}
	}

	protected ListNode getNode(int index){
		ListNode current= this.first;
		for(int i= 0; i < index; i++){
			if(current == null){
				return new ListNode(null);
			}
			current= current.next;
		}

		return current;
	}

	public Object get(int index){
		return this.getNode(index).getContent();
	}

	public int indexOf(Object item){
		ListNode current= this.first;
		for(int i= 0; i < this.length; i++){
			if(current.getContent() == item){
				return i;
			}
			current= current.getNext();
		}
		return -1;
	}

	public int length(){
		return this.length;
	}
}
