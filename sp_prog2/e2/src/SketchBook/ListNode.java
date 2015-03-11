package SketchBook;

public class ListNode {
	protected ListNode next;
	protected ListNode last;
	protected Object content;

	public ListNode(Object content){
		this.content= content;
	}

	public ListNode(Object content, ListNode last){
		this.content= content;
		this.last= last;
	}

	public ListNode getNext(){
		return next;
	}

	public void setNext(ListNode value){
		next= value;
	}

	public ListNode getLast(){
		return last;
	}

	public void setLast(ListNode last){
		this.last= last;
	}

	public Object getContent(){
		return this.content;
	}

	public void setContent(Object value){
		this.content= value;
	}
}
