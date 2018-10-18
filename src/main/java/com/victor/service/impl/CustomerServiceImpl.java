package com.victor.service.impl;

import org.springframework.stereotype.Service;

import com.victor.service.CustomerService;
import com.victor.utils.JedisUtil;

import redis.clients.jedis.Jedis;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public String getCustomerById(String id) {
		// TODO Auto-generated method stub
	 Jedis jedis=	JedisUtil.getJedis();
	 jedis.set("k122", "v122");
		return jedis.get("k122");
	}

}
