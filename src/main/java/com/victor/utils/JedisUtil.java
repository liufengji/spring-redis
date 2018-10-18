package com.victor.utils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisUtil {
	
	
	private static int maxTotal;
	
	private static int maxWaitMill;
	
	private static String host;
	
	private static int port;
	
	private static int timeout;
	
	private static boolean testOnBorrow;
	
	private static boolean blockWhenExhaust;
	
	private static   JedisPool jedisPool;
	
	public int getMaxTotal() {
		return maxTotal;
	}

	public void setMaxTotal(int maxTotal) {
		this.maxTotal = maxTotal;
	}

	public int getMaxWaitMill() {
		return maxWaitMill;
	}

	public void setMaxWaitMill(int maxWaitMill) {
		this.maxWaitMill = maxWaitMill;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public int getTimeout() {
		return timeout;
	}

	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

	public boolean isTestOnBorrow() {
		return testOnBorrow;
	}

	public void setTestOnBorrow(boolean testOnBorrow) {
		this.testOnBorrow = testOnBorrow;
	}

	public boolean isBlockWhenExhaust() {
		return blockWhenExhaust;
	}

	public void setBlockWhenExhaust(boolean blockWhenExhaust) {
		this.blockWhenExhaust = blockWhenExhaust;
	}

 

 


	
	
	public void init() {
		JedisPoolConfig jedisPoolConfig=new JedisPoolConfig();
		
		jedisPoolConfig.setMaxTotal(maxTotal);
		
		jedisPoolConfig.setMaxWaitMillis(maxWaitMill);
		
		jedisPoolConfig.setBlockWhenExhausted(blockWhenExhaust);
		
		jedisPoolConfig.setTestOnBorrow(testOnBorrow);
		
		jedisPool=new JedisPool(jedisPoolConfig,  host, port,timeout  );
	 
		
	}
	
	public static Jedis getJedis() {
		 return jedisPool.getResource();
	}
	
	

}
