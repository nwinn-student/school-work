
/**
 * Describes a course, taking into account the textbook and instructor.
 *
 * @author Noah Winn
 * @id qwx746
 * @version 4/8/2022
 */
public class Course{
    private String courseName;
    private Instructor instructor;
    private TextBook textBook;
    
    /**
     * Constructor for objects of class Course
     */
    public Course(){
    }
    /**
     * Constructs a course from the name, instructor, and textbook.
     * @param name the course name
     * @param instr the instructor
     * @param text the textbook
     */
    public Course(String name, Instructor instr, TextBook text){
        courseName = name;
        instructor = instr;
        textBook = text;
    }
    /**
     * Computes the course name.
     * @return a string of this course name.
     */
    public String getName(){
        return courseName;
    }
    /**
     * Computes the instructor.
     * @return a string of this textbook
     */
    public Instructor getInstructor(){
        return instructor;
    }
    /**
     * Computes the textbook.
     * @return a string of this textbook
     */
    public TextBook getTextBook(){
        return textBook;
    }
    /**
     * Computes the course name, instructor, and textbook.
     * @return a string of this course
     */
    public String toString() { 
        // Create a string representing the object. 
        String str = "Course name: " + courseName + 
                   "\nInstructor Information:\n" + 
                   instructor + 
                   "\nTextbook Information:\n" + 
                   textBook; 
        // Return the string. 
        return str; 
    } 
}
