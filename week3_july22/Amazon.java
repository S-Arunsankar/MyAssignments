package week3_july22;

public class Amazon extends CanaraBank{
	

@Override
public void upiPayments() {
	// TODO Auto-generated method stub
	System.out.println("Payment Successfull");
	
}

@Override
public void cardPayments() {
	// TODO Auto-generated method stub
	System.out.println("Card Payment successfull");
	
}

@Override
public void internetBanking() {
	// TODO Auto-generated method stub
	System.out.println("Internet Banking");
	
}

@Override
public void recordPaymentDetails() {
	// TODO Auto-generated method stub
	System.out.println("RecordPaymentDetails");
	
}

@Override
public void cashOnDelivery() {
	// TODO Auto-generated method stub
	System.out.println("cashonDelivery");
	
}

public static void main(String[] args) {
	Amazon az = new Amazon();
	az.cardPayments();
	az.cashOnDelivery();
	az.internetBanking();
	az.recordPaymentDetails();
	az.upiPayments();
}
}
