package com.hs.s1.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.hs.s1.util.DBConnector;

public class MembersDAO {

	public int memberJoin(MembersDTO membersDTO) throws Exception {
		Connection con = DBConnector.getConnection();
		String sql = "insert into MEMBERS\n" + "values(?, ?, ?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, membersDTO.getId());
		ps.setString(2, membersDTO.getPw());
		ps.setString(3, membersDTO.getName());
		ps.setString(4, membersDTO.getBirth());
		ps.setString(5, membersDTO.getPhone());
		ps.setString(6, membersDTO.getSex());

		int result = ps.executeUpdate();

		ps.close();
		con.close();

		return result;
	}// === memberJoin method END ===

}
