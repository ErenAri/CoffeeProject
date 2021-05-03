package Entities;

import java.util.Date;

import Abstract.Entity;

public class Customer implements Entity{
	public int Id;
	public String FirstName;
	public String LastName;
	public Date DateofBirth;
	public String NationalyIdentity;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public Date getDateofBirth() {
		return DateofBirth;
	}
	public void setDateofBirth(Date dateofBirth) {
		DateofBirth = dateofBirth;
	}
	public String getNationalyIdentity() {
		return NationalyIdentity;
	}
	public void setNationalyIdentity(String nationalyIdentity) {
		NationalyIdentity = nationalyIdentity;
	}
}
