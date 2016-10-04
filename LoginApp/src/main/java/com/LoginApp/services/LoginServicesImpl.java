package com.LoginApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LoginApp.dao.LoginDao;
import com.LoginApp.form.userForm;

@Service
public class LoginServicesImpl implements LoginService {

	@Autowired
	private LoginDao loginDao;
	
	@Override
	public void Save(userForm form) {
		loginDao.Save(form);
		
	}

	@Override
	public userForm passwordCheck() {
		// TODO Auto-generated method stub
		return null;
	}

}
