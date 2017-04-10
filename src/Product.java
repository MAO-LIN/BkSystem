
public abstract class Product {
	protected int id,barcode,price;
	protected String name;
	public Product(){}
	public Product(int id, String name,int barcode){
		this.id=id;
		this.name=name;
		this.barcode=barcode;
	}
	public abstract void setName(String name);
	public abstract String getName();
	public abstract void setId(int id);
	public abstract int getId();
	public abstract void setBarcode(int barcode);
	public abstract int getBarcode();
	public abstract void show();
	
	
}
