package com.prasertcbs;

import java.time.LocalDate;

/**
 * Created by prasert on 11/4/2014.
 */
public class PersonV2 {

    // PersonV2 composes of PersonName(en, th).
    private PersonName nameEn, nameTh;
    private LocalDate dob;

    public PersonV2(PersonName nameEn, PersonName nameTh, LocalDate dob) {
        this.nameEn = nameEn;
        this.nameTh = nameTh;
        this.dob = dob;
    }

    public PersonV2() {
    }

    @Override
    public String toString() {
        return "PersonV2{" +
                "nameEn=" + nameEn +
                ", nameTh=" + nameTh +
                ", dob=" + dob +
                '}';
    }

    public PersonName getNameEn() {
        return nameEn;
    }

    public void setNameEn(PersonName nameEn) {
        this.nameEn = nameEn;
    }

    public PersonName getNameTh() {
        return nameTh;
    }

    public void setNameTh(PersonName nameTh) {
        this.nameTh = nameTh;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}
