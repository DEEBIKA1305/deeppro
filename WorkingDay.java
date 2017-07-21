package Guvi;
import java.util.*;
public class WorkingDay {
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	String str=s.next();
	if(((str.equalsIgnoreCase("saturday"))||(str.equalsIgnoreCase("Sunday")))){
		System.out.println("False");
	}
	else{
		System.out.println("True");
	}
			
}
}
