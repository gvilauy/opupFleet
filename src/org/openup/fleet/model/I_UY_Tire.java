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

/** Generated Interface for UY_Tire
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0
 */
public interface I_UY_Tire 
{

    /** TableName=UY_Tire */
    public static final String Table_Name = "UY_Tire";

    /** AD_Table_ID=1000027 */
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

    /** Column name C_BPartner_ID */
    public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";

	/** Set Business Partner .
	  * Identifies a Business Partner
	  */
	public void setC_BPartner_ID (int C_BPartner_ID);

	/** Get Business Partner .
	  * Identifies a Business Partner
	  */
	public int getC_BPartner_ID();

	public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException;

    /** Column name C_Currency_ID */
    public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";

	/** Set Currency.
	  * The Currency for this record
	  */
	public void setC_Currency_ID (int C_Currency_ID);

	/** Get Currency.
	  * The Currency for this record
	  */
	public int getC_Currency_ID();

	public org.compiere.model.I_C_Currency getC_Currency() throws RuntimeException;

    /** Column name C_Invoice_ID */
    public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";

	/** Set Invoice.
	  * Invoice Identifier
	  */
	public void setC_Invoice_ID (int C_Invoice_ID);

	/** Get Invoice.
	  * Invoice Identifier
	  */
	public int getC_Invoice_ID();

	public org.compiere.model.I_C_Invoice getC_Invoice() throws RuntimeException;

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

    /** Column name DateInvoiced */
    public static final String COLUMNNAME_DateInvoiced = "DateInvoiced";

	/** Set Date Invoiced.
	  * Date printed on Invoice
	  */
	public void setDateInvoiced (Timestamp DateInvoiced);

	/** Get Date Invoiced.
	  * Date printed on Invoice
	  */
	public Timestamp getDateInvoiced();

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

    /** Column name IsAuxiliary */
    public static final String COLUMNNAME_IsAuxiliary = "IsAuxiliary";

	/** Set IsAuxiliary	  */
	public void setIsAuxiliary (boolean IsAuxiliary);

	/** Get IsAuxiliary	  */
	public boolean isAuxiliary();

    /** Column name IsRepaired */
    public static final String COLUMNNAME_IsRepaired = "IsRepaired";

	/** Set IsRepaired	  */
	public void setIsRepaired (boolean IsRepaired);

	/** Get IsRepaired	  */
	public boolean isRepaired();

    /** Column name KmTireNew */
    public static final String COLUMNNAME_KmTireNew = "KmTireNew";

	/** Set KmTireNew	  */
	public void setKmTireNew (int KmTireNew);

	/** Get KmTireNew	  */
	public int getKmTireNew();

    /** Column name KmTireNewEst */
    public static final String COLUMNNAME_KmTireNewEst = "KmTireNewEst";

	/** Set KmTireNewEst	  */
	public void setKmTireNewEst (int KmTireNewEst);

	/** Get KmTireNewEst	  */
	public int getKmTireNewEst();

    /** Column name KmTireRep */
    public static final String COLUMNNAME_KmTireRep = "KmTireRep";

	/** Set KmTireRep	  */
	public void setKmTireRep (int KmTireRep);

	/** Get KmTireRep	  */
	public int getKmTireRep();

    /** Column name KmTireRepEst */
    public static final String COLUMNNAME_KmTireRepEst = "KmTireRepEst";

	/** Set KmTireRepEst	  */
	public void setKmTireRepEst (int KmTireRepEst);

	/** Get KmTireRepEst	  */
	public int getKmTireRepEst();

    /** Column name KmTireTotal */
    public static final String COLUMNNAME_KmTireTotal = "KmTireTotal";

	/** Set KmTireTotal	  */
	public void setKmTireTotal (int KmTireTotal);

	/** Get KmTireTotal	  */
	public int getKmTireTotal();

    /** Column name KmVehicle */
    public static final String COLUMNNAME_KmVehicle = "KmVehicle";

	/** Set KmVehicle	  */
	public void setKmVehicle (int KmVehicle);

	/** Get KmVehicle	  */
	public int getKmVehicle();

    /** Column name M_Locator_ID */
    public static final String COLUMNNAME_M_Locator_ID = "M_Locator_ID";

