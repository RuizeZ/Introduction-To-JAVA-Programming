
public class Tax {
	private int filingStatus;
	public static final int SINGLE_FILER = 0;
	public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = 1;
	public static final int MARRIED_SEPARATELY = 2;
	public static final int HEAD_OF_HOUSEHOLD = 3;
	private int [][] bracket ;
	private double[] rates = new double[5];
	private double taxableIncome;
	
	public Tax() {
		
	}
	
	public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
		this.filingStatus = filingStatus;
		this.bracket = brackets;
		this.rates = rates;
		this.taxableIncome = taxableIncome;
	}
	
	public int getFilingStatus() {
		return filingStatus;
	}
	
	public void setFilingStatus(int filingStatus) {
		this.filingStatus = filingStatus;
	}
	
	public int[][] getBracket() {
		return bracket;
	}
	
	public void setBracket(int[][] bracket) {
		this.bracket = bracket;
	}
	
	public double[] getRates() {
		return rates;
	}
	
	public void setRates(double[] rates) {
		this.rates = rates;
	}
	
	public double getTaxableIncome() {
		return taxableIncome;
	}
	
	public void setTaxableIncome(double taxableIncome) {
		this.taxableIncome = taxableIncome;
	}
	
	public int getTax() {
		int actualTax;
		if (filingStatus == 2) {
			if (taxableIncome < 54626) {
				actualTax = (int) (taxableIncome * rates[0]);
			}
			else {
				actualTax = (int) (taxableIncome * rates[1]);
			}
		}
		else {
			actualTax = (int) (taxableIncome * rates[0]);
		}
		return actualTax;
	}
	
	
	
	
}
