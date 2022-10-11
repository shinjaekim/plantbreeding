package com.example.Plantschedule.member;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class Dto {

    @Data
    public static class PostDto{

        @Email
        String email;

        @NotBlank
        String name;
        String phone;


    }

    @Data
    public static class PatchDto{

        private String name;
        private String phone;


    }

    public static class ResponseDto{

        long memberId;
        String email;
        String name;
        String phone;

    }
}
