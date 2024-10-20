//package org.ass.ums.entity;
//
//import java.io.Serializable;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//import org.hibernate.annotations.GenericGenerator;
//
//@Entity
//@Table(name = "user_register_info")
//public class RegisterEntity implements Serializable {
//
//	@Id
//	@GenericGenerator(name="auto", strategy = "increment")
//	@GeneratedValue(generator = "auto")
//	@Column(name = "alt_key")
//	private long altKey;
//
//	@Column(name="frist_name")
//	private String firstName;
//
//	@Column(name="contact_number")
//	private String contactNumber;
//
//	@Column(name="email")
//	private String email;
//
//	@Column(name="password")
//	private String password;
//
//	@Column(name="country")
//	private String country;
//
//	public long getAltKey() {
//		return altKey;
//	}
//
//	public void setAltKey(long altKey) {
//		this.altKey = altKey;
//	}
//
//	public String getFirstName() {
//		return firstName;
//	}
//
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//
//	public String getContactNumber() {
//		return contactNumber;
//	}
//
//	public void setContactNumber(String contactNumber) {
//		this.contactNumber = contactNumber;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public String getCountry() {
//		return country;
//	}
//
//	public void setCountry(String country) {
//		this.country = country;
//	}
//
//	@Override
//	public String toString() {
//		return "RegisterEntity [altKey=" + altKey + ", firstName=" + firstName + ", contactNumber=" + contactNumber
//				+ ", email=" + email + ", password=" + password + ", country=" + country + "]";
//	}
//	
//	
//
//}

package org.ass.ums.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="register_info")
public class RegisterEntity implements Serializable{
	
	@Id
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	@Column(name="alt_key")
	private long altkey;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="contact_number")
	private String contactNumber;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="country")
	private String country;

	public long getAltkey() {
		return altkey;
	}

	public void setAltkey(long altkey) {
		this.altkey = altkey;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "RegisterEntity [altkey=" + altkey + ", firstName=" + firstName + ", contactNumber=" + contactNumber
				+ ", email=" + email + ", password=" + password + ", country=" + country + "]";
	}

	
	
}
