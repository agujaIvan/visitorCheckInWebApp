package edu.matc.persistence;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import edu.matc.entity.ibatis.ClassTable;
import edu.matc.entity.ibatis.SectionTable;
import edu.matc.entity.ibatis.StyleTable;
import edu.matc.entity.ibatis.UserTable;
import org.apache.log4j.Logger;

import java.io.*;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class IbatisJava{
    Reader rd;
    SqlMapClient smc;
    private final Logger log = Logger.getLogger(this.getClass());

    public void addRecord(String s, Object t){
        try {
            rd = Resources.getResourceAsReader("SqlMapConfig.xml");
            smc = SqlMapClientBuilder.buildSqlMapClient(rd);

            if (s.equals("Class.addNewRecord")) {
                t = (ClassTable) t;
            } else if (s.equals("User.addNewRecord")){
                t = (UserTable) t;
            } else if (s.equals("SectionTable.addNewRecord")){
                t = (SectionTable) t;
            }
            smc.insert(s, t);

            System.out.println("Record Inserted Successfully ");

        } catch (IOException e ) {
            log.info("Error adding new record", e);
        } catch (SQLException e) {
            log.info("Error adding new record", e);
        }
    }

    public List<UserTable> getUserByIdAndPassword(String userName, String userPassword) {
        UserTable userTable = new UserTable();
        userTable.setUserName(userName);
        userTable.setUserPassword(userPassword);
        List<UserTable> userTableList = new ArrayList<>();
        //TODO get the section by id
        try {
            rd = Resources.getResourceAsReader("SqlMapConfig.xml");
            smc = SqlMapClientBuilder.buildSqlMapClient(rd);

            userTableList = (List<UserTable>) smc.queryForList("User.getByIdAndPassword", userTable);

        } catch (IOException e ) {
            log.info("Error getting the user by Id and password ", e);
        } catch (SQLException e) {
            log.info("Error getting the user by Id and password ", e);
        }

        return userTableList;
    }

    public void updateUser(UserTable user){
        try {
            rd = Resources.getResourceAsReader("SqlMapConfig.xml");
            smc = SqlMapClientBuilder.buildSqlMapClient(rd);

            smc.update("User.update", user);

        } catch (IOException e ) {
            log.info("Error updating user profile", e);
        } catch (SQLException e) {
            log.info("Error updating user profile", e);
        }
    }

    public List<Object> getAllRecords(String s){
        List<Object> t = new ArrayList<>();
        try {
            rd = Resources.getResourceAsReader("SqlMapConfig.xml");
            smc = SqlMapClientBuilder.buildSqlMapClient(rd);
            t = smc.queryForList(s, null);
        } catch (SQLException e){
            log.info("Error getting all records", e);
        } catch (IOException e){
            log.info("Error getting all records", e);
        }
        return t;
    }

    public Object getTheLastId(String s){
        Object t = new Object();
        try {
            rd = Resources.getResourceAsReader("SqlMapConfig.xml");
            smc = SqlMapClientBuilder.buildSqlMapClient(rd);
            t = smc.queryForObject(s);
        } catch (SQLException e){
            log.info("Error getting all records", e);
        } catch (IOException e){
            log.info("Error getting all records", e);
        }
        return t;
    }
}