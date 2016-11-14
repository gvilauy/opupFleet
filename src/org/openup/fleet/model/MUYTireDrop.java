/**
 * 
 */
package org.openup.fleet.model;

import java.io.File;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.model.ModelValidationEngine;
import org.compiere.model.ModelValidator;
import org.compiere.process.DocAction;
import org.compiere.process.DocOptions;
import org.compiere.process.DocumentEngine;

/**
 * @author Nicolás
 *
 */
public class MUYTireDrop extends X_UY_TireDrop implements DocAction, DocOptions{
	
    /**	Process Message 			*/
    private String		m_processMsg = null;
    /**	Just Prepared Flag			*/
    private boolean		m_justPrepared = false;


	/**
	 * 
	 */
	private static final long serialVersionUID = 6749816047319428791L;

	/**
	 * @param ctx
	 * @param UY_TireDrop_ID
	 * @param trxName
	 */
	public MUYTireDrop(Properties ctx, int UY_TireDrop_ID, String trxName) {
		super(ctx, UY_TireDrop_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param ctx
	 * @param rs
	 * @param trxName
	 */
	public MUYTireDrop(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int customizeValidActions(String docStatus, Object processing, String orderType, String isSOTrx,
			int AD_Table_ID, String[] docAction, String[] options, int index) {
	
        int newIndex = 0;

        if ((docStatus.equalsIgnoreCase(STATUS_Drafted))
                || (docStatus.equalsIgnoreCase(STATUS_Invalid))
                || (docStatus.equalsIgnoreCase(STATUS_InProgress))){

            options[newIndex++] = DocumentEngine.ACTION_Complete;

        }
        else if (docStatus.equalsIgnoreCase(STATUS_Completed)){
            
            options[newIndex++] = DocumentEngine.ACTION_ReActivate;
            options[newIndex++] = DocumentEngine.ACTION_Void;
        }

        return newIndex;
	}

	@Override
	public boolean processIt(String action) throws Exception {
        m_processMsg = null;
        DocumentEngine engine = new DocumentEngine (this, getDocStatus());
        return engine.processIt (action, getDocAction());
	}

	@Override
	public boolean unlockIt() {
        log.info("unlockIt - " + toString());
        setProcessing(false);
        return true;
	}

	@Override
	public boolean invalidateIt() {
        log.info(toString());
        setDocAction(DOCACTION_Prepare);
        return true;
	}

	@Override
	public String prepareIt() {
        m_justPrepared = true;
        if (!DocAction.ACTION_Complete.equals(getDocAction()))
            setDocAction(DocAction.ACTION_Complete);
        return DocAction.STATUS_InProgress;
	}

	@Override
	public boolean approveIt() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean rejectIt() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String completeIt() {
		 //	Re-Check
        if (!m_justPrepared)
        {
            String status = prepareIt();
            if (!DocAction.STATUS_InProgress.equals(status))
                return status;
        }

        // Timing Before Complete
        m_processMsg = ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_BEFORE_COMPLETE);
        if (m_processMsg != null)
            return DocAction.STATUS_Invalid;
        
        //seteo estado BAJA en el numatico
        MUYTire tire = (MUYTire)this.getUY_Tire();
        tire.setTireStatus(X_UY_Tire.TIRESTATUS_BAJA);
        tire.setUY_TireDrop_ID(this.get_ID());
        tire.saveEx();

        // Timing After Complete
        m_processMsg = ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_AFTER_COMPLETE);
        if (m_processMsg != null)
            return DocAction.STATUS_Invalid;

        // Refresco atributos
        this.setDocAction(DocAction.ACTION_None);
        this.setDocStatus(DocumentEngine.STATUS_Completed);
        this.setProcessing(false);
        this.setProcessed(true);

        return DocAction.STATUS_Completed;
	}

	@Override
	public boolean voidIt() {

		// Before Void
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_BEFORE_VOID);
		if (m_processMsg != null)
			return false;
		
        MUYTire tire = (MUYTire)this.getUY_Tire();
        
        if(tire.isRepaired()){
        	
        	tire.setTireStatus(X_UY_Tire.TIRESTATUS_RECAUCHUTADO);
        	
        } else tire.setTireStatus(X_UY_Tire.TIRESTATUS_NUEVO);
        
        tire.setUY_TireDrop_ID(0);
        tire.saveEx();  
		
		// After Void
        m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_VOID);
		if (m_processMsg != null)
			return false;

        // Refresco atributos
        this.setDocAction(DocAction.ACTION_None);
        this.setDocStatus(DocumentEngine.STATUS_Voided);
        this.setProcessing(false);
        this.setProcessed(true);
		
		return true;       
        
	}

	@Override
	public boolean closeIt() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean reverseCorrectIt() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean reverseAccrualIt() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean reActivateIt() {
		 // Before reActivate
        m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_BEFORE_REACTIVATE);
        if (m_processMsg != null)
            return false;
        
        MUYTire tire = (MUYTire)this.getUY_Tire();
        
        if(tire.isRepaired()){
        	
        	tire.setTireStatus(X_UY_Tire.TIRESTATUS_RECAUCHUTADO);
        	
        } else tire.setTireStatus(X_UY_Tire.TIRESTATUS_NUEVO);
        
        tire.setUY_TireDrop_ID(0);
        tire.saveEx();        
        
        // After reActivate
        m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_REACTIVATE);
        if (m_processMsg != null)
            return false;

        // Refresco atributos
        this.setDocAction(DocAction.ACTION_Complete);
        this.setDocStatus(DocumentEngine.STATUS_InProgress);
        this.setProcessing(false);
        this.setProcessed(false);

        return true;
	}

	@Override
	public String getSummary() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDocumentInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public File createPDF() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getProcessMsg() {
		return m_processMsg;
	}

	@Override
	public int getDoc_User_ID() {
		return getCreatedBy();
	}

	@Override
	public int getC_Currency_ID() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public BigDecimal getApprovalAmt() {
		// TODO Auto-generated method stub
		return null;
	}

}
