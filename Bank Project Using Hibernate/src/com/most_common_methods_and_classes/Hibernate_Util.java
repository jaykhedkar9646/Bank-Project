package com.most_common_methods_and_classes;

import java.util.HashMap;

import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import org.hibernate.cfg.Environment;

public class Hibernate_Util {

	private static StandardServiceRegistry registry;
	
	
	
	public static StandardServiceRegistry getStandardServiceRegistry()
	{
		Map<String , Object> setting=new HashMap<String, Object>();
		
		setting.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
		setting.put(Environment.URL, "jdbc:mysql://localhost:3306/bank_project");
		setting.put(Environment.USER, "root");
		setting.put(Environment.PASS, "root");
		setting.put(Environment.CACHE_REGION_FACTORY, "org.hibernate.cache.ehcache.EhCacheRegionFactory");
		
		setting.put(Environment.HBM2DDL_AUTO, "update");
		setting.put(Environment.DIALECT, "org.hibernate.dialect.MySQL55Dialect");
		
		registry=new StandardServiceRegistryBuilder().applySettings(setting).build();
		
		return registry;
	}
	
}
