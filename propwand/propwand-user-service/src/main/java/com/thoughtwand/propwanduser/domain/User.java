package com.thoughtwand.propwanduser.domain;

import javax.persistence.*;

/**
 * @author Dayan Kodippily - 18/05/20
 */

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Enumerated(EnumType.STRING)
	private UserSalutation salutation;

	@Column(unique = true, nullable = false)
	private String email;

	@Column(nullable = false)
	private String firstName;

	@Column(nullable = false)
	private String lastName;

	@Enumerated(EnumType.STRING)
	private UserSex userSex;

	@Enumerated(EnumType.STRING)
	private UserStatus userStatus;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UserSalutation getSalutation() {
		return salutation;
	}

	public void setSalutation(UserSalutation salutation) {
		this.salutation = salutation;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public UserSex getUserSex() {
		return userSex;
	}

	public void setUserSex(UserSex userSex) {
		this.userSex = userSex;
	}

	public UserStatus getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(UserStatus userStatus) {
		this.userStatus = userStatus;
	}

}
