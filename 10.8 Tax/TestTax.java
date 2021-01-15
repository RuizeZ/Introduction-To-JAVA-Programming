
public class TestTax {

	public static void main(String[] args) {
		int startTaxableIncome = 50000;
		int endTaxableIncome = 60000;
		int interval = 1000;
		int currentTaxableIncome = startTaxableIncome - interval;
		int[][] taxBracket = new int[(startTaxableIncome+endTaxableIncome)/interval][4];
		double[] rates = {0.275, 0.305};
		Tax tax1 = new Tax();
		tax1.setBracket(taxBracket);
		tax1.setRates(rates);
		for(int i = 0; i <= (endTaxableIncome-startTaxableIncome)/interval; i++) {
			currentTaxableIncome += interval;
			tax1.setTaxableIncome(currentTaxableIncome);
			for (int j = 0; j < 4; j++) {
				tax1.setFilingStatus(j);
				taxBracket[i][j] = tax1.getTax();
				tax1.setBracket(taxBracket);
			}
		}
		
		for(int i = 0; i <= (endTaxableIncome-startTaxableIncome)/interval; i++) {
			System.out.println(i);
			for (int j = 0; j < 4; j++) {
				System.out.print(tax1.getBracket()[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
