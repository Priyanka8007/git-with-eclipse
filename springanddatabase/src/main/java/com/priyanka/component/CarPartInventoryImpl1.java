package com.priyanka.component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Component;
@Component("carParts1")
public class CarPartInventoryImpl1 implements CarPartsInventory {
	public void addNewPart(CarPart carPart)   {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring","root","root");
			PreparedStatement stn= conn.prepareStatement("insert into carpet(partname,carmodel,price,quantity) values(?,?,?,?)");
			stn.setString(1,carPart.getPartName());
			stn.setString(2, carPart.getCarMode());
			stn.setDouble(3, carPart.getPrice());
			stn.setInt(4, carPart.getQuantity());
			stn.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public List<CarPart> getAvailableParts() {
		
		return null;
	}

}
