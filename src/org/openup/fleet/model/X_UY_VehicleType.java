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

/** Generated Model for UY_VehicleType
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_UY_VehicleType extends PO implements I_UY_VehicleType, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20161014L;

    /** Standard Constructor */
    public X_UY_VehicleType (Properties ctx, int UY_VehicleType_ID, String trxName)
    {
      super (ctx, UY_VehicleType_ID, trxName);
      /** if (UY_VehicleType_ID == 0)
        {
			setAxisType (null);
// SIMPLE
			setCanAssociate (false);
// N
			setIsContainer (false);
// N
			setName (null);
			setQtyAxis (0);
			setQtyTires (0);
			setUY_VehicleType_ID (0);
			setValue (null);
        } */
    }

    /** Load Constructor */
    public X_UY_VehicleType (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_UY_VehicleType[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** AxisType AD_Reference_ID=1000006 */
	public static final int AXISTYPE_AD_Reference_ID=1000006;
	/** DOBLE = doble */
	public static final String AXISTYPE_DOBLE = "doble";
	/** TRIPLE = triple */
	public static final String AXISTYPE_TRIPLE = "triple";
	/** SIMPLE = simple */
	public static final String AXISTYPE_SIMPLE = "simple";
	/** Set AxisType.
		@param AxisType AxisType	  */
	public void setAxisType (String AxisType)
	{

		set_Value (COLUMNNAME_AxisType, AxisType);
	}

	/** Get AxisType.
		@return AxisType	  */
	public String getAxisType () 
	{
		return (String)get_Value(COLUMNNAME_AxisType);
	}

	/** Set CanAssociate.
		@param CanAssociate CanAssociate	  */
	public void setCanAssociate (boolean CanAssociate)
	{
		set_Value (COLUMNNAME_CanAssociate, Boolean.valueOf(CanAssociate));
	}

	/** Get CanAssociate.
		@return CanAssociate	  */
	public boolean isCanAssociate () 
	{
		Object oo = get_Value(COLUMNNAME_CanAssociate);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
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

	/** Set IsContainer.
		@param IsContainer 
		Es contenedor
	  */
	public void setIsContainer (boolean IsContainer)
	{
		set_Value (COLUMNNAME_IsContainer, Boolean.valueOf(IsContainer));
	}

	/** Get IsContainer.
		@return Es contenedor
	  */
	public boolean isContainer () 
	{
		Object oo = get_Value(COLUMNNAME_IsContainer);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
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

	/** Set QtyAxis.
		@param QtyAxis QtyAxis	  */
	public void setQtyAxis (int QtyAxis)
	{
		set_Value (COLUMNNAME_QtyAxis, Integer.valueOf(QtyAxis));
	}

	/** Get QtyAxis.
		@return QtyAxis	  */
	public int getQtyAxis () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_QtyAxis);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set QtyTires.
		@param QtyTires QtyTires	  */
	public void setQtyTires (int QtyTires)
	{
		set_Value (COLUMNNAME_QtyTires, Integer.valueOf(QtyTires));
	}

	/** Get QtyTires.
		@return QtyTires	  */
	public int getQtyTires () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_QtyTires);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set UY_VehicleType ID.
		@param UY_VehicleType_ID UY_VehicleType ID	  */
	public void setUY_VehicleType_ID (int UY_VehicleType_ID)
	{
		if (UY_VehicleType_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_UY_VehicleType_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_UY_VehicleType_ID, Integer.valueOf(UY_VehicleType_ID));
	}

	/** Get UY_VehicleType ID.
		@return UY_VehicleType ID	  */
	public int getUY_VehicleType_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_UY_VehicleType_ID);
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