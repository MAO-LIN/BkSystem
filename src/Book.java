
public class Book extends Product implements Sell{
	private int isbn,amount;
	public Book(int id,String name,int barcode,int isbn){
		super(id,name,barcode);
		this.isbn=isbn;
	}

	public void setIsbn(int isbn) {
		// TODO Auto-generated method stub
		this.isbn=isbn;
	}
	
	public int getIsbn() {
		// TODO Auto-generated method stub
		return isbn;
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
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Id:"+getId()+"\n"+
				"Name:"+getName()+"\n"+
				"Isbn:"+getIsbn()+"\n"+
				"Barcode:"+getBarcode()+"\n"+
				"Price:"+getPrice()+"\n");
	}

	@Override
	public void showPrice() {
		// TODO Auto-generated method stub
		if(price!=0&&amount!=0){
			System.out.println("價錢"+price*amount);
		}else{
			System.out.println("價錢或數量未輸入");
		};
	}
}
