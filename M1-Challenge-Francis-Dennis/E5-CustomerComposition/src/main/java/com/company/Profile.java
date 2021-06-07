package com.company;

import java.util.Objects;

public class Profile {

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private boolean isARewardsMember;

    public Profile() {
    }

    public Profile(String firstName, String lastName, String email, String phoneNumber, boolean isARewardsMember) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.isARewardsMember = isARewardsMember;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isARewardsMember() {
        return isARewardsMember;
    }

    public void setARewardsMember(boolean ARewardsMember) {
        isARewardsMember = ARewardsMember;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profile profile = (Profile) o;
        return isARewardsMember == profile.isARewardsMember && Objects.equals(firstName, profile.firstName) && Objects.equals(lastName, profile.lastName) && Objects.equals(email, profile.email) && Objects.equals(phoneNumber, profile.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, phoneNumber, isARewardsMember);
    }

    @Override
    public String toString() {
        return "Profile{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", isARewardsMember=" + isARewardsMember +
                '}';
    }
}
