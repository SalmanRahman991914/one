package com.testcurud;

import java.util.ArrayList;

public interface DaoInteface {
	public void insert(Bean bean);
	public ArrayList fatch();
	
	void delete(String name);

}
