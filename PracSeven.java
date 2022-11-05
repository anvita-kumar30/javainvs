import java.lang.*;
class OddNumException extends Exception {
    public OddNumException(String msg) {
        super(msg);
    }
}
public class PracSeven {
    public static void main(String a[])
	{
        for(int i=0; i<10; i++){
            int num=Integer.parseInt(a[i]);
            if(num != 0){
		        if (num % 2 == 0) {
			        System.out.println("Entered Number is Even");
		        }
		        else {
                    try{
                        throw new OddNumException("Odd Number");
                    }
                    catch(OddNumException e){
                        System.out.println(e.getMessage());
                    }
			        System.out.println("Entered Number is Odd");
		        }  
            }
        }
	}
}


