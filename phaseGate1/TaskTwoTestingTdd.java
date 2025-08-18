testinside the testing file

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TaskTwoTest{
	@Test
	public void testSumThreeNumbers(){

	int actual = TaskTwo.sum(1,2,3);
	int expected = 6;
	assertEquals = (actual,expected);

	}

	public void testAverageNumbers(){

	int actual = TaskTwo.average(4,2,3);
	int expected = 3;
	assertEquals = (actual,expected);

	}

	public void testProductNumbers(){

	int actual = TaskTwo.average(1,2,3);
	int expected = 6;
	assertEquals = (actual,expected);

	}










}