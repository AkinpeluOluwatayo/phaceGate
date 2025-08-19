def gradeScore (score1, score2, score3):
	for grade in (score1, score2, score3):
		average = score1 + score2 + score3 / 3
			if (average <= 90  <= 100):
				return A
			elif (average <= 80 && <= 90):
				return B
			elif (average <= 70 && < 80):
				return C
			elif (average <= 60 && < 70):
				return D

			else:	
				return F