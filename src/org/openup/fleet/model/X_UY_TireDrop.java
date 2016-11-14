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

/** Generated Model for UY_TireDrop
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_UY_TireDrop extends PO implements I_UY_TireDrop, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20161014L;

    /** Standard Constructor */
    public X_UY_TireDrop (Properties ctx, int UY_TireDrop_ID, String trxName)
    {
      super (ctx, UY_TireDrop_ID, trxName);
      /** if (UY_TireDrop_ID == 0)
        {
			setC_DocType_ID (0);
			setDateAcct (new Timestamp( System.currentTimeMillis() ));
			setDateTrx (new Timestamp( System.currentTimeMillis() ));
			setDocAction (null);
// CO
			setDocStatus (null);
// DR
			setDocumentNo (null);
			setM_Locator_ID (0);
			setM_Warehouse_ID (0);
			setProcessed (false);
// N
			setProcessing (false);
// N
			setUY_TireDrop_ID (0);
			setUY_TireDropReason_ID (0);
			setUY_Tire_ID (0);
        } */
    }

    /** Load Constructor */
    public X_UY_TireDrop (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_UY_TireDrop[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_C_DocType getC_DocType() throws RuntimeException
    {
		return (org.compiere.model.I_C_DocType)MTable.get(getCtx(), org.compiere.model.I_C_DocType.Table_Name)
			.getPO(getC_DocType_ID(), get_TrxName());	}

	/** Set Document Type.
		@param C_DocType_ID 
		Document type or rules
	  */
	public void setC_DocType_ID (int C_DocType_ID)
	{
		if (C_DocType_ID < 0) 
			set_ValueNoCheck (COLUMNNAME_C_DocType_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_DocType_ID, Integer.valueOf(C_DocType_ID));
	}

	/** Get Document Type.
		@return Document type or rules
	  */
	public int getC_DocType_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_DocType_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Account Date.
		@param DateAcct 
		Accounting Date
	  */
	public void setDateAcct (Timestamp DateAcct)
	{
		set_Value (COLUMNNAME_DateAcct, DateAcct);
	}

	/** Get Account Date.
		@return Accounting Date
	  */
	public Timestamp getDateAcct () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateAcct);
	}

	/** Set Transaction Date.
		@param DateTrx 
		Transaction Date
	  */
	public void setDateTrx (Timestamp DateTrx)
	{
		set_Value (COLUMNNAME_DateTrx, DateTrx);
	}

	/** Get Transaction Date.
		@return Transaction Date
	  */
	public Timestamp getDateTrx () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateTrx);
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

	/** DocAction AD_Reference_ID=135 */
	public static final int DOCACTION_AD_Reference_ID=135;
	/** Complete = CO */
	public static final String DOCACTION_Complete = "CO";
	/** Approve = AP */
	public static final String DOCACTION_Approve = "AP";
	/** Reject = RJ */
	public static final String DOCACTION_Reject = "RJ";
	/** Post = PO */
	public static final String DOCACTION_Post = "PO";
	/** Void = VO */
	public static final String DOCACTION_Void = "VO";
	/** Close = CL */
	public static final String DOCACTION_Close = "CL";
	/** Reverse - Correct = RC */
	public static final String DOCACTION_Reverse_Correct = "RC";
	/** Reverse - Accrual = RA */
	public static final String DOCACTION_Reverse_Accrual = "RA";
	/** Invalidate = IN */
	public static final String DOCACTION_Invalidate = "IN";
	/** Re-activate = RE */
	public static final String DOCACTION_Re_Activate = "RE";
	/** <None> = -- */
	public static final String DOCACTION_None = "--";
	/** Prepare = PR */
	public static final String DOCACTION_Prepare = "PR";
	/** Unlock = XL */
	public static final String DOCACTION_Unlock = "XL";
	/** Wait Complete = WC */
	public static final String DOCACTION_WaitComplete = "WC";
	/** Set Document Action.
		@param DocAction 
		The targeted status of the document
	  */
	public void setDocAction (String DocAction)
	{

		set_Value (COLUMNNAME_DocAction, DocAction);
	}

	/** Get Document Action.
		@return The targeted status of the document
	  */
	public String getDocAction () 
	{
		return (String)get_Value(COLUMNNAME_DocAction);
	}

	/** DocStatus AD_Reference_ID=131 */
	public static final int DOCSTATUS_AD_Reference_ID=131;
	/** Drafted = DR */
	public static final String DOCSTATUS_Drafted = "DR";
	/** Completed = CO */
	public static final String DOCSTATUS_Completed = "CO";
	/** Approved = AP */
	public static final String DOCSTATUS_Approved = "AP";
	/** Not Approved = NA */
	public static final String DOCSTATUS_NotApproved = "NA";
	/** Voided = VO */
	public static final String DOCSTATUS_Voided = "VO";
	/** Invalid = IN */
	public static final String DOCSTATUS_Invalid = "IN";
	/** Reversed = RE */
	public static final String DOCSTATUS_Reversed = "RE";
	/** Closed = CL */
	public static final String DOCSTATUS_Closed = "CL";
	/** Unknown = ?? */
	public static final String DOCSTATUS_Unknown = "??";
	/** In Progress = IP */
	public static final String DOCSTATUS_InProgress = "IP";
	/** Waiting Payment = WP */
	public static final String DOCSTATUS_WaitingPayment = "WP";
	/** Waiting Confirmation = WC */
	public static final String DOCSTATUS_WaitingConfirmation = "WC";
	/** Set Document Status.
		@param DocStatus 
		The current status of the document
	  */
	public void setDocStatus (String DocStatus)
	{

		set_Value (COLUMNNAME_DocStatus, DocStatus);
	}

	/** Get Document Status.
		@return The current status of the document
	  */
	public String getDocStatus () 
	{
		return (String)get_Value(COLUMNNAME_DocStatus);
	}

	/** Set Document No.
		@param DocumentNo 
		Document sequence number of the document
	  */
	public void setDocumentNo (String DocumentNo)
	{
		set_Value (COLUMNNAME_DocumentNo, DocumentNo);
	}

	/** Get Document No.
		@return Document sequence number of the document
	  */
	public String getDocumentNo () 
	{
		return (String)get_Value(COLUMNNAME_DocumentNo);
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

	/** Set Processed.
		@param Processed 
		The document has been processed
	  */
	public void setProcessed (boolean Processed)
	{
		set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
	}

	/** Get Processed.
		@return The document has been processed
	  */
	public boolean isProcessed () 
	{
		Object oo = get_Value(COLUMNNAME_Processed);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Process Now.
		@param Processing Process Now	  */
	public void setProcessing (boolean Processing)
	{
		set_Value (COLUMNNAME_Processing, Boolean.valueOf(Processing));
	}

	/** Get Process Now.
		@return Process Now	  */
	public boolean isProcessing () 
	{
		Object oo = get_Value(COLUMNNAME_Processing);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
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

	/** Set UY_TireDrop ID.
		@param UY_TireDrop_ID UY_TireDrop ID	  */
	public void setUY_TireDrop_ID (int UY_TireDrop_ID)
	{
		if (UY_TireDrop_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_UY_TireDrop_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_UY_TireDrop_ID, Integer.valueOf(UY_TireDrop_ID));
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

	public org.openup.fleet.model.I_UY_TireDropReason getUY_TireDropReason() throws RuntimeException
    {
		return (org.openup.fleet.model.I_UY_TireDropReason)MTable.get(getCtx(), org.openup.fleet.model.I_UY_TireDropReason.Table_Name)
			.getPO(getUY_TireDropReason_ID(), get_TrxName());	}

	/** Set UY_TireDropReason ID.
		@param UY_TireDropReason_ID UY_TireDropReason ID	  */
	public void setUY_TireDropReason_ID (int UY_TireDropReason_ID)
	{
		if (UY_TireDropReason_ID < 1) 
			set_Value (COLUMNNAME_UY_TireDropReason_ID, null);
		else 
			set_Value (COLUMNNAME_UY_TireDropReason_ID, Integer.valueOf(UY_TireDropReason_ID));
	}

	/** Get UY_TireDropReason ID.
		@return UY_TireDropReason ID	  */
	public int getUY_TireDropReason_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_UY_TireDropReason_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.openup.fleet.model.I_UY_Tire getUY_Tire() throws RuntimeException
    {
		return (org.openup.fleet.model.I_UY_Tire)MTable.get(getCtx(), org.openup.fleet.model.I_UY_Tire.Table_Name)
			.getPO(getUY_Tire_ID(), get_TrxName());	}

	/** Set UY_Tire ID.
		@param UY_Tire_ID UY_Tire ID	  */
	public void setUY_Tire_ID (int UY_Tire_ID)
	{
		if (UY_Tire_ID < 1) 
			set_Value (COLUMNNAME_UY_Tire_ID, null);
		else 
			set_Value (COLUMNNAME_UY_Tire_ID, Integer.valueOf(UY_Tire_ID));
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
}