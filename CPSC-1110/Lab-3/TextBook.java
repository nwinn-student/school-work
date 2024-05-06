
/**
 * Describes a textbook.
 *
 * @author Noah Winn
 * @id qwx746
 * @version 4/8/2022
 */
public class TextBook{
    private String title;
    private String author;
    private String publisher;
    /**
     * Constructor for objects of class TextBook
     */
    public TextBook(){
    }
    /**
     * Constructs a textbook from the title, author, and publisher.
     * @param textTitle the title of the textbook
     * @param auth the author of the textbook
     * @param pub the publisher of the textbook
     */
    public TextBook(String textTitle, String auth, String pub){
        title = textTitle;
        author = auth;
        publisher = pub;
    }
    /**
     * Constructs a duplicate of a textbook
     * @param object2 a textbook
     */
    public TextBook(TextBook object2){
        title = object2.title;
        author = object2.author;
        publisher = object2.publisher;
    }
    /**
     * Changes the title, author, and publisher.
     * @param textTitle the title of the textbook
     * @param auth the author of the textbook
     * @param pub the publisher of the textbook
     */
    public void set(String textTitle, String auth, String pub){
        title = textTitle;
        author = auth;
        publisher = pub;
    }
    /**
     * Computes the title, author, and publisher.
     * @return a string of this textbook
     */
    public String toString(){
        // Create a string representing the object. 
        String str = "Title: " + title + "\nAuthor: " + author + "\nPublisher: " + publisher; 
        // Return the string. 
        return str; 
    }
}
