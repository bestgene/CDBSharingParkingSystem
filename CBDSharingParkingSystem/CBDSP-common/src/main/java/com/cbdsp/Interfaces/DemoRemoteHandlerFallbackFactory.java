package com.cbdsp.Interfaces;

import org.springframework.stereotype.Component;

import com.cbdsp.bean.DemoBean;

import feign.hystrix.FallbackFactory;

@Component //加上注解，扫描的时候才能扫描到当前类
public class DemoRemoteHandlerFallbackFactory implements FallbackFactory<DemoRemoteHandler>{

	@Override
	public DemoRemoteHandler create(Throwable arg0) {
		// TODO Auto-generated method stub
		return new DemoRemoteHandler(){

			@Override
			public DemoBean findById(int id) {
				DemoBean goods = new DemoBean();
				goods.setP_message("服务器降级!!!!!");
				return goods;
			}
			
		};
	}

}