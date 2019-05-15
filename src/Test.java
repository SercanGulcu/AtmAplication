
public class Test {

	public static void main(String[] args) {
		
		ATM atm = new ATM();
		
		Account account = new Account("SercanGulcu", "Sercan.1907", 3500);
		
		atm.work(account);
		System.out.println("Uygulamadan Cikiliyor...");
	}
	
}
