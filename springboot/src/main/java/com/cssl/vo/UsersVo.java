package com.cssl.vo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UsersVo {
	
	private String username;	
	private String password;
		
	@JsonFormat(pattern = "yyyy年MM月dd日")
	private Date bornDate;
}
