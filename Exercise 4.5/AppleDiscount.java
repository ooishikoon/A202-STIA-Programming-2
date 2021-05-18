package Exercise4_5;

//abstract class implements interface
//lebih kurang sama dengan inherit guna extends
class AppleDiscount implements Discount{
	
	public float rateOfDiscount() {
		return 0.15f;
	}
	
} //end class AppleDiscount

class RedAppleDiscount implements Discount{

	public float rateOfDiscount() {
		return 0.25f;
	}
	
} //end class RedAppleDiscount

class GreenAppleDiscount implements Discount{

	public float rateOfDiscount() {
		return 0.35f;
	}
	
} //end class GreeenAppleDiscount

class AvocadoDiscount implements Discount{

	public float rateOfDiscount() {
		return 0.12f;
	}
	
} //end class AvocadoDiscount


class BlueberryDiscount implements Discount{

	public float rateOfDiscount() {
		return 0.18f;
	}
	
} //end class BlueberryDiscount
