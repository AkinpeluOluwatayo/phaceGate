function gradeScore (score1, score2, score3){
    
    for(let count = 1; count <= 100; count++){

        let average = score1 + score2 + score3 / 3;

	if (average <= 90  <= 100){

		return A;

	}else if(average <= 80 && <= 90){

		return B;

	}else if(average <= 70 && < 80){

		return C;

	}else if(average <= 60 && < 70){

		return D;

	}else{
		return F;
	}


	}

console.log gradeScore()
}