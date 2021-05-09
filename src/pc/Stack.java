package pc;

public class Stack<E> {
  private static class Node<E> {
     E data;
     Node<E> next;
     Node(E data, Node<E> next) {
       this.data = data;
       this.next = next;
     }
  }
  private Node<E> top; 
  private int size; 
  
  public Stack() {
    top = null;
    size = 0;
  }

  public synchronized int size() {
    return size;
  }

  public synchronized void push(E elem) {
    top = new Node<>(elem, top);
    size++;
  }

  public synchronized E pop() {
    if (size == 0) {
      return null;
    }
    E elem = top.data;
    top = top.next;
    size--;
    return elem;
  }
} 
