
public class AudioDVD extends Product implements Sell{
	private String language;
	private int amount;
	public AudioDVD(int id, String name,int barcode,int price,String language){
		super(id,name,barcode);
		this.language=language;
	}
	public void setLanguage(String language) {
		// TODO Auto-generated method stub
		this.language=language;
	}

	public String getLanguage() {
		// TODO Auto-generated method stub
		return language;
	}

	@Override
	public void setPrice(int price) {
		// TODO Auto-generated method stub
		this.price=price;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public void setAmount(int amount) {
		// TODO Auto-generated method stub
		this.amount=amount;
	}

	@Override
	public int getAmount() {
		// TODO Auto-generated method stub
		return amount;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		this.id=id;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public void setBarcode(int barcode) {
		// TODO Auto-generated method stub
		this.barcode=barcode;
	}

	@Override
	public int getBarcode() {
		// TODO Auto-generated method stub
		return barcode;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Id:"+getId()+"\n"+
				"Name:"+getName()+"\n"+
				"Barcode:"+getBarcode()+"\n"+
				"Language:"+getLanguage()+"\n"+
				"Price:"+getPrice());
	}
	@Override
	public void showPrice() {
		// TODO Auto-generated method stub
		if(price!=0&&amount!=0){
			System.out.println("»ù¿ú"+price*amount);
			};
	}

}
