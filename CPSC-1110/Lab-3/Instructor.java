
/**
 * Describes an instructor.
 *
 * @author Noah Winn
 * @id qwx746
 * @version 4/8/2022
 */
public class Instructor{
    private String lastName;
    private String firstName;
    private String officeNumber;
    /**
     * Constructor for objects of class Instructor
     */
    public Instructor(){
    }
    /**
     * Constructs an instructor from the first name, last name, and office number.
     * @param lname the last name of the instructor
     * @param fname the first name of the instructor
     * @param office the office number of the instructor 
     */
    public Instructor(String lname, String fname, String office){
        lastName = lname;
        firstName = fname;
        officeNumber = office;
    }
    /**
     * Constructs a duplicate of an instructor
     * @param object2 an instructor
     */
    public Instructor(Instructor object2){
        lastName = object2.lastName;
        firstName = object2.firstName;
        officeNumber = object2.officeNumber;
    }
    /**
     * Sets the first name, last name, and the office number.
     * @param lname the last name of the instructor
     * @param fname the first name of the instructor
     * @param office the office number of the instructor
     */
    public void set(String lname, String fname, String office){
        lastName = lname;
        firstName = fname;
        officeNumber = office;
    }
    /**
     * Computes the first name, last name, and the office number.
     * @return a string of this instructor
     */
    public String toString() { 
        // Create a string representing the object. 
        String str = "Last Name: " + lastName + 
                   "\nFirst Name: " + firstName + 
                   "\nOffice Number: " + officeNumber; 
        // Return the string. 
        return str; 
    } 
}
