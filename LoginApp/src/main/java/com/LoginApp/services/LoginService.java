package com.LoginApp.services;

import com.LoginApp.form.userForm;

public interface LoginService {

	public void Save(userForm form);
	public userForm passwordCheck();

}
