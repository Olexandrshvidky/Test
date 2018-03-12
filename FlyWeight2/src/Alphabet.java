public class Alphabet {
    private Letter[] letters;
    public Alphabet() {
        letters = new Letter[26];
        for (char i = 'a', index = 0; i <= 'z'; i++, index++) {
            letters[index] = new Letter(i);
        }
//        System.out.println(Arrays.toString(letters));
    }

    public Letter getLetter(char character) {
        return letters[character - 'a'];
    }
}
