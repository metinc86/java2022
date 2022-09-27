package oop1;

public class Main {

	public static void main(String[] args) {
		String mesaj="Vade oranı ";
		
		Product product1 = new Product(); 
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitprice(7500); 
		product1.setUnitsInStock(3);
		product1.setImageURL("image1.jpg");
		
		Product product2 = new Product(); 
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitprice(6500); 
		product2.setUnitsInStock(3);
		product2.setImageURL("image2.jpg");
		
		Product product3 = new Product(); 
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(5);
		product3.setUnitprice(4500); 
		product3.setUnitsInStock(8);
		product3.setImageURL("image3.jpg");
		
		Product[] products = {product1, product2, product3}; 
		
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" +product.getName() + "</li>");			
		}
		System.out.println("</ul>"); 
		
		IndividualCustomer individualCustomer = new IndividualCustomer(); 
		individualCustomer.setId(1);
		individualCustomer.setPhone("05222222222"); 
		individualCustomer.setFirstName("Metin"); 
		individualCustomer.setLastName("Canimoglu"); 
		
		CorporateCustomer corporateCustomer = new CorporateCustomer(); 
		corporateCustomer.setId(2); 
		corporateCustomer.setPhone("05333333"); 
		corporateCustomer.setCustomerNumber("54321"); 
		corporateCustomer.setCompanyName("Kodlama.io"); 
		corporateCustomer.setTaxNumber("12345"); 
		
		Customer[] customer = {individualCustomer, corporateCustomer};

	}

}
