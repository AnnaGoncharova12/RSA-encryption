import java.math.*;
import java.util.HashMap;
import java.util.Random;

public class Encryptor {


  public int n;//modulus recived from recipient
  public int e;//e and n comprise the public key
  
 
  public Encryptor(Recipient r ) {
	  this.n=r.n;
	 
	  this.e=r.e;
	  
  }
  public void send(Recipient r, String message)  {
	  
	
	  for(int i=0;i<message.length();i++) {
		  //System.out.println(k);
		  int c = encrypt(message.charAt(i));
		  r.decrypt(c);
	  }
	  
  }
  public int encrypt(int m) {
	  BigInteger holder=new BigInteger(Integer.toString(m));
	 
	  BigInteger BIn= new BigInteger(Integer.toString(n));
	  return  holder.pow(e).mod(BIn).intValue();
  }
  
 
}
