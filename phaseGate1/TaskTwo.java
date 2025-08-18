    import java.util.Scanner;
        public class TaskTwo {
           public static void main(String[] args) {

	   Scanner input = new Scanner(System.in);

}
	   public static int sum(int num1, int num2, int num3){

	   System.out.println("Enter First Integer");
	    int input = input.nextInt();

	   System.out.println("Enter Second Integer");
	    int input1 = input.nextInt();

	   System.out.println("Enter Third Integer");
	    int input2 = input.nextInt();

	   sum = 0;
	   	for(int index = 0; index <= 3; index++){

		    sum += index;
		}

		return sum;	
	    }

	    public static int average(int num1, int num2, int num3){
		
		sum = 0;
		for(int index = 0; index <= 3; index++){

		     sum += index;

		     average = sum / 3;
		}

		return average;
	    }

	    public static int product(int num1, int num2, int num3){
		
		product = 0;
		for(int index = 0; index <= 3; index++){

		     product *= index;
		     
		}

		return product;
	     }








}