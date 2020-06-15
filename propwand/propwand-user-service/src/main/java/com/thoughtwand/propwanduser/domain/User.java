package com.thoughtwand.propwand.userservice.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Dayan Kodippily - 18/05/20
 */

@Entity
@Table(name = "user_info")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Enumerated(EnumType.STRING)
    private UserSalutation salutation;

    private String givenName;

    private String surname;

    @Enumerated(EnumType.STRING)
    private UserSex userSex;

    @Enumerated(EnumType.STRING)
    private UserStatus userStatus;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public UserSalutation getSalutation() {
        return salutation;
    }

    public void setSalutation(UserSalutation salutation) {
        this.salutation = salutation;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public UserSex getUserSex() {
        return userSex;
    }

    public void setUserSex(UserSex userSex) {
        this.userSex = userSex;
    }

    public UserStatus getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus;
    }


}
