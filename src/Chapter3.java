
public class Chapter3 {
	public static void main(String[] args) {
		int[] intArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		String[] strArr = { "hi", "my", "name", "is", "Abhishek" };
		char[] charArr = { 'a', 'b', 'h', 'i', 's', 'h', 'e', 'k' };

		MyStack<Integer> intStack = new MyStack<Integer>();
		MyStack<String> strStack = new MyStack<String>();
		MyStack<Character> charStack = new MyStack<Character>();

		for (int i = 0; i < intArr.length; i++) {
			intStack.push(intArr[i]);
		}
		for (int i = 0; i < strArr.length; i++) {
			strStack.push(strArr[i]);
		}
		for (int i = 0; i < charArr.length; i++) {
			charStack.push(charArr[i]);
		}

		System.out.println("Stack implementation test: ");
		printStack(intStack);
		printStack(strStack);
		printStack(charStack);

		MyQueue<Integer> intQueue = new MyQueue<Integer>();
		MyQueue<String> strQueue = new MyQueue<String>();
		MyQueue<Character> charQueue = new MyQueue<Character>();

		for (int i = 0; i < intArr.length; i++) {
			intQueue.add(intArr[i]);
		}
		for (int i = 0; i < strArr.length; i++) {
			strQueue.add(strArr[i]);
		}
		for (int i = 0; i < charArr.length; i++) {
			charQueue.add(charArr[i]);
		}
		System.out.println("\nQueue implementation test: ");
		printQueue(intQueue);
		printQueue(strQueue);
		printQueue(charQueue);
	}

	public static <T> void printStack(MyStack<T> s) {
		while (!s.isEmpty()) {
			System.out.print(s.pop() + " - ");
		}
		System.out.println("end");
	}

	public static <T> void printQueue(MyQueue<T> s) {
		while (!s.isEmpty()) {
			System.out.print(s.remove() + " - ");
		}
		System.out.println("end");
	}

}
