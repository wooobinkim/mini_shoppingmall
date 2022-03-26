package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Dto.ProductDto;
import Util.DBUtil;

public class ProductDaoImpl implements ProductDao {
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	@Override
	public void insertprd(ProductDto p) throws SQLException {
		con = DBUtil.getConnection();
		String sql = "insert into product (prdname, prdprice, prdstack) values (?,?,?)";
		ps = con.prepareStatement(sql);
		ps.setString(1, p.getPrdname());
		ps.setString(2, p.getPrdprice());
		ps.setString(3, p.getPrdstack());
		ps.executeUpdate();
		DBUtil.close(ps, con);
	}

	@Override
	public ArrayList<ProductDto> listprd() throws SQLException{
		con = DBUtil.getConnection();
		String sql = "select prdid,prdname,prdprice,prdstack from product";
		ps = con.prepareStatement(sql);
		rs = ps.executeQuery();
		ArrayList<ProductDto> list = new ArrayList<ProductDto>();
		while(rs.next()) {
			list.add(new ProductDto(rs.getString("prdid"), 
					rs.getString("prdname"), 
					rs.getString("prdprice"), 
					rs.getString("prdstack")));
		}
		System.out.println("리스트드가자~");
		System.out.println(list);
		DBUtil.close(rs, ps, con);
		return list;
	}

	@Override
	public void deleteprd(String prdid) throws SQLException{
		con = DBUtil.getConnection();
		String sql = "delete from product where prdid = ?";
		ps = con.prepareStatement(sql);
		ps.setString(1, prdid);
		ps.executeUpdate();
		DBUtil.close(ps, con);
	}

	@Override
	public void selectprd(ProductDto p) throws SQLException{
		con = DBUtil.getConnection();
		String sql = "update product set prdname=?,prdprice=?,prdstack=? where prdid=?";
		ps = con.prepareStatement(sql);
		ps.setString(1, p.getPrdname());
		ps.setString(2, p.getPrdprice());
		ps.setString(3, p.getPrdstack());
		ps.setString(4, p.getPrdid());
		ps.executeUpdate();
		DBUtil.close(ps, con);
		
	}

}