	/** Set Locator.
	  * Warehouse Locator
	  */
	public void setM_Locator_ID (int M_Locator_ID);

	/** Get Locator.
	  * Warehouse Locator
	  */
	public int getM_Locator_ID();

	public org.compiere.model.I_M_Locator getM_Locator() throws RuntimeException;

    /** Column name M_Warehouse_ID */
    public static final String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";

	/** Set Warehouse.
	  * Storage Warehouse and Service Point
	  */
	public void setM_Warehouse_ID (int M_Warehouse_ID);

	/** Get Warehouse.
	  * Storage Warehouse and Service Point
	  */
	public int getM_Warehouse_ID();

	public org.compiere.model.I_M_Warehouse getM_Warehouse() throws RuntimeException;

    /** Column name PriceCost */
    public static final String COLUMNNAME_PriceCost = "PriceCost";

	/** Set Cost Price.
	  * Price per Unit of Measure including all indirect costs (Freight, etc.)
	  */
	public void setPriceCost (BigDecimal PriceCost);

	/** Get Cost Price.
	  * Price per Unit of Measure including all indirect costs (Freight, etc.)
	  */
	public BigDecimal getPriceCost();

    /** Column name PricePO */
    public static final String COLUMNNAME_PricePO = "PricePO";

	/** Set PO Price.
	  * Price based on a purchase order
	  */
	public void setPricePO (BigDecimal PricePO);

	/** Get PO Price.
	  * Price based on a purchase order
	  */
	public BigDecimal getPricePO();

    /** Column name TireStatus */
    public static final String COLUMNNAME_TireStatus = "TireStatus";

	/** Set TireStatus	  */
	public void setTireStatus (String TireStatus);

	/** Get TireStatus	  */
	public String getTireStatus();

    /** Column name TireType */
    public static final String COLUMNNAME_TireType = "TireType";

	/** Set TireType	  */
	public void setTireType (String TireType);

	/** Get TireType	  */
	public String getTireType();

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

    /** Column name UY_TireCategory_ID */
    public static final String COLUMNNAME_UY_TireCategory_ID = "UY_TireCategory_ID";

	/** Set UY_TireCategory ID	  */
	public void setUY_TireCategory_ID (int UY_TireCategory_ID);

	/** Get UY_TireCategory ID	  */
	public int getUY_TireCategory_ID();

	public org.openup.fleet.model.I_UY_TireCategory getUY_TireCategory() throws RuntimeException;

    /** Column name UY_TireDrop_ID */
    public static final String COLUMNNAME_UY_TireDrop_ID = "UY_TireDrop_ID";

	/** Set UY_TireDrop ID	  */
	public void setUY_TireDrop_ID (int UY_TireDrop_ID);

	/** Get UY_TireDrop ID	  */
	public int getUY_TireDrop_ID();

	public org.openup.fleet.model.I_UY_TireDrop getUY_TireDrop() throws RuntimeException;

    /** Column name UY_Tire_ID */
    public static final String COLUMNNAME_UY_Tire_ID = "UY_Tire_ID";

	/** Set UY_Tire ID	  */
	public void setUY_Tire_ID (int UY_Tire_ID);

	/** Get UY_Tire ID	  */
	public int getUY_Tire_ID();

    /** Column name UY_TireLocator_ID */
    public static final String COLUMNNAME_UY_TireLocator_ID = "UY_TireLocator_ID";

	/** Set UY_TireLocator ID	  */
	public void setUY_TireLocator_ID (int UY_TireLocator_ID);

	/** Get UY_TireLocator ID	  */
	public int getUY_TireLocator_ID();

	public org.openup.fleet.model.I_UY_TireLocator getUY_TireLocator() throws RuntimeException;

    /** Column name UY_Vehicle_ID */
    public static final String COLUMNNAME_UY_Vehicle_ID = "UY_Vehicle_ID";

	/** Set UY_Vehicle ID	  */
	public void setUY_Vehicle_ID (int UY_Vehicle_ID);

	/** Get UY_Vehicle ID	  */
	public int getUY_Vehicle_ID();

	public org.openup.fleet.model.I_UY_Vehicle getUY_Vehicle() throws RuntimeException;

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
