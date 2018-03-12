public class Main {
    public static void main(String[] args) {
        /*for (int i = p1; i <= 10; i++) {
            System.out.println(i);
        }*/
        Alphabet alphabet = new Alphabet();
        Letter a = alphabet.getLetter('a');
        System.out.println(a);
        a.show("Bold");
    }
}