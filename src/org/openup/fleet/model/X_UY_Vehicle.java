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
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for UY_Vehicle
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_UY_Vehicle extends PO implements I_UY_Vehicle, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20161014L;

    /** Standard Constructor */
    public X_UY_Vehicle (Properties ctx, int UY_Vehicle_ID, String trxName)
    {
      super (ctx, UY_Vehicle_ID, trxName);
      /** if (UY_Vehicle_ID == 0)
        {
			setIsOwner (true);
// Y
			setIsPurchased (false);
// N
			setIsSold (false);
// N
			setPlateNo (null);
			setUY_Vehicle_ID (0);
			setUY_VehicleType_ID (0);
			setValue (null);
        } */
    }

    /** Load Constructor */
    public X_UY_Vehicle (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_UY_Vehicle[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set CensusNo.
		@param CensusNo CensusNo	  */
	public void setCensusNo (String CensusNo)
	{
		set_Value (COLUMNNAME_CensusNo, CensusNo);
	}

	/** Get CensusNo.
		@return CensusNo	  */
	public String getCensusNo () 
	{
		return (String)get_Value(COLUMNNAME_CensusNo);
	}

	/** Set ChassisNo.
		@param ChassisNo ChassisNo	  */
	public void setChassisNo (String ChassisNo)
	{
		set_Value (COLUMNNAME_ChassisNo, ChassisNo);
	}

	/** Get ChassisNo.
		@return ChassisNo	  */
	public String getChassisNo () 
	{
		return (String)get_Value(COLUMNNAME_ChassisNo);
	}

	/** Set DateLastRead.
		@param DateLastRead DateLastRead	  */
	public void setDateLastRead (Timestamp DateLastRead)
	{
		set_Value (COLUMNNAME_DateLastRead, DateLastRead);
	}

	/** Get DateLastRead.
		@return DateLastRead	  */
	public Timestamp getDateLastRead () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateLastRead);
	}

	/** Set DatePurchase.
		@param DatePurchase DatePurchase	  */
	public void setDatePurchase (Timestamp DatePurchase)
	{
		set_Value (COLUMNNAME_DatePurchase, DatePurchase);
	}

	/** Get DatePurchase.
		@return DatePurchase	  */
	public Timestamp getDatePurchase () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DatePurchase);
	}

	/** Set DateSold.
		@param DateSold DateSold	  */
	public void setDateSold (Timestamp DateSold)
	{
		set_Value (COLUMNNAME_DateSold, DateSold);
	}

	/** Get DateSold.
		@return DateSold	  */
	public Timestamp getDateSold () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateSold);
	}

	/** Set IsOwner.
		@param IsOwner IsOwner	  */
	public void setIsOwner (boolean IsOwner)
	{
		set_Value (COLUMNNAME_IsOwner, Boolean.valueOf(IsOwner));
	}

	/** Get IsOwner.
		@return IsOwner	  */
	public boolean isOwner () 
	{
		Object oo = get_Value(COLUMNNAME_IsOwner);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Purchased.
		@param IsPurchased 
		Organization purchases this product
	  */
	public void setIsPurchased (boolean IsPurchased)
	{
		set_Value (COLUMNNAME_IsPurchased, Boolean.valueOf(IsPurchased));
	}

	/** Get Purchased.
		@return Organization purchases this product
	  */
	public boolean isPurchased () 
	{
		Object oo = get_Value(COLUMNNAME_IsPurchased);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Sold.
		@param IsSold 
		Organization sells this product
	  */
	public void setIsSold (boolean IsSold)
	{
		set_Value (COLUMNNAME_IsSold, Boolean.valueOf(IsSold));
	}

	/** Get Sold.
		@return Organization sells this product
	  */
	public boolean isSold () 
	{
		Object oo = get_Value(COLUMNNAME_IsSold);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set KmLastRead.
		@param KmLastRead KmLastRead	  */
	public void setKmLastRead (int KmLastRead)
	{
		set_Value (COLUMNNAME_KmLastRead, Integer.valueOf(KmLastRead));
	}

	/** Get KmLastRead.
		@return KmLastRead	  */
	public int getKmLastRead () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_KmLastRead);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Manufactured Year.
		@param ManufacturedYear Manufactured Year	  */
	public void setManufacturedYear (String ManufacturedYear)
	{
		set_Value (COLUMNNAME_ManufacturedYear, ManufacturedYear);
	}

	/** Get Manufactured Year.
		@return Manufactured Year	  */
	public String getManufacturedYear () 
	{
		return (String)get_Value(COLUMNNAME_ManufacturedYear);
	}

	/** Set MotorNo.
		@param MotorNo MotorNo	  */
	public void setMotorNo (String MotorNo)
	{
		set_Value (COLUMNNAME_MotorNo, MotorNo);
	}

	/** Get MotorNo.
		@return MotorNo	  */
	public String getMotorNo () 
	{
		return (String)get_Value(COLUMNNAME_MotorNo);
	}

	/** Set Pic1_ID.
		@param Pic1_ID Pic1_ID	  */
	public void setPic1_ID (int Pic1_ID)
	{
		if (Pic1_ID < 1) 
			set_Value (COLUMNNAME_Pic1_ID, null);
		else 
			set_Value (COLUMNNAME_Pic1_ID, Integer.valueOf(Pic1_ID));
	}

	/** Get Pic1_ID.
		@return Pic1_ID	  */
	public int getPic1_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Pic1_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Pic2_ID.
		@param Pic2_ID Pic2_ID	  */
	public void setPic2_ID (int Pic2_ID)
	{
		if (Pic2_ID < 1) 
			set_Value (COLUMNNAME_Pic2_ID, null);
		else 
			set_Value (COLUMNNAME_Pic2_ID, Integer.valueOf(Pic2_ID));
	}

	/** Get Pic2_ID.
		@return Pic2_ID	  */
	public int getPic2_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Pic2_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Pic3_ID.
		@param Pic3_ID Pic3_ID	  */
	public void setPic3_ID (int Pic3_ID)
	{
		if (Pic3_ID < 1) 
			set_Value (COLUMNNAME_Pic3_ID, null);
		else 
			set_Value (COLUMNNAME_Pic3_ID, Integer.valueOf(Pic3_ID));
	}

	/** Get Pic3_ID.
		@return Pic3_ID	  */
	public int getPic3_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Pic3_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set PlateNo.
		@param PlateNo PlateNo	  */
	public void setPlateNo (String PlateNo)
	{
		set_ValueNoCheck (COLUMNNAME_PlateNo, PlateNo);
	}

	/** Get PlateNo.
		@return PlateNo	  */
	public String getPlateNo () 
	{
		return (String)get_Value(COLUMNNAME_PlateNo);
	}

	/** PurchaseType AD_Reference_ID=1000010 */
	public static final int PURCHASETYPE_AD_Reference_ID=1000010;
	/** COMPRA = compra */
	public static final String PURCHASETYPE_COMPRA = "compra";
	/** LEASING = leasing */
	public static final String PURCHASETYPE_LEASING = "leasing";
	/** Set PurchaseType.
		@param PurchaseType PurchaseType	  */
	public void setPurchaseType (String PurchaseType)
	{

		set_Value (COLUMNNAME_PurchaseType, PurchaseType);
	}

	/** Get PurchaseType.
		@return PurchaseType	  */
	public String getPurchaseType () 
	{
		return (String)get_Value(COLUMNNAME_PurchaseType);
	}

	/** Set QtyPassenger.
		@param QtyPassenger QtyPassenger	  */
	public void setQtyPassenger (int QtyPassenger)
	{
		set_Value (COLUMNNAME_QtyPassenger, Integer.valueOf(QtyPassenger));
	}

	/** Get QtyPassenger.
		@return QtyPassenger	  */
	public int getQtyPassenger () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_QtyPassenger);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.openup.fleet.model.I_UY_Driver getUY_Driver() throws RuntimeException
    {
		return (org.openup.fleet.model.I_UY_Driver)MTable.get(getCtx(), org.openup.fleet.model.I_UY_Driver.Table_Name)
			.getPO(getUY_Driver_ID(), get_TrxName());	}

	/** Set UY_Driver ID.
		@param UY_Driver_ID UY_Driver ID	  */
	public void setUY_Driver_ID (int UY_Driver_ID)
	{
		if (UY_Driver_ID < 1) 
			set_Value (COLUMNNAME_UY_Driver_ID, null);
		else 
			set_Value (COLUMNNAME_UY_Driver_ID, Integer.valueOf(UY_Driver_ID));
	}

	/** Get UY_Driver ID.
		@return UY_Driver ID	  */
	public int getUY_Driver_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_UY_Driver_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	public org.openup.fleet.model.I_UY_VehicleBrandModel getUY_VehicleBrandModel() throws RuntimeException
    {
		return (org.openup.fleet.model.I_UY_VehicleBrandModel)MTable.get(getCtx(), org.openup.fleet.model.I_UY_VehicleBrandModel.Table_Name)
			.getPO(getUY_VehicleBrandModel_ID(), get_TrxName());	}

	/** Set UY_VehicleBrandModel ID.
		@param UY_VehicleBrandModel_ID UY_VehicleBrandModel ID	  */
	public void setUY_VehicleBrandModel_ID (int UY_VehicleBrandModel_ID)
	{
		if (UY_VehicleBrandModel_ID < 1) 
			set_Value (COLUMNNAME_UY_VehicleBrandModel_ID, null);
		else 
			set_Value (COLUMNNAME_UY_VehicleBrandModel_ID, Integer.valueOf(UY_VehicleBrandModel_ID));
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

	/** Set UY_Vehicle ID.
		@param UY_Vehicle_ID UY_Vehicle ID	  */
	public void setUY_Vehicle_ID (int UY_Vehicle_ID)
	{
		if (UY_Vehicle_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_UY_Vehicle_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_UY_Vehicle_ID, Integer.valueOf(UY_Vehicle_ID));
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

	public org.openup.fleet.model.I_UY_VehicleType getUY_VehicleType() throws RuntimeException
    {
		return (org.openup.fleet.model.I_UY_VehicleType)MTable.get(getCtx(), org.openup.fleet.model.I_UY_VehicleType.Table_Name)
			.getPO(getUY_VehicleType_ID(), get_TrxName());	}

	/** Set UY_VehicleType ID.
		@param UY_VehicleType_ID UY_VehicleType ID	  */
	public void setUY_VehicleType_ID (int UY_VehicleType_ID)
	{
		if (UY_VehicleType_ID < 1) 
			set_Value (COLUMNNAME_UY_VehicleType_ID, null);
		else 
			set_Value (COLUMNNAME_UY_VehicleType_ID, Integer.valueOf(UY_VehicleType_ID));
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
		set_ValueNoCheck (COLUMNNAME_Value, Value);
	}

	/** Get Search Key.
		@return Search key for the record in the format required - must be unique
	  */
	public String getValue () 
	{
		return (String)get_Value(COLUMNNAME_Value);
	}
}