public class GradeCalculator { 
     public static void main(String[] args) {



}
       public static String gradeScore(int score1, int score2, int score3) {

          for (int index = 1; index <= 100; index++){

		int average = score1 + score2 + score3 / 3;
	
		if (average <= 90 && <= 100){

			return A;
	
		}else if(average <= 80 && < 90){

			return B;
	
		}else if(average <= 70 && < 80){

			return C;
	
		}else if(average <= 60 && < 70){

			return D;
		}else{
			return F;

		}
	

	  }

      }
       
}