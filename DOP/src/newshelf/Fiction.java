package newshelf;

public record Fiction(String name) implements IBook<String> {

    @Override
    public String getTitle() {
        return name;
    }

    @Override
    public int compareTo(IBook<String> other) {
        return this.name.compareTo(other.getTitle());
    }
}
