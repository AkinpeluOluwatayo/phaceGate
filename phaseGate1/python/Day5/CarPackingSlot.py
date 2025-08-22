def car_parking_slot (num):
	slots = new int[5]
	print('Pick car park slot number '1 - 5' ')

	unOccupied = true
	
	for slot in slots:
		if (slots[slot] && unOccupied):
			print('Car slot is free')
		else:
			print('Car slot is occupied')

	return car_parking_slot