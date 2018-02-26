public class Request {
    private String name;
    private int x;
    private int y;

    public Request(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Request) {
            Request request = (Request) obj;
            if (request.name.equals(name) &&
                    request.x == x &&
                    request.y == y) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 0;
        for (char c : name.toCharArray()) {
            result += c;
        }
        return x + y + result;
    }
}
