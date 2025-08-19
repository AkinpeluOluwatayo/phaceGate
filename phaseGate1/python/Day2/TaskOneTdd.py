from unittest import TestCase
import TaskOne

class TestSubtractTwoNumber(TestCase):
	def test_that_subtract_two_number(self):
		element1 = 40
		element2 = 20
		actual = TaskOne.subtraction(element1,element2)
		expected = 20
		self.assertEqual(actual, expected)





