package entities;

public class Seller {
	
	private String name;
	private int totalSales;
	
	public Seller(String name, int totalSales) {

		this.name = name;
		this.totalSales = totalSales;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalSales() {
		return totalSales;
	}

	public void setTotalSales(int totalSales) {
		this.totalSales = totalSales;
	}
	
	
	public int comission() {
		
		return (int) (totalSales *  0.09 + 200);
	}

}
