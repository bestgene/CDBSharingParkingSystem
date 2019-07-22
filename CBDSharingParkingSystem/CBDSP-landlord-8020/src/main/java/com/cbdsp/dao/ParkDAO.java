package com.cbdsp.dao;


public interface ParkDAO {
	@Insert("Insert into t_park values (default,#{park_addr},#{park_addrnumber},#{park_titledeed},#{park_copyimg},default,0)")
	public Integer addCarPort(ParkBean park);
}
