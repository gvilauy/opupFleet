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
package org.openup.fleet.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for UY_Vehicle
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0
 */
public interface I_UY_Vehicle 
{

    /** TableName=UY_Vehicle */
    public static final String Table_Name = "UY_Vehicle";

    /** AD_Table_ID=1000032 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within client
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name CensusNo */
    public static final String COLUMNNAME_CensusNo = "CensusNo";

	/** Set CensusNo	  */
	public void setCensusNo (String CensusNo);

	/** Get CensusNo	  */
	public String getCensusNo();

    /** Column name ChassisNo */
    public static final String COLUMNNAME_ChassisNo = "ChassisNo";

	/** Set ChassisNo	  */
	public void setChassisNo (String ChassisNo);

	/** Get ChassisNo	  */
	public String getChassisNo();

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name DateLastRead */
    public static final String COLUMNNAME_DateLastRead = "DateLastRead";

	/** Set DateLastRead	  */
	public void setDateLastRead (Timestamp DateLastRead);

	/** Get DateLastRead	  */
	public Timestamp getDateLastRead();

    /** Column name DatePurchase */
    public static final String COLUMNNAME_DatePurchase = "DatePurchase";

	/** Set DatePurchase	  */
	public void setDatePurchase (Timestamp DatePurchase);

	/** Get DatePurchase	  */
	public Timestamp getDatePurchase();

    /** Column name DateSold */
    public static final String COLUMNNAME_DateSold = "DateSold";

	/** Set DateSold	  */
	public void setDateSold (Timestamp DateSold);

	/** Get DateSold	  */
	public Timestamp getDateSold();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name IsOwner */
    public static final String COLUMNNAME_IsOwner = "IsOwner";

	/** Set IsOwner	  */
	public void setIsOwner (boolean IsOwner);

	/** Get IsOwner	  */
	public boolean isOwner();

    /** Column name IsPurchased */
    public static final String COLUMNNAME_IsPurchased = "IsPurchased";

	/** Set Purchased.
	  * Organization purchases this product
	  */
	public void setIsPurchased (boolean IsPurchased);

	/** Get Purchased.
	  * Organization purchases this product
	  */
	public boolean isPurchased();

    /** Column name IsSold */
    public static final String COLUMNNAME_IsSold = "IsSold";

	/** Set Sold.
	  * Organization sells this product
	  */
	public void setIsSold (boolean IsSold);

	/** Get Sold.
	  * Organization sells this product
	  */
	public boolean isSold();

    /** Column name KmLastRead */
    public static final String COLUMNNAME_KmLastRead = "KmLastRead";

	/** Set KmLastRead	  */
	public void setKmLastRead (int KmLastRead);

	/** Get KmLastRead	  */
	public int getKmLastRead();

    /** Column name ManufacturedYear */
    public static final String COLUMNNAME_ManufacturedYear = "ManufacturedYear";

	/** Set Manufactured Year	  */
	public void setManufacturedYear (String ManufacturedYear);

	/** Get Manufactured Year	  */
	public String getManufacturedYear();

    /** Column name MotorNo */
    public static final String COLUMNNAME_MotorNo = "MotorNo";

	/** Set MotorNo	  */
	public void setMotorNo (String MotorNo);

	/** Get MotorNo	  */
	public String getMotorNo();

    /** Column name Pic1_ID */
    public static final String COLUMNNAME_Pic1_ID = "Pic1_ID";

	/** Set Pic1_ID	  */
	public void setPic1_ID (int Pic1_ID);

	/** Get Pic1_ID	  */
	public int getPic1_ID();

    /** Column name Pic2_ID */
    public static final String COLUMNNAME_Pic2_ID = "Pic2_ID";

	/** Set Pic2_ID	  */
	public void setPic2_ID (int Pic2_ID);

	/** Get Pic2_ID	  */
	public int getPic2_ID();

    /** Column name Pic3_ID */
    public static final String COLUMNNAME_Pic3_ID = "Pic3_ID";

	/** Set Pic3_ID	  */
	public void setPic3_ID (int Pic3_ID);

	/** Get Pic3_ID	  */
	public int getPic3_ID();

    /** Column name PlateNo */
    public static final String COLUMNNAME_PlateNo = "PlateNo";

	/** Set PlateNo	  */
	public void setPlateNo (String PlateNo);

	/** Get PlateNo	  */
	public String getPlateNo();

    /** Column name PurchaseType */
    public static final String COLUMNNAME_PurchaseType = "PurchaseType";

	/** Set PurchaseType	  */
	public void setPurchaseType (String PurchaseType);

	/** Get PurchaseType	  */
	public String getPurchaseType();

    /** Column name QtyPassenger */
    public static final String COLUMNNAME_QtyPassenger = "QtyPassenger";

	/** Set QtyPassenger	  */
	public void setQtyPassenger (int QtyPassenger);

	/** Get QtyPassenger	  */
	public int getQtyPassenger();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();

    /** Column name UY_Driver_ID */
    public static final String COLUMNNAME_UY_Driver_ID = "UY_Driver_ID";

	/** Set UY_Driver ID	  */
	public void setUY_Driver_ID (int UY_Driver_ID);

	/** Get UY_Driver ID	  */
	public int getUY_Driver_ID();

	public org.openup.fleet.model.I_UY_Driver getUY_Driver() throws RuntimeException;

    /** Column name UY_VehicleBrand_ID */
    public static final String COLUMNNAME_UY_VehicleBrand_ID = "UY_VehicleBrand_ID";

	/** Set UY_VehicleBrand ID	  */
	public void setUY_VehicleBrand_ID (int UY_VehicleBrand_ID);

	/** Get UY_VehicleBrand ID	  */
	public int getUY_VehicleBrand_ID();

	public org.openup.fleet.model.I_UY_VehicleBrand getUY_VehicleBrand() throws RuntimeException;

    /** Column name UY_VehicleBrandModel_ID */
    public static final String COLUMNNAME_UY_VehicleBrandModel_ID = "UY_VehicleBrandModel_ID";

	/** Set UY_VehicleBrandModel ID	  */
	public void setUY_VehicleBrandModel_ID (int UY_VehicleBrandModel_ID);

	/** Get UY_VehicleBrandModel ID	  */
	public int getUY_VehicleBrandModel_ID();

	public org.openup.fleet.model.I_UY_VehicleBrandModel getUY_VehicleBrandModel() throws RuntimeException;

    /** Column name UY_Vehicle_ID */
    public static final String COLUMNNAME_UY_Vehicle_ID = "UY_Vehicle_ID";

	/** Set UY_Vehicle ID	  */
	public void setUY_Vehicle_ID (int UY_Vehicle_ID);

	/** Get UY_Vehicle ID	  */
	public int getUY_Vehicle_ID();

    /** Column name UY_VehicleType_ID */
    public static final String COLUMNNAME_UY_VehicleType_ID = "UY_VehicleType_ID";

	/** Set UY_VehicleType ID	  */
	public void setUY_VehicleType_ID (int UY_VehicleType_ID);

	/** Get UY_VehicleType ID	  */
	public int getUY_VehicleType_ID();

	public org.openup.fleet.model.I_UY_VehicleType getUY_VehicleType() throws RuntimeException;

    /** Column name Value */
    public static final String COLUMNNAME_Value = "Value";

	/** Set Search Key.
	  * Search key for the record in the format required - must be unique
	  */
	public void setValue (String Value);

	/** Get Search Key.
	  * Search key for the record in the format required - must be unique
	  */
	public String getValue();
}
