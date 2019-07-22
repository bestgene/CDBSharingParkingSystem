package com.cbdsp.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain=true)   //链式表达
public class DemoBean{
	private int p_id;
	private String p_productName;
	private String p_message;
	private int p_number;
	private double p_price;
	private String p_imgName;
}

