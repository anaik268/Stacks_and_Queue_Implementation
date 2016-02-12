
public class MyStack<T> {
	private static class StackNode<T> {
		private T value;
		private StackNode<T> next;

		public StackNode(T value) {
			this.value = value;
		}
	}

	private StackNode<T> top;

	public void push(T value) {
		StackNode<T> t = new StackNode<T>(value);
		t.next = top;
		top = t;
	}

	public T peek() {
		if (top == null)
			throw new NullPointerException();
		return top.value;
	}

	public T pop() {
		if (top == null)
			throw new NullPointerException();
		T val = top.value;
		top = top.next;
		return val;
	}

	public boolean isEmpty() {
		return top == null;
	}

}
