package conditionalstatement;

public class Reverseanum {

	public static void main(String[] args) {
	int i=0;
	int num=54321;
	int j;
	while (num!=0) {
    	j=num%10;
    	i = i*10 + j;  
		num = num/10;}
		System.out.println(i);
}}
