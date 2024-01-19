

public class GoogleBillboard {
	public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
	int start = 2;
	int end = 12;
	public static void main(final String[] args) {
 String digits = e.substring(start,end);
  double dNum = Double.parseDouble(digits);
  boolean isPrimeResult = isPrime(dNum);
  if(isPrimeResult){
  System.out.println(digits);
  }
  else{
  start++;
  end++;
  main();
  }
	}
	

	//Finish this function
	public boolean isPrime(double dNum){
	double nlength = Math.sqrt(dNum);
    for(int i =2; i <= nlength; i++){
     if(dNum % i == 0)
     return false;
	
	}
return true;
}

