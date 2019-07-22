package com.cbdsp.Interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cbdsp.bean.DemoBean;

@FeignClient(name="springcloud-provider",fallbackFactory=DemoRemoteHandlerFallbackFactory.class)
public interface DemoRemoteHandler {
	/**
	 * 根据id查询商品的接口
	 * @param id 商品id
	 * @return 商品对象
	 */
	@RequestMapping("/goods/{id}")
	public DemoBean findById(@PathVariable("id")int id);
}
