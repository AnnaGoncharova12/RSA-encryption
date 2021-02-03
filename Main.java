
public class Main {
    //function that tests the RSA algorithm implementation
	public void send(String message) {
	
		Recipient S = new Recipient();
		Encryptor M= new Encryptor(S);
		M.send(S, message);
		
	}
	public static void main(String[] args) {
		Main test= new Main();
		test.send("hi");
		
		
	}
				
}
