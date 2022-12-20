package com.velocity.assignment15;

public class PolicyMainClass {

	public static void main(String[] args) {
		
		// Create an Object of Policy Class
		Policy policy = new Policy();
		
		Policy result = policy.getPolicyDetails();
		 
		System.out.println(" Policy information is >>> " + result); 
	}

}
 