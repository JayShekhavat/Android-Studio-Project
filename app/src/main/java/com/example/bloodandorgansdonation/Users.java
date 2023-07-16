package com.example.bloodandorgansdonation;

public class Users {
    String fullName,age,phoneNumber,bloodType,gender,userEmail,password;

    public Users() {
    }

    public Users(String fullName, String age, String phoneNumber, String bloodType, String gender, String userName, String password) {
        this.fullName = fullName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.bloodType = bloodType;
        this.gender = gender;
        this.userEmail = userEmail;
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
