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

/** Generated Interface for UY_VehicleType
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0
 */
public interface I_UY_VehicleType 
{

    /** TableName=UY_VehicleType */
    public static final String Table_Name = "UY_VehicleType";

    /** AD_Table_ID=1000014 */
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

    /** Column name AxisType */
    public static final String COLUMNNAME_AxisType = "AxisType";

	/** Set AxisType	  */
	public void setAxisType (String AxisType);

	/** Get AxisType	  */
	public String getAxisType();

    /** Column name CanAssociate */
    public static final String COLUMNNAME_CanAssociate = "CanAssociate";

	/** Set CanAssociate	  */
	public void setCanAssociate (boolean CanAssociate);

	/** Get CanAssociate	  */
	public boolean isCanAssociate();

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

    /** Column name Description */
    public static final String COLUMNNAME_Description = "Description";

	/** Set Description.
	  * Optional short description of the record
	  */
	public void setDescription (String Description);

	/** Get Description.
	  * Optional short description of the record
	  */
	public String getDescription();

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

    /** Column name IsContainer */
    public static final String COLUMNNAME_IsContainer = "IsContainer";

	/** Set IsContainer.
	  * Es contenedor
	  */
	public void setIsContainer (boolean IsContainer);

	/** Get IsContainer.
	  * Es contenedor
	  */
	public boolean isContainer();

    /** Column name Name */
    public static final String COLUMNNAME_Name = "Name";

	/** Set Name.
	  * Alphanumeric identifier of the entity
	  */
	public void setName (String Name);

	/** Get Name.
	  * Alphanumeric identifier of the entity
	  */
	public String getName();

    /** Column name QtyAxis */
    public static final String COLUMNNAME_QtyAxis = "QtyAxis";

	/** Set QtyAxis	  */
	public void setQtyAxis (int QtyAxis);

	/** Get QtyAxis	  */
	public int getQtyAxis();

    /** Column name QtyTires */
    public static final String COLUMNNAME_QtyTires = "QtyTires";

	/** Set QtyTires	  */
	public void setQtyTires (int QtyTires);

	/** Get QtyTires	  */
	public int getQtyTires();

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

    /** Column name UY_VehicleType_ID */
    public static final String COLUMNNAME_UY_VehicleType_ID = "UY_VehicleType_ID";

	/** Set UY_VehicleType ID	  */
	public void setUY_VehicleType_ID (int UY_VehicleType_ID);

	/** Get UY_VehicleType ID	  */
	public int getUY_VehicleType_ID();

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
