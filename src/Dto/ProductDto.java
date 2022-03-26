package Dto;

public class ProductDto {
	static int prdid;
	static String prdname;
	static String prdprice;
	static String prdstack;
	
	public ProductDto(int prdid, String prdname, String prdprice, String prdstack) {
		super();
		this.prdid = prdid;
		this.prdname = prdname;
		this.prdprice = prdprice;
		this.prdstack = prdstack;
	}
	
	
	public static int getPrdid() {
		return prdid;
	}
	public static void setPrdid(int prdid) {
		ProductDto.prdid = prdid;
	}
	public static String getPrdname() {
		return prdname;
	}
	public static void setPrdname(String prdname) {
		ProductDto.prdname = prdname;
	}
	public static String getPrdprice() {
		return prdprice;
	}
	public static void setPrdprice(String prdprice) {
		ProductDto.prdprice = prdprice;
	}
	public static String getPrdstack() {
		return prdstack;
	}
	public static void setPrdstack(String prdstack) {
		ProductDto.prdstack = prdstack;
	}


	
	
}
