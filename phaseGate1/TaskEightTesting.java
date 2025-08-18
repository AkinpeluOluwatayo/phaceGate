testinside the testing file

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TaskEightTest {
	@Test
	public void testSumNumber(){
	int actual = TaskEight.sum(4);
	int expected = 15;
	assertEquals = (actual,expected);

	}