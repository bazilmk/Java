import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ExamTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testValidExam() throws InvalidDurationException {
		Exam exam = new Exam(50, 180);
		assertEquals(exam.description(), "Exam: duration 180 minutes, weight 50%");
	}

	@Test
	public void testTooShort(){
		try {
			Exam exam = new Exam(50, 25);
			fail("exception expected but none thrown");
		} catch (Exception e){
			assertEquals(e.getMessage(), "Exam duration too short");
		}
	}
	
	@Test
	public void testTooLong(){
		try{
			Exam exam = new Exam(50, 181);
			fail("exception expected but none thrown");
		} catch (Exception e){
			assertEquals(e.getMessage(), "Exam duration too long");
		}
	}
}