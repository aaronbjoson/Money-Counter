package Classes;

public class Currency {

    static final double NICKELS = 0.05, DIMES = 0.10, QUARTERS = 0.25, DOLLAR = 1.0, FIVE_DOLLARS = 5.0, TEN_DOLLARS = 10.0, TWENTY_DOLLARS = 20.0, FIFTY_DOLLARS = 50.0, HUNDRED_DOLLARS = 100.0,                
                DOLLAR_ROLL = 25.0, QUARTER_ROLL = 10.0, DIME_ROLL = 5.0, NICKEL_ROLL = 2.0;
	private int fives, tens, twenties, fifties, hundreds, dollarCount, quarterCount, dimeCount, nickelCount, dollarRolls, quarterRolls, dimeRolls, nickelRolls;
	private double totalAmount;

    public Currency(){
        fives = 0; tens = 0; twenties = 0; hundreds = 0;
        dollarCount = 0; quarterCount = 0; dimeCount = 0; nickelCount = 0;
        dollarRolls = 0; quarterRolls = 0; dimeRolls = 0; nickelRolls = 0;
        totalAmount = 0;
    }

    public void calculateTotal(){        
        totalAmount = (NICKELS * nickelCount) + (DIMES * dimeCount) + (QUARTERS * quarterCount) + (dollarCount*DOLLAR) + (fives*FIVE_DOLLARS)+ (tens*TEN_DOLLARS) + (twenties*TWENTY_DOLLARS) + (FIFTY_DOLLARS*fifties) + (hundreds*HUNDRED_DOLLARS)
                + (NICKEL_ROLL*nickelRolls) + (DIME_ROLL*dimeRolls) + (QUARTER_ROLL*quarterRolls) + (dollarRolls*DOLLAR_ROLL);

    }
    
    public String printAmount(){
    	String amount = String.format("$ %.2f", totalAmount);
    	
    	return amount;
    }

    //getters
    public int getFives(){return fives;}
    public int getTens(){return tens;}
    public int getTwenties(){return twenties;}
    public int getFiftiess(){return fifties;}
    public int getHundreds(){return hundreds;}
    
    public int getDollarCount() { return dollarCount;	}
	public int getQuarterCount() { return quarterCount; }
	public int getDimeCount() { return dimeCount; }
	public int getNickelCount() { return nickelCount; }    

	public int getDollarRolls() { return dollarRolls;	}
	public int getQuarterRolls() { return quarterRolls; }
	public int getDimeRolls() { return dimeRolls; }
	public int getNickelRolls() { return nickelRolls; }
	
	//setters
    public void setFivesCount(int amount){ fives = amount;}
	public void setTensCount(int amount) { tens = amount; }	
    public void setTwentiesCount(int amount) { twenties = amount; }
	public void setFiftiesCount(int amount) { fifties = amount; }
    public void setHundredsCount(int amount) {hundreds = amount;}

    public void setDollarCount(int amount){ dollarCount = amount;}
	public void setQuarterCount(int amount) { quarterCount = amount; }	
    public void setDimeCount(int amount) { dimeCount = amount; }
	public void setNickelCount(int amount) { nickelCount = amount; }

    public void setDollarRolls(int amount){ dollarRolls = amount;}
	public void setQuarterRolls(int amount) { quarterRolls = amount; }	
    public void setDimeRolls(int amount) { dimeRolls = amount; }
	public void setNickelRolls(int amount) { nickelRolls = amount; }
}
