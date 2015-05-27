package potw.ll;

public interface ILinkedListNode<T> {
  public ILinkedListNode<T> add(T item);
  public int length();
  public T get(int index);
}
