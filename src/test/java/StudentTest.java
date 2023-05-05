import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testIfStudentCanBeCreated(){
        Student fer = new Student(1L, "fer");
        Student nullStudent = null;
        assertNotNull(fer);
        assertNull(nullStudent);
    }

    @Test
    public void testIfFieldsAreSet(){
        Student fer = new Student(1L, "fer");
        assertEquals(1L, fer.getId());
        assertEquals("fer", fer.getName());

        Student rosie = new Student(40L, "Rosie");
        assertEquals(40L, rosie.getId());
        assertEquals("Rosie", rosie.getName());
    }

    @Test
    public void testIfAddGradeWorks(){
        Student fer = new Student(1L, "fer");
        assertEquals(0, fer.getGrades().size());
        fer.addGrade(90);
        assertEquals(1, fer.getGrades().size());
        fer.addGrade(70);
        assertEquals(2, fer.getGrades().size());
    }

    @Test
    public void testIfGetGradesWorks(){
        Student fer = new Student(1L, "fer");
        fer.addGrade(90);
        fer.addGrade(70);
        assertSame(90, fer.getGrades().get(0));
        assertSame(70, fer.getGrades().get(1));
    }

    @Test
    public void testIfGetAVGWorks(){
        Student fer = new Student(1L, "fer");
        fer.addGrade(90);
        fer.addGrade(70); // 160 / 2 = 80
        assertEquals(80, fer.getGradeAverage(), 0);
        fer.addGrade(50); // 210 / 3 = 70
        assertEquals(70, fer.getGradeAverage(), 0);
    }

        @Test
        public void testCreateStudent(){
            Student fer = new Student(1L, "fer");
            Student ryan = null;
            assertNull(ryan);
            assertNotNull(fer);
        }

        @Test
        public void testStudentFields(){
            Student fer = new Student(1L, "fer");
            assertSame(1L, fer.getId());
            assertSame("fer", fer.getName());
            assertSame(0, fer.getGrades().size());
        }


        @Test
        public void testAddGrade(){
            Student fer = new Student(1L, "fer");
            fer.addGrade(100);
            assertSame(100, fer.getGrades().get(0));
            fer.addGrade(80);
            assertSame(80, fer.getGrades().get(1));
        }

        @Test
        public void testAverageGrade(){
            Student fer = new Student(1L, "fer");
            fer.addGrade(100);
            fer.addGrade(80);
            assertEquals(90, fer.getGradeAverage(), 0);
        }

}