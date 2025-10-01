public class ExpandableArray {

  private int[] data;
  private int numElems; // how many items are currently in our array

  public ExpandableArray(int size) {
    this.data = new int[size];
  }

  public void insert(int item) {
    // assume our internal array isnt full

    if (numElems == data.length-1) { //array is full {
        System.out.println("O(n) operation incurred");

      int[] data2 = new int[numElems*2];
      for (int i=0; i<data.length; i++) {
        data2[i] = data[i];
      }

      this.data = data2;

    } else {
        System.out.println("O(1) insert");
    }

    this.data[numElems+1] = item;

    numElems += 1;

    // TODO: what should we do if our array is full? You'll implement this in

 }

  public int remove(int index) {
      for (int i=0; i<data.length; i++) {
          if (i == index) {
              int removed = data[i];
              data[i] = data[i+1];
              return removed;
          } else if (i < index) {
            continue;
          } else if (i > index) {
             data[i] = data[i+1];
          }
      }
      numElems -= 1;
      return 0;
  }

    
  public int get(int index) {
    return this.data[index];
    //TODO assume index is in bounds
  } 

  public void print() {
    System.out.println("Data:");
    for (int i=0; i < this.data.length; i++) {
      System.out.println(data[i]);
    }
  }

  public static void main(String[] args) {
    ExpandableArray e = new ExpandableArray(3);
    for (int i=0; i<1000000; i++) {
            e.insert(i);
    }
  }
}
