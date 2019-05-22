package com.mahe.Service;

import com.mahe.model.CustomerLogin;

public interface CustomerLoginService {
	public boolean authenticateCustomerLogin(CustomerLogin customerLogin) throws Exception;

}
