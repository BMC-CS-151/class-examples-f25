public class GenericExpandableArray<T> {
    private T[] data;
    private int size;

    public GenericExpandableArray(int capacity) {
        data = (T[]) new Object[capacity];
        //data =  new T[capacity];
        size = 0;
    }

    public void insert(T elem){
      //check if full, if so, create a new array of 2x size and copy everything over
      data[size] = elem;
      size++; //size += 1, size = size + 1;
  }

  public T get(int index) {
        return data[index];
  }

  public static void main(String[] args) {
    GenericExpandableArray<String> e = new GenericExpandableArray<String>(3);
    e.insert("foo");
    
    GenericExpandableArray<Integer> e2 = new GenericExpandableArray<Integer>(3);
    e2.insert(100);


    //ExpandableArray.getMax();
    /*
    e.insert(100);
    e.insert(15);
    e.insert(3);
    e.print();
    */

    //e.remove(1);
    //e.print();

    //System.out.println(e.get(0));
  }
}
