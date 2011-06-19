package stack.as.a.queue;

import java.util.Stack;

/**
 * Uses one stack on the heap (and the call stack) to implement
 * a queue. O(N^2) complexity.
 * 
 * @author patweb
 */
public class StackAsAQueue {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    Queue<String> myQueue = new Queue<String>();

    myQueue.enqueue("sh");
    myQueue.enqueue("pi");
    myQueue.enqueue("fu");
    myQueue.enqueue("cu");
    myQueue.enqueue("co su");
    myQueue.enqueue("mo fu");
    myQueue.enqueue("ti");

    System.out.println("dequeing: " + myQueue.dequeue());
    System.out.println("dequeing: " + myQueue.dequeue());
    System.out.println("dequeing: " + myQueue.dequeue());
    System.out.println("dequeing: " + myQueue.dequeue());
    System.out.println("dequeing: " + myQueue.dequeue());
    System.out.println("dequeing: " + myQueue.dequeue());
    System.out.println("dequeing: " + myQueue.dequeue());
    System.out.println("dequeing: " + myQueue.dequeue());

  }
}

class Queue<E> {

  private Stack<E> myStack = new Stack<E>();

  public void enqueue(E item) {
    
    if (myStack.empty()) {
      myStack.push(item);
    }
    else {
      E top = myStack.pop();
      enqueue(item);
      myStack.push(top);
    }

  }

  public E dequeue() {
    if (!myStack.empty()) {
      return myStack.pop();
    }
//    throw new EmptyStackException();
    return null;
  }
}
