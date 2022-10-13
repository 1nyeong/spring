package com.study.mvc20220927h.builder;

public class UserMain {

    public static void main(String[] args) {
        User user = User.UserBuilder.userBuilder()
                .name("인영")
                .username("inyeong")
                .password("1234")
                .email("user@example.com")
                .build();

    }
}
