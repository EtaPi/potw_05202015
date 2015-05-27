package potw.ll;

import potw.ll.ILinkedListNode;

public class LinkedListNode<T> implements ILinkedListNode<T> {
  protected T _item;
  protected ILinkedListNode<T> _next;

  public LinkedListNode(T item) {
    _item = item;
    _next = new EmptyLinkedListNode<T>();
  }

  public ILinkedListNode<T> add(T item) {
    _next = _next.add(item);
    return this;
  }

  public int length() {
    return 1 + _next.length();
  }

  public T get(int index) {
    return index == 0 ? _item : _next.get(index - 1);
  }
}
