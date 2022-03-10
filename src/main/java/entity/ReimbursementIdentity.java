package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reimbursement_details")
public class ReimbursementIdentity{

    @Id
    @Column(name = "reimbursement_id")
    private int reimbursementId;

    @Column(name = "requesting_employee_id")
    private int requestingEmployeeId;

    @Column(name = "reimbursement_amount")
    private double reimbursementAmount;

    @Column(name = "reimbursement_pending")
    private boolean reimbursementPending;

    @Column(name = "date_of_request")
    private String dateOfRequest;

    public ReimbursementIdentity(){

    }

   




}