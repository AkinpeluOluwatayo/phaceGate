from unittest import TestCase
import TaskThree

class TestFacebookText(TestCase):
	def test_string_of_names(self):
		element1 = str['Peter']
		element2 = str['Jacob']
		actual = TaskThree.facebookText(element1,element2)
		expected = str['Peter','Jacob']
		self.assertEqual(actual, expected)