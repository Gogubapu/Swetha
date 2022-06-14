package com.example.Project.model;

import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import javax.validation.constraints.Pattern;

//Enitity annotations is used to create table in database.
@Entity
@Table(name = "Employee")
public class Employeee
{
	//Creating data members for the application ,below
    	@Id
    	@Column(name="id")
	@Size(min=1,max=10,message="The ID should follow upto 6 digits of alphanumeric only.")
	private String id;
	
	@NotNull
	@Column(name = "firstname")
	@Size(min=1,max=25,message="The First Name is maximum 25 characters only.")
	private String firstname;
	
	@NotNull
	@Column(name = "lastname")
	@Size(min=2,max=25,message="The Last Name is maximum 25 characters only.")
	private String lastname;
	
	@NotNull
	@Email(message="Enter a valid E-mail address..")
	@Column(name = "email")
	private String email;
	
	@Pattern(regexp="^\\d{10}$",message="Enter a valid mobile number 10 digits only..")
	@Column(name="mobile")
	private String mobileNumber;
	
	@NotNull
	@Size(min=10,max=150,message="Enter your address maximum alphanumeric characters and numbers ,special characters..")
	@Column(name="address")
	private String address;
	
	@NotNull(message="Please enter employee designation..")
	@Size(max=25)
	@Column(name="designation")
	private String designation;
	
	@NotNull(message="Please enter employee location..")
	@Size(max=25)
	@Column(name="location")
	private String location;
	
	@NotNull
	@Column(name="date_of_joining")
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private String dateOfJoining;
	
	@NotNull(message="please choose one from the dropdown for department ")
        @Column(name="department")
        private String department;
	
	@DateTimeFormat(pattern="yyyy-mm-dd")
	@Column(name="date_of_termination")
	private String dateOfTermination;
	
	@NotNull(message="please enter employee details..")
	@Column(name="status_of_Employee")
	private String status;
	
		
	//Generated getters and setters Methods above data members.
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getMobileNumber(){
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber){
		this.mobileNumber=mobileNumber;
	}
	
	public String getAddress(){
		return address;
	}
	public void setAddress(String address){
		this.address=address;
	}
	
	public String getDesignation(){
		return designation;
	}
	public void setDesignation(String designation){
		this.designation=designation;
	}
	public String getDepartment(){
		return department;
	}
	public void setDepartment(String department) {
		this.department=department;
	}
	public String getDateOfJoining(){
		return dateOfJoining;
	}
	public void setDateOfJoining(String dateOfJoining){
		this.dateOfJoining=dateOfJoining;
	}
	public String getDateOfTermination(){
		return dateOfTermination;
	}
	public void setDateOfTermination(String dateOfTermination){
		this.dateOfTermination=dateOfTermination;
	}
	
	public String getStatus(){
		return status;
	}
	public void setStatus(String status){
		this.status=status;
	}
	
	public String getLocation(){
		return location;
	}
	public void setLocation(String location){
		this.location=location;
	}
	
}

	
	





