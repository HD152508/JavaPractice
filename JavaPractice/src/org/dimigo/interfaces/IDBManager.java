/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *   |_IDBManager
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 24.
 * </pre>
 *
 * @author : KHH
 * @version : 1.0
 */
public interface IDBManager {

	String SYBASE_DATABASE = "SYBASE";
	String ORACLE_DATABASE = "ORACLE";
	
	void insert();
	void search();
	void update();
	void delete();
	
	public static IDBManager getDBObject(String database) {
		
		if (ORACLE_DATABASE.equals(database)) {
			return new OracleDB();
		} else if (SYBASE_DATABASE.equals(database)) {
			return new SybaseDB();
		}
		else return null;
	}
}
