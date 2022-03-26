package Service;

import java.sql.SQLException;
import java.util.ArrayList;

import Dto.ProductDto;

public interface ProductService {
	
	public void insertprd (ProductDto p) throws SQLException;
	
	public ArrayList<ProductDto> listprd () throws SQLException;
	
	public void deleteprd (String prdid) throws SQLException;
	
	public void selectprd (ProductDto p) throws SQLException;
	

}
