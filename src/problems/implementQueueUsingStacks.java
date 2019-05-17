class MyQueue {
  private Stack<Integer> stackA = new Stack<>();
  private Stack<integer> stackB = new Stack<>();
  private int front = 0;
  
  public MyQueue() {}

  public void push(int x) {
    if (stackA.empty()) front = x; 
    stackA.push(x);
  }
 
  public int pop() {
    if (stackB.empty()) {
      while (!stackA.empty()) {
        stackB.push(stackA.pop());
      }
    }
    return stackB.pop();
  }  

  public int peek() {
    if (!stackB.empty()) return stackB.peek();
    return front;
  }

  public boolean empty() {
    return stackA.empty() && stackB.empty();
  }
}

