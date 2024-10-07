package Programs;

import java.util.Arrays;

public class ConvertingStringtoArray {

	/*public static void main(String[] args) {
	String str ="Gigantic";
	System.out.println(str);
	System.out.println(str.charAt(0));
	
	String s[]= {"G","k","l"};
	System.out.println(Arrays.toString(s));
	
	
	int n= 2;
	/*for(int i=1;i<=10;i++) {
		n=2*i;
		
		System.out.println(n+"X"+i+"="+n);
		//System.out.println();*/
	/*	
	String str1 = "this is smita";
	String str2 ="This";
	System.out.println(str1.equals(str2));
	System.out.println(str1.equalsIgnoreCase(str2));*/
	
	//StringBuilder sb1= new StringBuilder(str1);
	//System.out.println(sb1.reverse());
	
	/*char ch1[]=str1.toCharArray();
	String reversed="";
	for(int i=str1.length()-1;i>=0;i--) {
		reversed=reversed+ch1[i];
		
	}
	System.out.println(reversed);*/
	/*String[] words=str1.split(" ");
	String originalString ="";

	for(String word:words) {
		String reversedString="";
		for(int i=word.length()-1;i>=0;i--) {
			reversedString = reversedString+word.charAt(i);
		}
		originalString=originalString+reversedString+" ";
		
	}
	System.out.println(originalString);
	}*/
	
	public static String Rev(String str){
        String[] words=str.split(" ");
        String originalStr="";
        for(String word:words){
        	String reversedStr="";
            for(int i=word.length()-1;i>=0;i--){
            
                reversedStr = reversedStr+word.charAt(i);
            }
            originalStr=originalStr+reversedStr+" ";
            //System.out.println(originalStr);
        }
        
        return originalStr;
    }
    //System.out.println(originalStr)

    public static void main(String[] args){
        String s="this is smita";
        System.out.println("original reversed String: "+Rev(s));
    }
}
