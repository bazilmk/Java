import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MarkTest {

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
	public void testMark() {
		Mark mark = new Mark(95, "Excellent Work");
		assertEquals(mark.getMark(), 95);
	}
	@Test
	public void testComment(){
		Mark mark = new Mark(75, "Good");
		assertNotEquals(mark.getComment(), "Bad");
	}
	@Test
	public void testDescription(){
		Mark mark = new Mark(49, "Fail");
		assertEquals(mark.description(), "Mark: 49" + "\n" + "Comment: Fail");
	}
}