package com.example.Plantschedule.member;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {

    long memberId;
    String email;
    String name;
    String phone;

}
