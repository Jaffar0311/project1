package com.revature.daos;

import com.revature.model.User;
import com.revature.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao{
    @Override
    public boolean createUser(User user) {
        String sql = "insert into users()values(?, ?, ?, ?, ?, ?)";
        try(Connection c = ConnectionUtil.getConnection();
            PreparedStatement ps = c.prepareStatement(sql); ){
            ps.setInt(1, user.getRole().ordinal());
            // set first as param index 2  -- set the name using the person object (p)
            ps.setString(2, user.getFirstName());
            ps.setString(3, user.getLastName());
            ps.setString(4, user.getEmail());
            ps.setString(5, user.getPassword());


            int rowsAffected = ps.executeUpdate();
            if(rowsAffected == 1){
                return true;
            }

        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    }

