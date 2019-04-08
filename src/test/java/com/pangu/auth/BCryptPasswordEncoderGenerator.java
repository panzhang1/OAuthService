package com.pangu.auth;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPasswordEncoderGenerator {

    public static void main(String[] args) {
        BCryptPasswordEncoderGenerator gen = new BCryptPasswordEncoderGenerator();
        gen.gen();

    }

    private void gen() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String encode = bCryptPasswordEncoder.encode("demo101");
        System.out.println(encode);
    }
}
