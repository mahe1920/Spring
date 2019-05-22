package com.mahe.DAO;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.mahe.model.CustomerLogin;

@Repository(value = "customerLoginDAO")
public class CustomerLoginDAOImpl implements CustomerLoginDAO{

	@Override
	public CustomerLogin getCustomerLoginByName(String loginName) {
		// TODO Auto-generated method stub
		Map<String, String> customerCredentials = new HashMap<>();
        customerCredentials.put("tom", "tom123");
        customerCredentials.put("harry", "harry123");
        customerCredentials.put("garry", "garry123");
        customerCredentials.put("monica", "mocica123");
        CustomerLogin customerLogin = new CustomerLogin();
        customerLogin.setUsername(loginName);
        customerLogin.setPassword(customerCredentials.get(loginName));
        return customerLogin;
	}
	

}
