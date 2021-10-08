package za.ac.nwu.ac.domain.persistence;


import groovy.transform.EqualsAndHashCode;
import groovy.transform.ToString;
import groovy.xml.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Setter
@Getter
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "DEMO_ACCOUNT_TYPE", schema = "VITRSA_SANDBOX")
public class AccountTransaction implements Serializable {

    @Id
    @SequenceGenerator(name = "VIT_RSA_GENERIC_SEQ", sequenceName = "VITRSA_SANDBOX.VIT_RSA_GENERIC_SEQ", allocationSize = 1)
    @GeneratedValues(strategy = GenerationType.SEQUENCE, generator = "VIT_RSA_GENERIC_SEQ")
    @Column(name = "TX_ID")
    private Long transactionId;

    @Column(name = "ACCOUNT_TYPE_ID")
    private Long accountTypeId;

    @Column(name = "MEMBER_ID")
    private Long memberId;

    @Column(name = "AMOUNT")
    private Long amount;

    @Column(name = "TX_DATE")
    private LocalDate transactionDate;


    public AccountTransaction(AccountType accountType, long l, long l1, LocalDate now) {
    }
}
