import java.util.ArrayList;
import java.util.Scanner;
public class GroceryItemChecker {
   public static void main(String[] args){

   ArrayList<String> items = new ArrayList<>(); 

homepage();
}
     public static void homepage(){

            Scanner inputCollector = new Scanner(System.in);

	while (true) {
             System.out.println("""     

              Welcome to Tayo Store

	      1. Add items
	      2. Remove items
	      3. Show available items
	      4. exit
				""");
	      System.out.println("Select option");
	      int homepage = inputCollector.nextInt();

      switch(homepage){
	   case 1:
		     System.out.println("""
			what items are you adding?
		1. Cornflakes
		2. Milk
		3. butter
		4. exit
					""");
		System.out.println("Select option");
	        int item1 = inputCollector.nextInt();

	    switch(item1){
	     case 1:
		System.out.println("Cornflakes has been successfully added...");
		break;

	     case 2: 
		 System.out.println("Milk has been successfully added...");
		break;

	     case 3:
		System.out.println("butter has been successfully added...");
		break;	

	      case 4:
		homepage();
		break;
			}	

		
            case 2:
		   System.out.println("""
			what items are you removing?
		1. Cornflakes
		2. Milk
		3. butter
		4. exit
					""");
		System.out.println("Select option");
	        int removeItem = inputCollector.nextInt();

		switch(removeItem){
		case 1:
		      System.out.println("Cornflakes has been successfully removed...");
		      break;
		case 2: 
		      System.out.println("Milk has been successfully removed...");
		      break;
	
		 case 3:
		      System.out.println("butter has been successfully removed...");
		      break;

		 case 4:
		      homepage();
		      break;
			}

// Comparing the Additem menu to remove menu

		     if (item1 == removeItem){

			System.out.println(item1.equalsIgnoreCase(removeitem));

			}else{

			 System.out.println("Available items: " + item1);
				}

}
		
     }
	
      }
}