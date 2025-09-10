public class ExpandableArray {

  //TODO 1: Private member variables
  private int[] data;
  private int size;
    
  //TODO 2: Define a value constructor which takes an initial size
  public ExpandableArray(int size) {
        this.size = 0;
        this.data = new int[size];
  }
  
  //TODO 3: 
  public void insert(int elem) {
        this.data[size] = elem; //assumes size < data.length
        //if needed - create a new array (of size 2*size) and copy over every element in the old
        //array
        this.size += 1;
  }
  // Define an insert method which takes an element to insert 
  //        and inserts it at the end of the array
  // assume our internal array isnt full
  // Q: what should we do if our array is full? You'll implement this in Lab 2 
  //
  // Q: how could we define an insert which puts an element at the beginning?
  // You'll also implement this in Lab 2


  //TODO 4: 
  //arr[i] => arr.get(i)
  public int get(int index) {
      //assumes index < data.length
    System.out.println(this.data.length);
    System.out.println(index);
    return this.data[index];
  }

  // Define a get method which takes an index 
  //    and returns the element at that index
  //
  // assume index is in bounds
  // How could we handle it if index is out of bounds?
  // You'll also implement this in Lab 2

  public void print() {
    System.out.println("Data:");
    for (int i=0; i < this.size; i++) {
      System.out.println(data[i]);
    }
  }

  public static void main(String[] args) {
    //int[] x = new int[]{1, 2, 3}; /
    ExpandableArray e = new ExpandableArray(3);
    e.insert(100);
    e.insert(15);
    e.insert(3);
    e.print();

    //e.remove(1);
    //e.print();

    System.out.println(e.get(10));
  }
}
