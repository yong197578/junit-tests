import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;



public class StudentTest {
    Student student1;
    @Before
    public void setUp() {
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(90);
        grades.add(88);
        grades.add(87);
        student1 = new Student(1, "Yong", grades);
    }
    @Test
    public void TestId(){

        assertEquals(1, student1.getId());

    }
    @Test
    public void TestName(){
        assertEquals("Yong", student1.getName());
    }
    @Test
    public void testGetAverage(){
        double expectedAverage = (90 + 88 + 87) / 3.0;
        double actualAverage = student1.getGradeAverage();

        assertEquals(expectedAverage, actualAverage, 0.01);
    }

}
