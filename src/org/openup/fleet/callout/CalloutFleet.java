package org.openup.fleet.callout;

import java.util.Properties;

import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.util.DB;
import org.openup.fleet.model.MUYTire;

/**
 * Product: Adempiere ERP & CRM Smart Business Solution. Localization : Uruguay (LUY).
 * OpenUp. Created by gabriel on 10/5/16.
 */
public class CalloutFleet extends CalloutEngine{
	
	 /**
     * Callout para seteo datos de neumatico en documento de baja de neumaticos.
     * Consulta la tabla UY_Tire
     * OpenUp. Nicolas Sarlabos. 14/10/2016.
     * @param ctx
     * @param WindowNo
     * @param mTab
     * @param mField
     * @param value
     * @return
     */
    public String setTireDropInfo (Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value){

        if (value == null)
            return "";

        //	No Callout Active to fire dependent values
        if (isCalloutActive())	//	prevent recursive
            return "";

        int tireID = (int) value;
        
        if(tireID > 0){
        	
        	MUYTire tire = new MUYTire(ctx, tireID, null);
        	
        	if(tire.getKmTireTotal() > 0)  mTab.setValue("KmTireTotal", tire.getKmTireTotal());
        	if(tire.getUY_TireCategory_ID() > 0) mTab.setValue("UY_TireCategory_ID", tire.getUY_TireCategory_ID());
        	if(tire.getM_Warehouse_ID() > 0) mTab.setValue("M_Warehouse_ID", tire.getM_Warehouse_ID());
        	if(tire.getM_Locator_ID() > 0) mTab.setValue("M_Locator_ID", tire.getM_Locator_ID());        	
        	
        }  

        return "";

    }


}
