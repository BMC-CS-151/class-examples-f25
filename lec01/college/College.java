import java.util.Scanner;

//Part a: create a College class with name, number of students, year founded
public class College {
    String name;
    int numStudents;
    int yearFounded;
    //static int endowmentTax =.08;

    public College(String n, int num, int year) {
        name = n;
        numStudents = num;
        yearFounded = year;
    }
    
    public String toString() {
        return "College: " + name + " was founded in " + yearFounded;
    }

    public String getName() {
        return name;
    }

    public int getYearFounded() {
        return yearFounded;
    }

    public static void main(String[] args) {
        //Part b: In the main, create 3 colleges and put them in an array
        College c1 = new College("Bryn Mawr", 28, 1885);
        College c2 = new College("Haverford", 29, 2013);
        College c3 = new College("Penn", 30, 1790);

        College[] colleges = new College[3];
        colleges[0] = c1;
        colleges[1] = c2;
        colleges[2] = c3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a college name: ");
        String name = sc.nextLine();

        for (int i=0; i<colleges.length; i++) {
            if (colleges[i].getName().equals(name)) {
                System.out.println(colleges[i].getYearFounded());
            } 
            //System.out.println(colleges[i]);
        }
    }
}


