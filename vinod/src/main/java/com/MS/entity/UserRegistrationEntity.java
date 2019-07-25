package com.MS.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="vinod_reg")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRegistrationEntity {
	
	@Id
	private int id;
	
	private String ename;
	public void setename(String ename) {
		this.ename = ename;
	}
	public void seteUsername(String eUsername) {
		this.eUsername = eUsername;
	}
	public void setePassword(String ePassword) {
		this.ePassword = ePassword;
	}
	@Column(name ="eusername")
	private String eUsername;
	@Column(name ="epassword")
	private String ePassword;
	
	
	
}
