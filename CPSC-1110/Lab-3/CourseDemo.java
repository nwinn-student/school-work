/**
 * This class tests the course classes by printing a sample course.
 * 
 * @author Noah Winn
 * @id qwx746
 * @version 4/8/2022
 */

public class CourseDemo{
    public static void main(String[] args){
        // Create an Instructor object.
        Instructor myInstructor = new Instructor("Hanadi", "Mohamed", "CETAS134");
      
        // Create a TextBook object.
        TextBook myTextBook = new TextBook("Big Hava Early Objects", "Horstmann", "Wiley");

        // Create a Course object.
        Course myCourse = new Course("Data Structures and Program Design", myInstructor, myTextBook);
        
        // Display the course information.
        System.out.println(myCourse);
    }
}