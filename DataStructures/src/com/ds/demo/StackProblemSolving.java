package com.ds.demo;

public class StackProblemSolving {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackNode<String> stack = new StackNode<String>();
		
		String input ="{[]()}}";
		
		for(char curr : input.toCharArray()) {
			if(((curr+"").equals("}") && "{".equals(stack.peak()))
					|| ((curr+"").equals("]") && "[".equals(stack.peak()))
					|| ((curr+"").equals(")") && "(".equals(stack.peak())))
				stack.pop();
			else
				stack.push(curr+"");
		}

		System.out.println(stack.length);
	}

}
