/**
 * 
 */
package com.signify.client;

import com.signify.service.CustomerService;

/**
 * @author dp201
 *
 */
public class Customerlient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create the instance of the customer!!
		
		CustomerService service = new CustomerService();
		service.createCustomer();
		service.deleteCustomer(101);
		service.updateCustomer(101);
		service.listCustomer();

	}

}
