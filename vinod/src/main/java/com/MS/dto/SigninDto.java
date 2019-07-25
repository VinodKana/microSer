package com.MS.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SigninDto {

	private String loginUsernameAcc;
	private String loginPasswordAcc;
}
