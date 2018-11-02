import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T> {
  public NoNullArrayList(){
    super();
  }

  public NoNullArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public T set(int index, T element) {
    if (element == null) {
       throw new IllegalArgumentException("Null cannot be an element of the list.");
    }
    return super.set(index, element);
  }
  public boolean add(T element) {
    if (element == null) {
       throw new IllegalArgumentException("Null cannot be an element of the list.");
    }
    return super.add(element);
  }

  public void add(int index, T element) {
    if (element == null)  {
      throw new IllegalArgumentException("Null cannot be an element of the list.");
    }
    super.add(index, element);
  }

}
