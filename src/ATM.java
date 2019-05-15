import java.util.Scanner;

public class ATM {

	  public void work(Account account) {
		  
		  Login login = new Login();
		  
		  Scanner scanner = new Scanner(System.in);
		  
		  System.out.println("Atm Uygulamasina Hosgeldiniz..");
		  
		  System.out.println("*******************************");
		  
		  System.out.println("Kullanici Girisi");
		  
		  System.out.println("*******************************");
		  
		  int testingNumber=3;
		  
		  while(true) {
			  if(login.login(account)) {
				  
				  System.out.println("Giris Basarili....");
				  break;
			  }
			  
			  
			  else {
				   System.out.println("Giris Basarisiz...");
				   testingNumber--;
				   if(testingNumber==0) {
						  System.out.println("Giris Hakkiniz bulunmamakta");
						  return;
						  
					  }
				   System.out.println(testingNumber +" giris hakkiniz bulunmakta");
				 }
			  
			  
			
			  
		  }
		     
		     System.out.println("****************************");
		     
		     String operations= "1.Bakiye Sorgula\n"
		    		             + "2.Para Yatirma\n"
		    		             + "3.Para Cekme\n"
		    		             + "Cikis icin q'ya basiniz";
		     
		     System.out.println(operations);
		     
		     System.out.println("*****************************");
		     
		     while(true) {
		    	 System.out.println("Islem seciniz..");
		    	 
		    	 String operation=scanner.nextLine();
		    	 
		    	 if(operation.equals("q")) {
		    		 break;
		    	 }
		    	 
		    	 else if(operation.equals("1")) {
		    		 
		    		 System.out.println("Bakiyeniz:"+account.getBalance());
		    	 }
		    	 
		    	 else if(operation.equals("2")) {
		    		 
		    		 System.out.print("Yatirmak istediginiz tutar:");
		    		 int amount= scanner.nextInt();
		    		 
		    		 scanner.nextLine();
		    		 
		    		 account.addMoney(amount);
		    	 }
		    	 else if(operation.equals("3")) {
		    		 
		    		 System.out.print("Cekmek istediginiz tutar:");
		    		 int amount = scanner.nextInt();
		    		 
		    		 scanner.nextLine();
		    		 
		    		 account.takeMoney(amount);
		    	 }
		    	 
		    	 else {
		    		 
		    		 System.out.println("Gecersiz islem...");
		    	 }
		    	 
		     }
		  
	  }
}
