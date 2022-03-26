package Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.sun.corba.se.pept.transport.Connection;

import Dao.ProductDao;
import Dao.ProductDaoImpl;
import Dto.ProductDto;

public class ProductServiceImpl implements ProductService{
	private ProductDao pdao;
	
	public ProductServiceImpl() {
		pdao = new ProductDaoImpl();
	}

	@Override
	public void insertprd(ProductDto p) throws SQLException{
	}


	@Override
	public ArrayList<ProductDto> listprd() throws SQLException{
		return null;
	}


	@Override
	public void deleteprd(String prdid) throws SQLException{
		
	}


	@Override
	public void selectprd(ProductDto p) throws SQLException{
		
	}
}
