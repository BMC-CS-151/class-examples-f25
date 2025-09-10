public class Loop {

    public static void main(String[] args) {
        String MAGIC = "seaturtle";
        boolean found = false;
        for (int i=0; i<args.length; i++) {
            if (found) break;
            System.out.println(args[i]);
            if (args[i].equals(MAGIC)) {
                System.out.println("YOU WON");
                break;
            }

            // if there are any duplicates you win!
            for (int j=0; j<args.length; j++) {
                if (i == j) continue;
                if (args[i].equals(args[j])) { 
                    System.out.println("YOU WON");
                    found = true;
                    break;
                }
            }
        }
    }
}
