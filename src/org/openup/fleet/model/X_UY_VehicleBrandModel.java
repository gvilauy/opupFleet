/******************************************************************************
 * Product: ADempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 2006-2016 ADempiere Foundation, All Rights Reserved.         *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * or via info@adempiere.net or http://www.adempiere.net/license.html         *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.openup.fleet.model;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for UY_VehicleBrandModel
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_UY_VehicleBrandModel extends PO implements I_UY_VehicleBrandModel, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20161014L;

    /** Standard Constructor */
    public X_UY_VehicleBrandModel (Properties ctx, int UY_VehicleBrandModel_ID, String trxName)
    {
      super (ctx, UY_VehicleBrandModel_ID, trxName);
      /** if (UY_VehicleBrandModel_ID == 0)
        {
			setName (null);
			setUY_VehicleBrand_ID (0);
			setUY_VehicleBrandModel_ID (0);
			setValue (null);
        } */
    }

    /** Load Constructor */
    public X_UY_VehicleBrandModel (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_UY_VehicleBrandModel[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Description.
		@param Description 
		Optional short description of the record
	  */
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription () 
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	/** Set Name.
		@param Name 
		Alphanumeric identifier of the entity
	  */
	public void setName (String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName () 
	{
		return (String)get_Value(COLUMNNAME_Name);
	}

	public org.openup.fleet.model.I_UY_VehicleBrand getUY_VehicleBrand() throws RuntimeException
    {
		return (org.openup.fleet.model.I_UY_VehicleBrand)MTable.get(getCtx(), org.openup.fleet.model.I_UY_VehicleBrand.Table_Name)
			.getPO(getUY_VehicleBrand_ID(), get_TrxName());	}

	/** Set UY_VehicleBrand ID.
		@param UY_VehicleBrand_ID UY_VehicleBrand ID	  */
	public void setUY_VehicleBrand_ID (int UY_VehicleBrand_ID)
	{
		if (UY_VehicleBrand_ID < 1) 
			set_Value (COLUMNNAME_UY_VehicleBrand_ID, null);
		else 
			set_Value (COLUMNNAME_UY_VehicleBrand_ID, Integer.valueOf(UY_VehicleBrand_ID));
	}

	/** Get UY_VehicleBrand ID.
		@return UY_VehicleBrand ID	  */
	public int getUY_VehicleBrand_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_UY_VehicleBrand_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set UY_VehicleBrandModel ID.
		@param UY_VehicleBrandModel_ID UY_VehicleBrandModel ID	  */
	public void setUY_VehicleBrandModel_ID (int UY_VehicleBrandModel_ID)
	{
		if (UY_VehicleBrandModel_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_UY_VehicleBrandModel_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_UY_VehicleBrandModel_ID, Integer.valueOf(UY_VehicleBrandModel_ID));
	}

	/** Get UY_VehicleBrandModel ID.
		@return UY_VehicleBrandModel ID	  */
	public int getUY_VehicleBrandModel_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_UY_VehicleBrandModel_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Search Key.
		@param Value 
		Search key for the record in the format required - must be unique
	  */
	public void setValue (String Value)
	{
		set_Value (COLUMNNAME_Value, Value);
	}

	/** Get Search Key.
		@return Search key for the record in the format required - must be unique
	  */
	public String getValue () 
	{
		return (String)get_Value(COLUMNNAME_Value);
	}
}