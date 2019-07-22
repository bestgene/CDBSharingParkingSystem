package com.cbdsp.dao;

import org.apache.ibatis.annotations.Insert;

import com.cbdsp.bean.ParkBean;

public interface ParkDAO {
	@Insert("Insert into t_park values (default,#{park_addr},#{park_addrnumber},#{park_titledeed},#{park_copyimg},default,0)")
	public Integer addCarPort(ParkBean park);
}
