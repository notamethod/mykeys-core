package com.notamethod.mkcore.crl;

import com.notamethod.mkcore.certificate.Certificate;

import java.math.BigInteger;
import java.security.cert.CRLReason;
import java.security.cert.X509CRLEntry;
import java.util.Date;

public class CRLEntry {
    private BigInteger serialNumber;
    private String subject;
    private Date revocationDate;
    private int revocationReason;
    private CRLReason reason;

    public CRLEntry(Certificate value, int revocationReason) {
        serialNumber = value.getX509Certificate().getSerialNumber();
        subject = value.getSubjectString();
        revocationDate = new Date();
        this.revocationReason = revocationReason;
    }

    public CRLEntry(X509CRLEntry value, String subject) {
        serialNumber = value.getSerialNumber();
        this.subject = subject;
        revocationDate = new Date();
        reason = value.getRevocationReason();
    }

    public BigInteger getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(BigInteger serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Object getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Object getRevocationDate() {
        return revocationDate;
    }

    public void setRevocationDate(Date revocationDate) {
        this.revocationDate = revocationDate;
    }

    public int getReason() {

        return revocationReason;
    }

    public void setReason(CRLReason revocationReason) {
        this.reason = revocationReason;
    }
}
