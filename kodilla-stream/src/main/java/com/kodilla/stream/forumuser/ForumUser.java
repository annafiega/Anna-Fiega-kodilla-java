package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int numberID;
    private final String usersName;
    private final char sex;
    private final LocalDate birthDate;
    private final int postNumber;

    public ForumUser(int numberID, String usersName, char sex, int yearOfBirth,
                     int monthOfBirth, int dayOfBirth, int postNumber) {
        this.numberID = numberID;
        this.usersName = usersName;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);;
        this.postNumber = postNumber;
    }

    public int getNumberID() {
        return numberID;
    }

    public String getUsersName() {
        return usersName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return birthDate;
    }

    public int getPostNumber() {
        return postNumber;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "numberID=" + numberID +
                ", usersName='" + usersName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + birthDate +
                ", postNumber=" + postNumber +
                '}';
    }
}