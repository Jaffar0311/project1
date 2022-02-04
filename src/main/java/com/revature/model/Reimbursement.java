package com.revature.model;

public class Reimbursement {
    private int reimbursementId;
    private double amount;
    private int employeeId;
    private int managerId;
    private ReimbursementStatus status;

    public Reimbursement() {
    }

    public Reimbursement(int reimbursementId, double amount, int employeeId, int managerId, ReimbursementStatus status) {
        this.reimbursementId = reimbursementId;
        this.amount = amount;
        this.employeeId = employeeId;
        this.managerId = managerId;
        this.status = status;
    }

    public int getReimbursementId() {
        return reimbursementId;
    }

    public void setReimbursementId(int reimbursementId) {
        this.reimbursementId = reimbursementId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public ReimbursementStatus getStatus() {
        return status;
    }

    public void setStatus(ReimbursementStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Reimbursement{" +
                "reimbursementId=" + reimbursementId +
                ", amount=" + amount +
                ", employeeId=" + employeeId +
                ", managerId=" + managerId +
                ", status=" + status +
                '}';
    }
}
