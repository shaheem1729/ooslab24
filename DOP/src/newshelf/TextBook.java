package newshelf;

public record TextBook(String subject) implements IBook<String> {

    @Override
    public String getTitle() {
        return subject;
    }

    @Override
    public int compareTo(IBook<String> other) {
        return this.subject.compareTo(other.getTitle());
    }
}
