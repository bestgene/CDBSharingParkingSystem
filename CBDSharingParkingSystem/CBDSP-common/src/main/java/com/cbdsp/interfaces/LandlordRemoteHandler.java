package com.cbdsp.interfaces;

import org.springframework.cloud.openfeign.FeignClient;

import com.cbdsp.bean.ParkBean;

@FeignClient(name="CBDSP-landlord")
public interface LandlordRemoteHandler {
	/**
	 * 包租婆添加出租车位
	 * @param park
	 * @return
	 */
	public String addCarPort(ParkBean park);
}
