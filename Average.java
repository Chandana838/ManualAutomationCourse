package conditionalstatement;

public class Average {

	public static void main(String[] args) {
    int Maths=33;
    int Science=90;
    int English=80;
    int Avg=((Maths+Science+English)/3);
    if (Avg>=90){ 
    	System.out.println("Grade=A+");
    	System.out.println("Excellent Performance!");
    }
    	else if(Avg>=75){
    		System.out.println("Grade=A");
        	System.out.println("Excellent Performance!");
    }
    	else if(Avg>=60) {
    		System.out.println("Grade=B");
        	System.out.println("Keep Improving");
    }
    	else if(Avg>=40) {
    		System.out.println("Grade=C");
        	System.out.println("Keep Improving");
    	}
    	else {
    		System.out.println("Fail");
        	System.out.println("Please work harder next time");
    	}
    if (Maths<35||Science<35||English<35)
    	System.out.println("Failed due to low score in at least one subject");
	}

	
}
