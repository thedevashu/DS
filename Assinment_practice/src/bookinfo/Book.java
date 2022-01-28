package bookinfo;

public class Book {
	private int id;
	private String name;
	private int price;
	private int quant;
	public Book(int id,String name,int price,int quant) {
		this.setId(id);
		this.setName(name);
		this.setPrice(price);
		this.setQuant(quant);
	}
	public String toString() {
		String str ="";
		str +="Book id: "+ id+ ",Book name: "+ name+",Book price: "+price+",Quantity:"+quant;
	
		return str ;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}
	
}
