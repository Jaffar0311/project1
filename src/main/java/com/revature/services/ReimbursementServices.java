package com.revature.services;

import com.revature.daos.ReimbursementDAO;
import com.revature.daos.ReimbursementDaoImpl;
import com.revature.model.Reimbursement;
import com.revature.model.ReimbursementStatus;
import com.revature.model.ReimbursementType;

public class ReimbursementServices {

    private ReimbursementDAO reimbDao = new ReimbursementDaoImpl();

    public boolean addReimbursement() {

        Reimbursement reimb = new Reimbursement(1, ReimbursementType.FOOD, ReimbursementStatus.PENDING, 100.0, true, false, "food", true);
        return reimbDao.addReimbursement(reimb);
    }
}
