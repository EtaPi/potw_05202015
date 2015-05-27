package potw.ll;

import potw.ll.ILinkedListNode;

public class EmptyLinkedListNode<T> implements ILinkedListNode<T> {

  public EmptyLinkedListNode() {

  }

  public ILinkedListNode<T> add(T item) {
    return new LinkedListNode<T>(item);
  }

  public int length() {
    return 0;
  }

  public T get(int index) {
    return null;
  }
}
