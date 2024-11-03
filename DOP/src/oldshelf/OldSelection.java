package oldshelf;
public class OldSelection {

   
   public static String getAgeOrTitle(Object o) {
        return switch (o) {
            case Comic comic -> comic.getTitle();
            case Fiction fiction -> fiction.getName();
            case TextBook textBook -> textBook.getSubject();
            case null, default -> "";
        };
    }

    public static void main(String[] args) {
        TextBook t = new TextBook("Social Studies");
        System.out.println("Subject of the TextBook: " + getAgeOrTitle(t)); 
        
        Comic c = new Comic("Dylan:The Great Adventures", 12);
        System.out.println("Title of the Comic: " + getAgeOrTitle(c));
        
        Fiction f = new Fiction("Pulp Fiction", FictionType.Comedy);
        System.out.println("Name of the Fiction: " + getAgeOrTitle(f));
    }
}
