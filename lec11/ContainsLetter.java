public class ContainsLetter {

    //containsLetter("l", "hello")
    //      -> return containsLetter("l", "ello")
    //             -> return containsLetter("l", "llo")
    //                      ->  return true;

    public static boolean containsLetter(String letter, String word) {
        if (word.length() == 0) {
            return false;
        } 

        String curChar = word.substring(0, 1); //return only the first letter of word
        if (curChar.equals(letter)) {
            return true;
        }

        return containsLetter(letter,  word.substring(1));
    }

    public static void main(String[] args) {
        String test = "Hello";

        /*
        System.out.println("Substring 0, 1 " + test.substring(0, 1));
        System.out.println("Substring 0, 3 " + test.substring(0, 3));
        System.out.println("Substring 3 " + test.substring(3));
        */

        System.out.println(containsLetter("l", "hello"));
        System.out.println(containsLetter("@", "@@@@"));
        System.out.println(containsLetter("l", ""));
    }
}
