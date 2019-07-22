package com.cbdsp.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain=true)   //链式表达
public class LeaseBean {
	private Integer lease_id;
	private String lease_start;
	private String lease_end;
	private double lease_price;
	private Integer lease_state;
	private Integer flag;
	private ParkBean park;
}
