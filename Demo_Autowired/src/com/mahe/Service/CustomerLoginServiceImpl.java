package com.mahe.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mahe.DAO.CustomerLoginDAO;
import com.mahe.model.CustomerLogin;

@Service(value = "customerLoginService")
public class CustomerLoginServiceImpl implements CustomerLoginService{
	
	@Autowired
	private CustomerLoginDAO customerLoginDAO;

	@Override
	public boolean authenticateCustomerLogin(CustomerLogin customerLogin) throws Exception {
		// TODO Auto-generated method stub
		boolean isValid = false;
		CustomerLogin customerLoginfromDAO = customerLoginDAO.getCustomerLoginByName(customerLogin.getUsername());
		if(customerLogin.getPassword().equals(customerLoginfromDAO.getPassword()))
			isValid = true;
		return isValid;
	}

}
