import java.util.List;
import java.util.ArrayList;

public class App {
	
		   
	    public List<String> fizzBuzz(int n) {
	         List<String> a= new ArrayList<>();
	        for(int i=1,threeLoop=1,fiveLoop=1;i<n+1;i++,threeLoop++,fiveLoop++){
	            
	            if(threeLoop%3==0&&fiveLoop%5==0){
	                a.add("FizzBuzz");
	                threeLoop=0;
	                fiveLoop=0;
	            }
	           else if(threeLoop%3==0){
	                a.add("Fizz");
	                threeLoop=0;
	            }else if(fiveLoop%5==0){
	                a.add("Buzz");
	                fiveLoop=0;
	            }else{
	                a.add(Integer.toString(i));
	            }
	            
	        }
	       return a;
	}
	}


