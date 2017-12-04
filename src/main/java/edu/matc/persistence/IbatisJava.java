package edu.matc.persistence;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import edu.matc.entity.ibatis.ClassTable;
import edu.matc.entity.ibatis.SectionTable;
import edu.matc.entity.ibatis.UserTable;
import edu.matc.entity.ibatis.VisitorsTable;
import org.apache.log4j.Logger;

import java.io.*;
import java.sql.SQLException;
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
            }  else if (s.equals("VisitorsTable.addNewRecord")){
                t = (VisitorsTable) t;
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

    public List<Object> getAllRecords(String s, Object obj){
        List<Object> t = new ArrayList<>();
        try {
            rd = Resources.getResourceAsReader("SqlMapConfig.xml");
            smc = SqlMapClientBuilder.buildSqlMapClient(rd);

            if (obj == null) {
                t = smc.queryForList(s, null);
            } else {
                t = smc.queryForList(s, obj);
            }
        } catch (SQLException e){
            log.info("Error getting all records", e);
        } catch (IOException e){
            log.info("Error getting all records", e);
        }
        return t;
    }

    public Object getRecordById(String s, Object obj){
        Object t = new Object();
        try {
            rd = Resources.getResourceAsReader("SqlMapConfig.xml");
            smc = SqlMapClientBuilder.buildSqlMapClient(rd);
            if (obj == null) {
                t = smc.queryForObject(s);
            } else {
                t = smc.queryForObject(s, obj);
            }
        } catch (SQLException e){
            log.info("Error getting all records", e);
        } catch (IOException e){
            log.info("Error getting all records", e);
        }
        return t;
    }

    public int deleteRecordById(String s, Object obj){
        int result = 0;
        try {
            rd = Resources.getResourceAsReader("SqlMapConfig.xml");
            smc = SqlMapClientBuilder.buildSqlMapClient(rd);

                result = smc.delete(s, obj);
            }
         catch (SQLException e){
            log.info("Error getting all records", e);
        } catch (IOException e){
            log.info("Error getting all records", e);
        }
        return result;
    }
}