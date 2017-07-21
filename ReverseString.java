package Guvi;
import java.util.*;
public class ReverseString {
public static void main(String args[]){
	String str;
	StringBuffer strrev;
	Scanner s=new Scanner(System.in);
	str=s.next();
	StringBuffer strbuf=new StringBuffer(str);
	strrev=strbuf.reverse();
	for(int i=0;i<strrev.length();){
	if(strrev.charAt(i)=='a'||strrev.charAt(i)=='e'||strrev.charAt(i)=='i'||strrev.charAt(i)=='o'||strrev.charAt(i)=='u'){
		strrev.deleteCharAt(i);
		i++;
	}
	else{
		i++;
	}
}System.out.println(strrev);
}
}
