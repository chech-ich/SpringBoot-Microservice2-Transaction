package com.sha.transaction.model.entity;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@javax.persistence.Entity
@Table(name = "TRANSACTIONS")
public class Transaction extends Entity<Integer>
{
    @Override
    public void setId(Integer id) {
        super.setId(id);
    }

    @NonNull
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "TRANSACTION_ID")
    @Id
    @Override
    public Integer getId()
    {
        return super.getId();
    }

    @Column(name = "PRODUCT_ID", nullable = false)
    private Integer productID;

    @Column(name = "USER_ID", nullable = false)
    private Integer userID;

    @Temporal(TemporalType.DATE)
    @Column(name = "TRANSACTION_TIME")
    private Date transactionTime;
}
