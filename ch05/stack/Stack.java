package ch05.stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack<E> {
	private E[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	@SuppressWarnings("unchecked")
	public Stack() {
		//this.elements = new E[DEFAULT_INITIAL_CAPACITY];
		this.elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
	}

	public void push(E e) {
		ensureCapacity();
		elements[size++] = e;
	}

	public E pop() {
		if(size == 0) throw new EmptyStackException();
		E result = elements[--size];
		elements[size] = null;
		return result;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	private void ensureCapacity() {
		if(elements.length == size) elements = Arrays.copyOf(elements, 2 * size + 1);
	}

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("TEST");
		System.out.println(stack.pop());
	}
}
