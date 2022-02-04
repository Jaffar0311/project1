package com.revature.daos;

import com.revature.model.Reimbursement;
import com.revature.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReimbursementDaoImpl implements ReimbursementDAO {
    @Override
    public int addReimbursement(Reimbursement reimbursement) {
        String sql = "insert into ers_reimbursement (users_id, reimb_type, status_type, reimb_amount, reimb_submitted, reimb_resolved, reimb_description, reimb_receipt ) values (?,?,?,?,?,?,?,?,?)";
        try(Connection conn = ConnectionUtil.getConnection()){
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, reimbursement.getReimbursementId());
            ps.setInt(2, reimbursement.getUser_id());
            ps.setInt(3, reimbursement.getReimbursementType().ordinal());
            ps.setInt(4, reimbursement.getReimbursementStatus().ordinal());
            ps.setDouble(5, reimbursement.getReimbursementAmount());
            ps.setBoolean(6, reimbursement.isReimbusementSubmitted());
            ps.setBoolean(7, reimbursement.isReimbusementResolved());
            ps.setString(8,reimbursement.getDescription());
            ps.setBoolean(9,reimbursement.ReimbursmentReceipt());

            ps.executeQuery();


            ResultSet keys = ps.getGeneratedKeys();
            if(keys.next()) {
                System.out.println("successfully added the reimbursement");
                return keys.getInt(1);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
