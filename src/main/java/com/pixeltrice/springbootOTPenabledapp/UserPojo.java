package com.pixeltrice.springbootOTPenabledapp;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class UserPojo  {

		
		@Id
		@Column(name="username")
		private String username;
		
		@Column(name="password")
		private String password;
		
		@Column(name="role")	
		private String role;
		
		@Column(name="full_name")	
		private String fullName;
		
		@Column(name="country")	
		private String country;
		
		
		public String getUsername() {
			return username;
		}
		
		public void setUsername(String username) {
			this.username = username;
		}
		
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
		public String getRole() {
			return role;
		}
		
		public void setRole(String role) {
			this.role = role;
		}
		
		public String getFullName() {
			return fullName;
		}
		
		public void setFullName(String fullName) {
			this.fullName = fullName;
		}
		
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		 
		
	}	 


