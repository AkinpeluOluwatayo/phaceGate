from unittest import TestCase
import TaskTwo

class TestGradeScore(TestCase):
	def test_grade_score_of_two_number(self):
		element1 = 10
		element2 = 10
		element3 = 10
		actual = TaskTwo.gradeScore(element1,element2, element3)
		expected = 10
		self.assertEqual(actual, expected)