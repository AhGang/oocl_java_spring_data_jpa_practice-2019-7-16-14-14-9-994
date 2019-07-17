package com.tw.apistackbase.core;

import javax.persistence.*;
import java.util.List;
@Entity
public class Profile {
    private int registeredCapital;
    private String certId;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Profile() {
    }

    public int getRegisteredCapital() {
        return registeredCapital;
    }

    public void setRegisteredCapital(int registeredCapital) {
        this.registeredCapital = registeredCapital;
    }

    public String getCertId() {
        return certId;
    }

    public void setCretId(String certId) {
        this.certId = certId;
    }
}
