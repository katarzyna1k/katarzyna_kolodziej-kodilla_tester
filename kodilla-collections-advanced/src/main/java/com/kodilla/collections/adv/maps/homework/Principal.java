package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {
    private String principalName;
    private String schoolName;

    public Principal(String principalName, String schoolName) {
        this.principalName = principalName;
        this.schoolName = schoolName;
    }

    public String getPrincipalName() {
        return principalName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return Objects.equals(principalName, principal.principalName) && Objects.equals(schoolName, principal.schoolName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(principalName, schoolName);
    }

    @Override
    public String toString() {
        return "Principal{" +
                "principalName='" + principalName + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
