public class Tester{
	public static void main(String[] args){
		Coin oneDollar = new Coin(1);
		Coin oneCent = new Coin(.01);
		Coin fiveCent = new Coin(.05);
		
		Coin oneTl = new Coin(1);
		Coin twentyfiveKr = new Coin(.25);
		Coin tenKr = new Coin(.1);
		
		Coin oneEuro = new Coin(1);
		Coin fiftyCentEuro = new Coin(.5);
		Coin fiveCentEuro = new Coin(.05);
		Coin oneCentEuro = new Coin(.01);
		
		CashRegister register = new CashRegister();
		
		register.recordPurchase(3.80);
		register.receivePayment(oneDollar, 5);
		register.receivePayment(oneCent, 2);
		register.receivePayment(fiveCent, 3);
		register.giveChangeDollar();
		
		register.recordPurchase(2.21);
		register.receivePayment(oneTl, 1);
		register.receivePayment(twentyfiveKr, 21);
		register.receivePayment(tenKr, 11);
		register.giveChangeTL();
		
		register.recordPurchase(1.61);
		register.receivePayment(oneEuro, 2);
		register.receivePayment(fiftyCentEuro, 1);
		register.receivePayment(fiveCentEuro, 3);
		register.receivePayment(oneCentEuro, 26);
		register.giveChangeEu();
	}
}