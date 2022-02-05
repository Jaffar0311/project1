package com.revature.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReimbursementTest {
    Reimbursement reimbursement = new Reimbursement(1, ReimbursementType.FOOD, ReimbursementStatus.PENDING,100.0,true, false, "food",true);

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    public void intialize(){

    }


    @Test
    void getUser_id() {
        assertEquals(1, reimbursement.getUser_id());
    }


    @Test
    void getReimbursementType() {
        assertEquals(ReimbursementType.FOOD, reimbursement.getReimbursementType());
    }


    @Test
    void getReimbursementStatus() {
        assertEquals(ReimbursementStatus.PENDING, reimbursement.getReimbursementStatus());
    }


    @Test
    void getReimbursementAmount() {
        assertEquals(100.0, reimbursement.getReimbursementAmount());
    }


    @Test
    void isReimbusementSubmitted() {
        assertEquals(true, reimbursement.isReimbusementSubmitted());
    }



    @Test
    void isReimbusementResolved() {
        assertEquals(false, reimbursement.isReimbusementResolved());
    }

    @Test
    void getDescription() {
        assertEquals("food",reimbursement.getDescription());
    }

    @Test
    void reimbursmentReceipt() {
        assertEquals(true, reimbursement.ReimbursmentReceipt());
    }

}