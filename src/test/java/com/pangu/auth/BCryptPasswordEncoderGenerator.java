package com.pangu.auth;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPasswordEncoderGenerator {

    public static void main(String[] args) {
        BCryptPasswordEncoderGenerator gen = new BCryptPasswordEncoderGenerator();
        gen.gen();
        gen.gen1();

    }

    private void gen() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String encode = bCryptPasswordEncoder.encode("demo101");
        System.out.println("demo101:" + encode);
    }
    
    private void gen1() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String encode = bCryptPasswordEncoder.encode("userservice_secret");
        System.out.println("userservice_secret:" + encode);
    }
}
