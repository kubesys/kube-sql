/*

 * Copyright (2021, ) Institute of Software, Chinese Academy of Sciences
 */
package io.github.kubesys.datafrk.core;

/**
 * @author wuheng@iscas.ac.cn
 * @since 2.0.0
 *
 */
public interface DataContext {
	
	public Database thisDatabase();

	public boolean createDatabase();
	
	public boolean dropDababase();
	
}