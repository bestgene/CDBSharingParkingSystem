package com.cbdsp.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain=true)   //链式表达
public class OrderBean {
	private Integer order_id;
	private String order_number;
	private String order_message;
	private Integer order_state;
	private Integer order_flag;
	private UserBean user;
	private LeaseBean lease;
	
}
