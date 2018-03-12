public class Letter {
    private char character;

    public Letter(char character) {
        this.character = character;
    }

    public void show(String context) {
        System.out.println("Character '" + character + "' in context " + context);
    }

    @Override
    public String toString() {
        return String.valueOf(character);
    }
}
