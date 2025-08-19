import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TaskFourTest {
	@Test
	public void testIfPossible() {
	int actual = TaskFour.ifPossible(50,25,2);
	bool expected = True;
	assertEquals(actual,expected);	

	}

}