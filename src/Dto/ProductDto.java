package Dto;

public class ProductDto {
	private String prdid;
	private String prdname;
	private String prdprice;
	private String prdstack;
	
	public ProductDto(String prdid, String prdname, String prdprice, String prdstack) {
		super();
		this.prdid = prdid;
		this.prdname = prdname;
		this.prdprice = prdprice;
		this.prdstack = prdstack;
	}

	public String getPrdid() {
		return prdid;
	}

	public void setPrdid(String prdid) {
		this.prdid = prdid;
	}

	public String getPrdname() {
		return prdname;
	}

	public void setPrdname(String prdname) {
		this.prdname = prdname;
	}

	public String getPrdprice() {
		return prdprice;
	}

	public void setPrdprice(String prdprice) {
		this.prdprice = prdprice;
	}

	public String getPrdstack() {
		return prdstack;
	}

	public void setPrdstack(String prdstack) {
		this.prdstack = prdstack;
	}
	
	
	


	
	
}
