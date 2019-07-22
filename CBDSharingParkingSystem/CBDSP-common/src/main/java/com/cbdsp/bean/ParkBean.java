package com.cbdsp.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain=true)   //链式表达
public class ParkBean {
	private Integer park_id;
	private String park_addr;
	private String park_addrnumber;
	private String park_titledeed;
	private String park_copyimg;
	private Integer park_flag;
	private Integer park_state;
	
}
