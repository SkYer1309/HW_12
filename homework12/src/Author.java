public class Author {
    private final String name1;
    private final String name2;

    @Override
    public String toString() {
        return name1 + " " + name2;
    }

    public Author(String name1, String name2) {
        this.name1 = name1;
        this.name2 = name2;

    }

    public String getName1() {
        return this.name1;
    }

    public String getName2() {
        return this.name2;
    }
}
