testinside the testing file

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TaskOneTest {
	@Test
	public void testThatSquareTwoNumbers(){

	int actual = TaskOne.squareOfNumber(2,4);
	int expected = 4,16;
	assertEquals = (actual,expected);

        }

	public void testThatSumOfSquare(){
	int actual = TaskOne.sumOfSquare(16,4);
	int expected = 20;
	assertEquals = (actual,expected);

	}

	public void testThatSquareTwoNumbers(){
	int actual = TaskOne.subtractionOfSquare(16,4);
	int expected = 12;
	assertEquals = (actual,expected);

	}







}












