package dao;

import java.util.ArrayList;
import java.util.List;

import model.Product;

public class ProductDAOImpl extends model.Product implements ProductDAO{

	ArrayList<Product>p=new ArrayList<Product>();
	
	public ArrayList<Product> getProductList() {
		
		Product p1 = new Product("M001","Violin","M1001",3,10000.00);
		p.add(p1);
		Product p2 = new Product("M002","Veena","M1002",1,11000.00);
		p.add(p2);
		Product p3 = new Product("M003","Violin","M1003",4,12000.00);
		p.add(p3);
		Product p4 = new Product("M004","Veena","M1003",2,13000.00);
		p.add(p4);
		Product p5 = new Product("M005","Piano","M1005",5,1000.00);
		p.add(p5);
		return p;
		
	}


}
