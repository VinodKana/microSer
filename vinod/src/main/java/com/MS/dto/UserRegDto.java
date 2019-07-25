package com.MS.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRegDto {

	
	public String getEname() {
		return ename;
	}
	public String getEusername() {
		return eusername;
	}
	public String getEpass() {
		return epass;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setEusername(String eusername) {
		this.eusername = eusername;
	}
	public void setEpass(String epass) {
		this.epass = epass;
	}
	private String ename;	

	private String eusername;
	private String epass;
	
}
