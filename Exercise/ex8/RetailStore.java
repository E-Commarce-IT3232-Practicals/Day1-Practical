//implement classes for the given scenario:
//A reatail store which can store,edit,and delete multible products like fruits, vegetables, grocery, etc..
//display the avilabe products like price, name, quantity

import java.util.ArrayList;

class Product {
	private String name;
	private double price;
	private int quantity;
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void displayProduct() {
		System.out.println("Name: " + name + ", Price: $" + price + ", Quantity: " + quantity);
	}
}

class Fruit extends Product {
	private String color;
	
	public Fruit(String name, double price, int quantity, String color) {
		super(name, price, quantity);
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public void displayProduct() {
		super.displayProduct();
		System.out.println("Color: " + color);
	}
}

class Vegetable extends Product {
	private String season;
	
	public Vegetable(String name, double price, int quantity, String season) {
		super(name, price, quantity);
		this.season = season;
	}
	
	public String getSeason() {
		return season;
	}
	public void setSeason(String color) {
		this.season = season;
	}
	
	@Override
	public void displayProduct() {
		super.displayProduct();
		System.out.println("Season: " + season);
	}
}

class Grocery extends Product {
	private String category;
	
	public Grocery(String name, double price, int quantity, String category) {
		super(name, price, quantity);
		this.category = category;
	}
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	@Override
	public void displayProduct() {
		super.displayProduct();
		System.out.println("Category: " + category);
	}
}

class Store {
	private ArrayList<Product> products;
	
	public Store() {
		products = new ArrayList<>();
	}
	
	public void addProduct(Product product) {
		products.add(product);
	}
	
	public void editProduct(int index, String name, double price, int quantity) {
		if(index >= 0 && index < products.size()) {
			Product product = products.get(index);
            product.setName(name);
            product.setPrice(price);
            product.setQuantity(quantity);
		}
		else {
			System.out.println("Product not found!");
		}
	}
	
	public void deleteProducts(int index) {
		if(index >= 0 && index < products.size()) {
			products.remove(index);
		}
		else {
            System.out.println("Product not found!");
        }
	}
	
	public void displayProducts() {
		if(products.isEmpty()) {
			System.out.println("No products available.");
		}
		else {
			for (Product product : products) {
                product.displayProduct();
                System.out.println("-----");
            }
		}
	}
}

public class RetailStore {
	public static void main(String args[]) {
		Store store = new Store();
		
		store.addProduct(new Fruit("Apple", 1.5, 100, "Red"));
        store.addProduct(new Vegetable("Carrot", 0.8, 200, "Winter"));
        store.addProduct(new Grocery("Rice", 2.0, 50, "Grain"));
		
		System.out.println("Available Products in Store:");
        store.displayProducts();

        System.out.println("\nEditing the price of the first product...");
        store.editProduct(0, "Apple", 1.7, 100);
        store.displayProducts();

        System.out.println("\nDeleting the second product...");
        store.deleteProducts(1);
        store.displayProducts();
	}
}