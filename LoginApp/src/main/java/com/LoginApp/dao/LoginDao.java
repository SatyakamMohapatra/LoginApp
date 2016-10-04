package com.LoginApp.dao;

import com.LoginApp.form.userForm;

public interface LoginDao {
	
	public void Save(userForm form);
	public userForm passwordCheck();

}
