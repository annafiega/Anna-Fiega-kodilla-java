package com.kodilla.jdbc;

import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.Assert.assertEquals;

public class StoredProcTestSuite {
    @Test
    public void testUpdateVipLevels() throws SQLException {
        //given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL=\"Not set\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);

        //when
        String sqlProcedureCall ="CALL UpdateVipLevels()";
        statement.execute(sqlProcedureCall);

        //then
        String sqlCheckTable="SELECT COUNT(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL=\"Not set\"";
        ResultSet rs = statement.executeQuery(sqlCheckTable);
        int howMany =-1;
        if (rs.next()){
            howMany = rs.getInt("HOW_MANY");
        }
        assertEquals(0,howMany);
    }

    @Test
    public void testUpdateBestsellers() throws  SQLException{
        //given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE BOOKS SET BESTSELLER=3";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);

        //when
        String sqlProcedureCall ="CALL UpdateBestseller()";
        statement.execute(sqlProcedureCall);

        //then
        String sqlCheckTable="SELECT COUNT(*) AS HOW_MANY FROM BOOKS WHERE BESTSELLER=3";
        ResultSet rs = statement.executeQuery(sqlCheckTable);
        int howMany =-1;
        if (rs.next()){
            howMany = rs.getInt("HOW_MANY");
        }
        assertEquals(0,howMany);
    }
}
