package potw.ll;

import potw.ll.ILinkedListNode;

public class LinkedList<T> {

  protected ILinkedListNode<T> _head;

  public LinkedList() {
    _head = new EmptyLinkedListNode<T>();
  }

  // Assume input is non-null
  public void add(T item) {
    _head = _head.add( item );
  }

  public int length() {
    return _head.length();
  }

  public T get(int index) {
      return _head.get(index);
  }
}
