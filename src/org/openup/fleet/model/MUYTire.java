/**
 * 
 */
package org.openup.fleet.model;

import java.sql.ResultSet;
import java.util.Properties;

/**
 * @author Nicolás
 *
 */
public class MUYTire extends X_UY_Tire {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1198375022530045288L;

	/**
	 * @param ctx
	 * @param UY_Tire_ID
	 * @param trxName
	 */
	public MUYTire(Properties ctx, int UY_Tire_ID, String trxName) {
		super(ctx, UY_Tire_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param ctx
	 * @param rs
	 * @param trxName
	 */
	public MUYTire(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

}
