package potw.ll;

public class Main {
  public static void main( String args[] ) {
    LinkedList<String> list = new LinkedList<String>();

    System.out.println("Length should be 0: " + String.valueOf( list.length() ));

    list.add("Hello");

    System.out.println("Length should be 1: " + String.valueOf( list.length() ));

    list.add("world!");

    System.out.println("Length should be 2: " + String.valueOf( list.length() ));

    for (int i = 0; i < 3; i++) {
      list.add( String.valueOf(i) );
      System.out.println("Length should be " + String.valueOf(i + 3) + ": " + String.valueOf( list.length() ));
    }

    System.out.println("Get(0) should be Hello: " + list.get(0));
    System.out.println("Get(1) should be world!: " + list.get(1));
  }
}
