package com.cbdsp.bean;

import java.nio.channels.ScatteringByteChannel;

import org.apache.commons.io.filefilter.TrueFileFilter;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@Accessors(chain=true)
@ToString
public class UserBean {
     private int user_id;
	 private String user_account;
	 private String user_password;
	 private int role_id;
	 private int user_flag;
	
}
