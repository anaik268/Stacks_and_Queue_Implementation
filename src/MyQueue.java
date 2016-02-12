
public class MyQueue<T> {
	private static class QueueNode<T> {
		private T value;
		private QueueNode<T> next;

		public QueueNode(T value) {
			this.value = value;
		}
	}

	QueueNode<T> front, tail;

	public void add(T value) {
		QueueNode<T> temp = new QueueNode<T>(value);
		if (tail != null)
			tail.next = temp;
		tail = temp;
		if (front == null)
			front = tail;
	}

	public T remove() {
		if (front == null)
			throw new NullPointerException();
		T val = front.value;
		front = front.next;
		return val;
	}

	public T peek() {
		if (front == null)
			throw new NullPointerException();
		return front.value;
	}

	public boolean isEmpty() {
		return front == null;
	}
}
