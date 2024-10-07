package PracticeProgram;

public class PrimeNumberGeneration {

	
	public static void main(String[] args) {
	    int n=100;
	    for(int j=1;j<=n;j++){
	      if(isPrime(j)){
	          System.out.println(j+" is prime");
	      }else{
	           System.out.println(j+" is not prime");
	      }
	    }
	    }
	    public static boolean isPrime(int numb){
	        if(numb>1){
	            for(int i=2;i<=numb/2;i++){
	                if(numb%i==0){
	                    return false;
	                }
	            }
	        }
	        return true;
	    }
}
