package com.chess.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;

import com.chess.model.Arm;
import com.chess.util.DbUtil;

public class DataAccess {

	private static DbUtil dbUtil = new DbUtil();;
	
	public static ResultSet getArmsByRace(Connection con, String race) throws Exception {
		String sql = "select * from arm where race = ?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, race);
		return pstmt.executeQuery();
	}
	
	public static void setArmInfo(Connection con, Map<String, Arm> map, String race) {
		try {
			con = dbUtil.getCon();
			ResultSet rs = DataAccess.getArmsByRace(con, race);
			while (rs.next()) {
				Arm arm = new Arm();
				arm.name      = rs.getString("name");
				arm.categ     = rs.getString("categ");
				arm.cost      = rs.getInt("cost");
				arm.scale     = rs.getInt("scale");
				arm.cur_scale = rs.getInt("scale");
				arm.uhp       = rs.getInt("uhp");
				arm.ga        = rs.getString("g_a");
				arm.speed     = rs.getInt("speed");
				arm.me_arm    = rs.getInt("me");
				arm.ra_arm    = rs.getInt("ra");
				arm.ch_arm    = rs.getInt("ch");
				arm.dama      = rs.getInt("dama");
				arm.ap        = rs.getInt("ap");
				arm.type      = rs.getString("type");
				arm.range     = rs.getInt("range");
				arm.ammo      = rs.getInt("ammo");
				arm.d_dama    = rs.getInt("d_dama");
				arm.d_ap      = rs.getInt("d_ap");
				int mark = rs.getInt("magic");
				arm.magic = (mark == 1);
				arm.defense   = rs.getInt("defense");
				arm.output    = rs.getInt("output");
				arm.overview  = rs.getString("overview");
				
				map.put(arm.name, arm);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				dbUtil.closeCon(con);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
