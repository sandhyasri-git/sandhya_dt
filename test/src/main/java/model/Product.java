package model;

import dao.ProductDAO;
import dao.ProductDAOImpl;

public class Product {
	private String modelId;
	private String description;
	private String manuId;
	private int prodQty;
	private double prodPrice;
	/**
	 * 
	 */
	public Product() {
		//super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param modelId
	 * @param description
	 * @param manuId
	 * @param pQty
	 * @param pPrice
	 */
	public Product(String mi, String desc, String mid, int pqty, double ppc) {
		//super();
		this.modelId = mi;
		this.description = desc;
		this.manuId = mid;
		this.prodQty = pqty;
		this.prodPrice = ppc;
	}
		/*public ProductDAO getProductList()
	{
		ProductDAO p1=new ProductDAOImpl();
		return p1;
	}*/
	/**
	 * @return the modelId
	 */
	/**
	 * @return the modelId
	 */
	public String getModelId() {
		return modelId;
	}
	/**
	 * @param modelId the modelId to set
	 */
	public void setModelId(String modelId) {
		this.modelId = modelId;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the manuId
	 */
	public String getManuId() {
		return manuId;
	}
	/**
	 * @param manuId the manuId to set
	 */
	public void setManuId(String manuId) {
		this.manuId = manuId;
	}
	/**
	 * @return the prodQty
	 */
	public int getProdQty() {
		return prodQty;
	}
	/**
	 * @param prodQty the prodQty to set
	 */
	public void setProdQty(int prodQty) {
		this.prodQty = prodQty;
	}
	/**
	 * @return the prodPrice
	 */
	public double getProdPrice() {
		return prodPrice;
	}
	/**
	 * @param prodPrice the prodPrice to set
	 */
	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}
	
}
