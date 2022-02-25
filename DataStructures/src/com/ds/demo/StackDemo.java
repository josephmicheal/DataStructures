package com.ds.demo;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackNode<Integer> stack = new StackNode<Integer>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println(stack.peak());
		System.out.println(stack.pop());
		System.out.println(stack.peak());
	}

}


class StackNode<T>{
	
	StackNode<T> next;
	StackNode<T> previous;
	
	int length;
	T value;
	
	public StackNode() {
	}
	
	public StackNode(T currValue) {
		this.value = currValue;
	}
	
	public void push(T currValue) {
		StackNode<T> currNode = new StackNode<T>(currValue);
		if(next == null) {
			next = currNode;
		}else {
			next.next = currNode;
			currNode.previous = next;
			next = currNode;
		}
		length++;
	}
	
	public T peak() {
		if(next == null) {
			return null;
		}else {
			return next.value;
		}
	}
	
	public T pop() {
		if(next == null) {
			return null;
		}else {
			length--;
			T popVal = next.value;
			next = next.previous;
			if(this.next != null && next.next != null)
				next.next = null;
			return popVal;
		}
	}
}