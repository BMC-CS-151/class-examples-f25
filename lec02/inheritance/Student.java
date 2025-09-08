class Student {
  private String name;
  private int id;

  public Student(String name, int id) {
    this.name = name;
    if (id < 0) {
            //throw exception
    }
    this.id = id;
  }

  public Student() {}

  public String getName() {
    return name;
  }

  public int getId() {
    return id;
  }

  public String toString() {
    return name+" "+id;
  }
 }

