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

/** Generated Model for UY_TireCategory
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_UY_TireCategory extends PO implements I_UY_TireCategory, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20161014L;

    /** Standard Constructor */
    public X_UY_TireCategory (Properties ctx, int UY_TireCategory_ID, String trxName)
    {
      super (ctx, UY_TireCategory_ID, trxName);
      /** if (UY_TireCategory_ID == 0)
        {
			setM_Product_ID (0);
			setName (null);
			setUY_TireCategory_ID (0);
			setUY_TireMark_ID (0);
			setUY_TireMeasure_ID (0);
			setValue (null);
        } */
    }

    /** Load Constructor */
    public X_UY_TireCategory (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_UY_TireCategory[")
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

	public org.compiere.model.I_M_Product getM_Product() throws RuntimeException
    {
		return (org.compiere.model.I_M_Product)MTable.get(getCtx(), org.compiere.model.I_M_Product.Table_Name)
			.getPO(getM_Product_ID(), get_TrxName());	}

	/** Set Product.
		@param M_Product_ID 
		Product, Service, Item
	  */
	public void setM_Product_ID (int M_Product_ID)
	{
		if (M_Product_ID < 1) 
			set_Value (COLUMNNAME_M_Product_ID, null);
		else 
			set_Value (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
	}

	/** Get Product.
		@return Product, Service, Item
	  */
	public int getM_Product_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set QtyKmNew.
		@param QtyKmNew QtyKmNew	  */
	public void setQtyKmNew (int QtyKmNew)
	{
		set_Value (COLUMNNAME_QtyKmNew, Integer.valueOf(QtyKmNew));
	}

	/** Get QtyKmNew.
		@return QtyKmNew	  */
	public int getQtyKmNew () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_QtyKmNew);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set QtyKmRep.
		@param QtyKmRep QtyKmRep	  */
	public void setQtyKmRep (int QtyKmRep)
	{
		set_Value (COLUMNNAME_QtyKmRep, Integer.valueOf(QtyKmRep));
	}

	/** Get QtyKmRep.
		@return QtyKmRep	  */
	public int getQtyKmRep () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_QtyKmRep);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TireModel.
		@param TireModel TireModel	  */
	public void setTireModel (String TireModel)
	{
		set_Value (COLUMNNAME_TireModel, TireModel);
	}

	/** Get TireModel.
		@return TireModel	  */
	public String getTireModel () 
	{
		return (String)get_Value(COLUMNNAME_TireModel);
	}

	/** Set UY_TireCategory ID.
		@param UY_TireCategory_ID UY_TireCategory ID	  */
	public void setUY_TireCategory_ID (int UY_TireCategory_ID)
	{
		if (UY_TireCategory_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_UY_TireCategory_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_UY_TireCategory_ID, Integer.valueOf(UY_TireCategory_ID));
	}

	/** Get UY_TireCategory ID.
		@return UY_TireCategory ID	  */
	public int getUY_TireCategory_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_UY_TireCategory_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.openup.fleet.model.I_UY_TireMark getUY_TireMark() throws RuntimeException
    {
		return (org.openup.fleet.model.I_UY_TireMark)MTable.get(getCtx(), org.openup.fleet.model.I_UY_TireMark.Table_Name)
			.getPO(getUY_TireMark_ID(), get_TrxName());	}

	/** Set UY_TireMark ID.
		@param UY_TireMark_ID UY_TireMark ID	  */
	public void setUY_TireMark_ID (int UY_TireMark_ID)
	{
		if (UY_TireMark_ID < 1) 
			set_Value (COLUMNNAME_UY_TireMark_ID, null);
		else 
			set_Value (COLUMNNAME_UY_TireMark_ID, Integer.valueOf(UY_TireMark_ID));
	}

	/** Get UY_TireMark ID.
		@return UY_TireMark ID	  */
	public int getUY_TireMark_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_UY_TireMark_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.openup.fleet.model.I_UY_TireMeasure getUY_TireMeasure() throws RuntimeException
    {
		return (org.openup.fleet.model.I_UY_TireMeasure)MTable.get(getCtx(), org.openup.fleet.model.I_UY_TireMeasure.Table_Name)
			.getPO(getUY_TireMeasure_ID(), get_TrxName());	}

	/** Set UY_TireMeasure ID.
		@param UY_TireMeasure_ID UY_TireMeasure ID	  */
	public void setUY_TireMeasure_ID (int UY_TireMeasure_ID)
	{
		if (UY_TireMeasure_ID < 1) 
			set_Value (COLUMNNAME_UY_TireMeasure_ID, null);
		else 
			set_Value (COLUMNNAME_UY_TireMeasure_ID, Integer.valueOf(UY_TireMeasure_ID));
	}

	/** Get UY_TireMeasure ID.
		@return UY_TireMeasure ID	  */
	public int getUY_TireMeasure_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_UY_TireMeasure_ID);
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