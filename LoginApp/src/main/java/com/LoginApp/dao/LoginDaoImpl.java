package com.LoginApp.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.LoginApp.form.userForm;

@Repository
public class LoginDaoImpl implements LoginDao {
	

	@Autowired
	private DataSource dataSource;
	
	@Override
	public void Save(userForm form) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "INSERT INTO user_info (User_name,User_pwd) VALUES (?,?)";
		 jdbcTemplate.update(sql,
					 				form.getUserName(),
					  				form.getPassword());
		 jdbcTemplate.update(sql,new Object[]{
				 				form.getUserName(),
				  				form.getPassword()});
		 System.out.println("[LoginDaoImpl][save] New account save status : sucess ");
	}

	@Override
	public userForm passwordCheck() {
		
		return null;
	}

}
