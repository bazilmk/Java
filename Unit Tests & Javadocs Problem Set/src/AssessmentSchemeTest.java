import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AssessmentSchemeTest {

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
	public void testInvalidWeight() {
		try{
			new AssessmentScheme(new Exam(50,50), new Assignment(40, "Assignment1"));
			fail("Exception expected but not thrown");	
		}catch (Exception e){
			assertEquals(e.getMessage(), "Weight does not total upto 100");
		}
	}

}
