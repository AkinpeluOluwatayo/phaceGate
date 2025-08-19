from unittest import TestCase
import TaskFour

class TestPossibleDistance(TestCase):
	def test_that_distance_is_possible(self):
		element1 = 50
		element2 = 25
		element3 = 2
		actual = TaskOne.subtraction(element1,element2,element3)
		expected = True
		self.assertEqual(actual, expected)





