testinside the testing file

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TaskSixTest {
	@Test
	public void testLargestNumber(){
	int actual = TaskSix.largest(4);
	int expected = 4;
	assertEquals = (actual,expected);

	}