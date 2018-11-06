import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList() {
    super();
  }

  public OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public void add(int index, T element) {
	  if (this.size() == 0) {
		  super.add(element);
	  }
	  else if (this.size() == 1){
		  if (this.get(0).compareTo(element) <= 0) {
			  super.add(element);
		  }
		  else {
			  super.add(0,element);
		  }
	  }
	  else {
		  boolean test = true;
		  int i = 0;
		  while (test) {
			  if (element.compareTo(this.get(i)) <= 0) {
				  super.add(i, element);
				  test = false;
			  }
			  i += 1;
		  }
	  }
  }
  
  public boolean add(T element){
	  this.add(0,element);
	  return true;
  }
  
  public T set(int index, T element) {
	  remove(index);
	  this.add(element);
	  return element;
  }
	  
		  
}
