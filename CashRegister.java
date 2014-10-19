public class CashRegister{
	public double purchase;
    public double payment;
	public double change;
	
	public CashRegister(){
		purchase = 0;
		payment = 0;
	}
	
	public void recordPurchase(double amount){
		purchase += amount;
	}
	
	public void receivePayment(Coin money, double amount){
		payment += money.getVal() * amount;
	}
	
	public int changeCalculator(double worth){
		int amount = 0;
		while(change >= worth){
			change -= worth;
			amount++;
		}
		return amount;
	}
	
	public void isEnough(double amount){
		if(purchase > amount){
			System.out.println("You dont have enough money.");
		}
	}
	
	public void giveChangeTL(){
		change = payment - purchase;
		
		purchase = 0;
		payment = 0;
		int oneTl = changeCalculator(1);
		int fiftyKr = changeCalculator(.5);
		int twentyfiveKr = changeCalculator(.25);
		int tenKr = changeCalculator(.1);
		int fiveKr = changeCalculator(.05);
		int oneKr = changeCalculator(.01);
	
		System.out.println("\n---------------------\n\n1 TL:    " + oneTl + "\n0.5 TL:  " + fiftyKr + "\n0.25 TL: " + twentyfiveKr + "\n0.10 TL: " + tenKr + "\n0.05 TL: " + fiveKr + "\n0.01 TL: " + oneKr);
		
	} 
	
	
	public void giveChangeEu(){
		change = payment - purchase;
		purchase = 0;
		payment = 0;
		
		int twoEu = changeCalculator(2);
		int oneEu = changeCalculator(1);
		int fiftyCentEu = changeCalculator(.5);
		int twentyCentEu = changeCalculator(.2);
		int tenCentEu = changeCalculator(.1);
		int fiveCentEu = changeCalculator(.05);
		int twoCentEu = changeCalculator(.02);
		int oneCentEu = changeCalculator(.01);

		System.out.println("\n---------------------\n\n2 Euro: " + twoEu + "\n1 Euro: " + oneEu + "\n50 Cent Euro: " + fiftyCentEu + "\n20 Cent Euro: " + twentyCentEu + "\n10 Cent Euro: " + tenCentEu + "\n5 Cent Euro:  " + fiveCentEu + "\n2 Cent Euro:  " + twoCentEu + "\n1 Cent Euro:  "  + oneCentEu);
	}
	
	public void giveChangeDollar(){
		change = payment - purchase;
		purchase = 0;
		payment = 0;
		
		int dollar = changeCalculator(1);
		int quarter = changeCalculator(.25);
		int dime = changeCalculator(.1);
		int nickel = changeCalculator(.05);
		int cent = changeCalculator(.01);

		System.out.println("\n---------------------\n\n1 Dollar: " + dollar + "\nQuarter:  " + quarter + "\nDime:     " + dime + "\nNickel:   " + nickel + "\nCent:     " + cent);
	} 

}