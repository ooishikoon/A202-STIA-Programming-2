package Exercise4;

public class BookShop extends Book{
	
	private int discountRate;
	
	public BookShop(int q, int p, int dRate) {
		super(p,q);
		discountRate = dRate;
	}
	
	public String getName() {
		return super.getName();
	}
	
	public Integer getQuantity() {
		return super.getQuantity();
	}
	
	public int getPrice() {
		return super.getPrice();
	}
	
	public int getdiscountrate() {
		return this.discountRate;
	}
	
	public int discountPrice() {
		return super.getPrice() * ((100 - discountRate)/100);
	}
	
	
}
