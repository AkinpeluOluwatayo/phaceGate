function ifPossible(distance, miles, gallons){
  let maximum_distance_possible = miles * gallons;
      if (maximum_distance_possible >= distance){

	return True;
      }else{

	return False;
	
	   }

console.log(ifPossible(distance, miles, gallons))
}
