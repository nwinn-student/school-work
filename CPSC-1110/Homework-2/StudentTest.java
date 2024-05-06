

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import org.junit.Assert;

/**
 * Purpose: To test the Student class using unit test instead of a tester class.
 *
 * @Author Noah Winn
 * @Id QWX746
 * @Version 1/26/2022
 * @Assignment Number: 2
 * 
 */
public class StudentTest
{
    /**
     * Default constructor for test class StudentTest
     */
    public StudentTest()
    {
    }
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }
    // Tests the addScore method
    @Test
    public void testAddScore(){
        int capacity = 3;
        int times = 3;
        Student student1 = new Student(capacity);
        boolean expected = true;
        Assert.assertEquals(expected, student1.addScore(times));
    }
    //Tests the minimumPosition method
    @Test
    public void testMinimumPosition(){
        int capacity = 2;
        
        Student student2 = new Student(capacity);
        student2.addScore(capacity);
        int expected = 0;
        Assert.assertEquals(expected,student2.minimumPosition());
    }
    //Tests the sum  method
    @Test
    public void testSum(){
        int capacity = 3;
        Student student3 = new Student(capacity);
        student3.addScore(capacity);
        double expected = 3;
        Assert.assertEquals(expected, student3.sum(), .00001);
    }
    

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
