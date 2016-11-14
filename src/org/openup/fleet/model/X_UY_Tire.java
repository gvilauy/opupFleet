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

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.Env;

/** Generated Model for UY_Tire
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_UY_Tire extends PO implements I_UY_Tire, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20161014L;

    /** Standard Constructor */
    public X_UY_Tire (Properties ctx, int UY_Tire_ID, String trxName)
    {
      super (ctx, UY_Tire_ID, trxName);
      /** if (UY_Tire_ID == 0)
        {
			setIsAuxiliary (false);
// N
			setIsRepaired (false);
// N
			setTireStatus (null);
			setTireType (null);
			setUY_TireCategory_ID (0);
			setUY_Tire_ID (0);
			setValue (null);
        } */
    }

    /** Load Constructor */
    public X_UY_Tire (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_UY_Tire[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException
    {
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_Name)
			.getPO(getC_BPartner_ID(), get_TrxName());	}

	/** Set Business Partner .
		@param C_BPartner_ID 
		Identifies a Business Partner
	  */
	public void setC_BPartner_ID (int C_BPartner_ID)
	{
		if (C_BPartner_ID < 1) 
			set_Value (COLUMNNAME_C_BPartner_ID, null);
		else 
			set_Value (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
	}

	/** Get Business Partner .
		@return Identifies a Business Partner
	  */
	public int getC_BPartner_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_Currency getC_Currency() throws RuntimeException
    {
		return (org.compiere.model.I_C_Currency)MTable.get(getCtx(), org.compiere.model.I_C_Currency.Table_Name)
			.getPO(getC_Currency_ID(), get_TrxName());	}

	/** Set Currency.
		@param C_Currency_ID 
		The Currency for this record
	  */
	public void setC_Currency_ID (int C_Currency_ID)
	{
		if (C_Currency_ID < 1) 
			set_Value (COLUMNNAME_C_Currency_ID, null);
		else 
			set_Value (COLUMNNAME_C_Currency_ID, Integer.valueOf(C_Currency_ID));
	}

	/** Get Currency.
		@return The Currency for this record
	  */
	public int getC_Currency_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Currency_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_Invoice getC_Invoice() throws RuntimeException
    {
		return (org.compiere.model.I_C_Invoice)MTable.get(getCtx(), org.compiere.model.I_C_Invoice.Table_Name)
			.getPO(getC_Invoice_ID(), get_TrxName());	}

	/** Set Invoice.
		@param C_Invoice_ID 
		Invoice Identifier
	  */
	public void setC_Invoice_ID (int C_Invoice_ID)
	{
		if (C_Invoice_ID < 1) 
			set_Value (COLUMNNAME_C_Invoice_ID, null);
		else 
			set_Value (COLUMNNAME_C_Invoice_ID, Integer.valueOf(C_Invoice_ID));
	}

	/** Get Invoice.
		@return Invoice Identifier
	  */
	public int getC_Invoice_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Invoice_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Date Invoiced.
		@param DateInvoiced 
		Date printed on Invoice
	  */
	public void setDateInvoiced (Timestamp DateInvoiced)
	{
		set_Value (COLUMNNAME_DateInvoiced, DateInvoiced);
	}

	/** Get Date Invoiced.
		@return Date printed on Invoice
	  */
	public Timestamp getDateInvoiced () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateInvoiced);
	}

	/** Set IsAuxiliary.
		@param IsAuxiliary IsAuxiliary	  */
	public void setIsAuxiliary (boolean IsAuxiliary)
	{
		set_Value (COLUMNNAME_IsAuxiliary, Boolean.valueOf(IsAuxiliary));
	}

	/** Get IsAuxiliary.
		@return IsAuxiliary	  */
	public boolean isAuxiliary () 
	{
		Object oo = get_Value(COLUMNNAME_IsAuxiliary);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set IsRepaired.
		@param IsRepaired IsRepaired	  */
	public void setIsRepaired (boolean IsRepaired)
	{
		set_Value (COLUMNNAME_IsRepaired, Boolean.valueOf(IsRepaired));
	}

	/** Get IsRepaired.
		@return IsRepaired	  */
	public boolean isRepaired () 
	{
		Object oo = get_Value(COLUMNNAME_IsRepaired);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set KmTireNew.
		@param KmTireNew KmTireNew	  */
	public void setKmTireNew (int KmTireNew)
	{
		set_Value (COLUMNNAME_KmTireNew, Integer.valueOf(KmTireNew));
	}

	/** Get KmTireNew.
		@return KmTireNew	  */
	public int getKmTireNew () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_KmTireNew);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set KmTireNewEst.
		@param KmTireNewEst KmTireNewEst	  */
	public void setKmTireNewEst (int KmTireNewEst)
	{
		set_Value (COLUMNNAME_KmTireNewEst, Integer.valueOf(KmTireNewEst));
	}

	/** Get KmTireNewEst.
		@return KmTireNewEst	  */
	public int getKmTireNewEst () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_KmTireNewEst);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set KmTireRep.
		@param KmTireRep KmTireRep	  */
	public void setKmTireRep (int KmTireRep)
	{
		set_Value (COLUMNNAME_KmTireRep, Integer.valueOf(KmTireRep));
	}

	/** Get KmTireRep.
		@return KmTireRep	  */
	public int getKmTireRep () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_KmTireRep);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set KmTireRepEst.
		@param KmTireRepEst KmTireRepEst	  */
	public void setKmTireRepEst (int KmTireRepEst)
	{
		set_Value (COLUMNNAME_KmTireRepEst, Integer.valueOf(KmTireRepEst));
	}

	/** Get KmTireRepEst.
		@return KmTireRepEst	  */
	public int getKmTireRepEst () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_KmTireRepEst);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set KmTireTotal.
		@param KmTireTotal KmTireTotal	  */
	public void setKmTireTotal (int KmTireTotal)
	{
		set_Value (COLUMNNAME_KmTireTotal, Integer.valueOf(KmTireTotal));
	}

	/** Get KmTireTotal.
		@return KmTireTotal	  */
	public int getKmTireTotal () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_KmTireTotal);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set KmVehicle.
		@param KmVehicle KmVehicle	  */
	public void setKmVehicle (int KmVehicle)
	{
		set_Value (COLUMNNAME_KmVehicle, Integer.valueOf(KmVehicle));
	}

	/** Get KmVehicle.
		@return KmVehicle	  */
	public int getKmVehicle () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_KmVehicle);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_M_Locator getM_Locator() throws RuntimeException
    {
		return (org.compiere.model.I_M_Locator)MTable.get(getCtx(), org.compiere.model.I_M_Locator.Table_Name)
			.getPO(getM_Locator_ID(), get_TrxName());	}

	/** Set Locator.
		@param M_Locator_ID 
		Warehouse Locator
	  */
	public void setM_Locator_ID (int M_Locator_ID)
	{
		if (M_Locator_ID < 1) 
			set_Value (COLUMNNAME_M_Locator_ID, null);
		else 
			set_Value (COLUMNNAME_M_Locator_ID, Integer.valueOf(M_Locator_ID));
	}

	/** Get Locator.
		@return Warehouse Locator
	  */
	public int getM_Locator_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_Locator_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_M_Warehouse getM_Warehouse() throws RuntimeException
    {
		return (org.compiere.model.I_M_Warehouse)MTable.get(getCtx(), org.compiere.model.I_M_Warehouse.Table_Name)
			.getPO(getM_Warehouse_ID(), get_TrxName());	}

	/** Set Warehouse.
		@param M_Warehouse_ID 
		Storage Warehouse and Service Point
	  */
	public void setM_Warehouse_ID (int M_Warehouse_ID)
	{
		if (M_Warehouse_ID < 0) 
			set_Value (COLUMNNAME_M_Warehouse_ID, null);
		else 
			set_Value (COLUMNNAME_M_Warehouse_ID, Integer.valueOf(M_Warehouse_ID));
	}

	/** Get Warehouse.
		@return Storage Warehouse and Service Point
	  */
	public int getM_Warehouse_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_Warehouse_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Cost Price.
		@param PriceCost 
		Price per Unit of Measure including all indirect costs (Freight, etc.)
	  */
	public void setPriceCost (BigDecimal PriceCost)
	{
		set_Value (COLUMNNAME_PriceCost, PriceCost);
	}

	/** Get Cost Price.
		@return Price per Unit of Measure including all indirect costs (Freight, etc.)
	  */
	public BigDecimal getPriceCost () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PriceCost);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set PO Price.
		@param PricePO 
		Price based on a purchase order
	  */
	public void setPricePO (BigDecimal PricePO)
	{
		set_Value (COLUMNNAME_PricePO, PricePO);
	}

	/** Get PO Price.
		@return Price based on a purchase order
	  */
	public BigDecimal getPricePO () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PricePO);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** TireStatus AD_Reference_ID=1000008 */
	public static final int TIRESTATUS_AD_Reference_ID=1000008;
	/** NUEVO = nuevo */
	public static final String TIRESTATUS_NUEVO = "nuevo";
	/** RECAUCHUTADO = recauchutado */
	public static final String TIRESTATUS_RECAUCHUTADO = "recauchutado";
	/** BAJA = baja */
	public static final String TIRESTATUS_BAJA = "baja";
	/** Set TireStatus.
		@param TireStatus TireStatus	  */
	public void setTireStatus (String TireStatus)
	{

		set_Value (COLUMNNAME_TireStatus, TireStatus);
	}

	/** Get TireStatus.
		@return TireStatus	  */
	public String getTireStatus () 
	{
		return (String)get_Value(COLUMNNAME_TireStatus);
	}

	/** TireType AD_Reference_ID=1000007 */
	public static final int TIRETYPE_AD_Reference_ID=1000007;
	/** LISA = lisa */
	public static final String TIRETYPE_LISA = "lisa";
	/** TRACCION = traccion */
	public static final String TIRETYPE_TRACCION = "traccion";
	/** Set TireType.
		@param TireType TireType	  */
	public void setTireType (String TireType)
	{

		set_Value (COLUMNNAME_TireType, TireType);
	}

	/** Get TireType.
		@return TireType	  */
	public String getTireType () 
	{
		return (String)get_Value(COLUMNNAME_TireType);
	}

	public org.openup.fleet.model.I_UY_TireCategory getUY_TireCategory() throws RuntimeException
    {
		return (org.openup.fleet.model.I_UY_TireCategory)MTable.get(getCtx(), org.openup.fleet.model.I_UY_TireCategory.Table_Name)
			.getPO(getUY_TireCategory_ID(), get_TrxName());	}

	/** Set UY_TireCategory ID.
		@param UY_TireCategory_ID UY_TireCategory ID	  */
	public void setUY_TireCategory_ID (int UY_TireCategory_ID)
	{
		if (UY_TireCategory_ID < 1) 
			set_Value (COLUMNNAME_UY_TireCategory_ID, null);
		else 
			set_Value (COLUMNNAME_UY_TireCategory_ID, Integer.valueOf(UY_TireCategory_ID));
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

	public org.openup.fleet.model.I_UY_TireDrop getUY_TireDrop() throws RuntimeException
    {
		return (org.openup.fleet.model.I_UY_TireDrop)MTable.get(getCtx(), org.openup.fleet.model.I_UY_TireDrop.Table_Name)
			.getPO(getUY_TireDrop_ID(), get_TrxName());	}

	/** Set UY_TireDrop ID.
		@param UY_TireDrop_ID UY_TireDrop ID	  */
	public void setUY_TireDrop_ID (int UY_TireDrop_ID)
	{
		if (UY_TireDrop_ID < 1) 
			set_Value (COLUMNNAME_UY_TireDrop_ID, null);
		else 
			set_Value (COLUMNNAME_UY_TireDrop_ID, Integer.valueOf(UY_TireDrop_ID));
	}

	/** Get UY_TireDrop ID.
		@return UY_TireDrop ID	  */
	public int getUY_TireDrop_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_UY_TireDrop_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set UY_Tire ID.
		@param UY_Tire_ID UY_Tire ID	  */
	public void setUY_Tire_ID (int UY_Tire_ID)
	{
		if (UY_Tire_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_UY_Tire_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_UY_Tire_ID, Integer.valueOf(UY_Tire_ID));
	}

	/** Get UY_Tire ID.
		@return UY_Tire ID	  */
	public int getUY_Tire_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_UY_Tire_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.openup.fleet.model.I_UY_TireLocator getUY_TireLocator() throws RuntimeException
    {
		return (org.openup.fleet.model.I_UY_TireLocator)MTable.get(getCtx(), org.openup.fleet.model.I_UY_TireLocator.Table_Name)
			.getPO(getUY_TireLocator_ID(), get_TrxName());	}

	/** Set UY_TireLocator ID.
		@param UY_TireLocator_ID UY_TireLocator ID	  */
	public void setUY_TireLocator_ID (int UY_TireLocator_ID)
	{
		if (UY_TireLocator_ID < 1) 
			set_Value (COLUMNNAME_UY_TireLocator_ID, null);
		else 
			set_Value (COLUMNNAME_UY_TireLocator_ID, Integer.valueOf(UY_TireLocator_ID));
	}

	/** Get UY_TireLocator ID.
		@return UY_TireLocator ID	  */
	public int getUY_TireLocator_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_UY_TireLocator_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.openup.fleet.model.I_UY_Vehicle getUY_Vehicle() throws RuntimeException
    {
		return (org.openup.fleet.model.I_UY_Vehicle)MTable.get(getCtx(), org.openup.fleet.model.I_UY_Vehicle.Table_Name)
			.getPO(getUY_Vehicle_ID(), get_TrxName());	}

	/** Set UY_Vehicle ID.
		@param UY_Vehicle_ID UY_Vehicle ID	  */
	public void setUY_Vehicle_ID (int UY_Vehicle_ID)
	{
		if (UY_Vehicle_ID < 1) 
			set_Value (COLUMNNAME_UY_Vehicle_ID, null);
		else 
			set_Value (COLUMNNAME_UY_Vehicle_ID, Integer.valueOf(UY_Vehicle_ID));
	}

	/** Get UY_Vehicle ID.
		@return UY_Vehicle ID	  */
	public int getUY_Vehicle_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_UY_Vehicle_ID);
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