public class Main {

    public static void main(String[] args) {

        UnicodeFinder finder = new UnicodeFinder();
        StringBuilder result = finder.unicodeAtIndex("Ciao", 1);

        System.out.println(result);


    }

}
