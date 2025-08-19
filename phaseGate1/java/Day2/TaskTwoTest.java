import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TaskTwoTest {
	@Test
	public void testGradeScore() {
	int actual = TaskTwo.gradeScore(10,10,10);
	int expected = 10;
	assertEquals(actual,expected);	

	}

}