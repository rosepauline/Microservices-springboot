package com.jesperapps.api.User.message;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRequestEntity {

    private Long id;
    private String firstName;
    private String lastName;
    private String emailId;
    private String password;
    private String phoneNumber;
    private String alternatePhoneNumber;
}
