package com.jesperapps.api.User.model;

import com.jesperapps.api.User.message.*;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "USR_USER_MASTER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID", unique = true, nullable = false, updatable = false)
    private Long id;
    private String firstName;
    private String lastName;
    private String emailId;
    private String password;
    private String phoneNumber;
    private String alternatePhoneNumber;

    public User(UserRequestEntity userRequestEntity) {
        this.id = userRequestEntity.getId();
        this.firstName = userRequestEntity.getFirstName();
        this.lastName = userRequestEntity.getLastName();
        this.emailId = userRequestEntity.getEmailId();
        this.password = userRequestEntity.getPassword();
        this.phoneNumber = userRequestEntity.getPhoneNumber();
        this.alternatePhoneNumber = userRequestEntity.getAlternatePhoneNumber();
    }
}
