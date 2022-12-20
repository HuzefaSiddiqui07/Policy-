/*
* Assignment 15
* Program-1
* Date : 04/12/2022
1.1 Design the Policy class that contain policy id, policy name,
policy type, premium amount etc.
1.2 Design the below method into Policy class and which return the
policy object
public Policy getPolicyDetails()
1.3 Input should be taken from user and print that data into
getPolicyDetails () method.
*/

package com.velocity.assignment15;

import java.util.Scanner;

public class Policy {
	
	// Declare
	private int id;
	private String policyName;
	private String policyType;
	private int premiumAmount;
	
	// Use Getter Setter 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public String getPolicyType() {
		return policyType;
	}
	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}
	public int getPremiumAmount() {
		return premiumAmount;
	}
	public void setPremiumAmount(int premiumAmount) {
		this.premiumAmount = premiumAmount;
	}
	
	// Create Method
	public Policy getPolicyDetails() {
		
		// Create Scanner Object
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Enter the policy name >>> ");
		policyName = scan.nextLine();
		
		System.out.println(" Enter the policy type >>> ");
		policyType = scan.nextLine();
		
		System.out.println(" Enter policy id >>> ");
		id = scan.nextInt();
		
		System.out.println(" Enter the amount >>> ");
		premiumAmount = scan.nextInt();
		
		// Create an Object of Policy Class
		Policy p = new Policy();
		
		// Set the Value from user through object of policy class
		p.setId(id);
		p.setPolicyName(policyName);
		p.setPolicyType(policyType);
		p.setPremiumAmount(premiumAmount);
		
		return p;
	}
	@Override
	public String toString() {
		return "Policy [id=" + id + ", policyName=" + policyName + ", policyType=" + policyType + ", premiumAmount="
				+ premiumAmount + "]";
	}
	
 }