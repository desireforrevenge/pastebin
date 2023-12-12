package com.org.revenge.devstudio.utils;

import java.util.Base64;

public class Base64Hash {

    public static String codeToBase64(String text) {
        byte[] encodedBytes = Base64.getEncoder().encode(text.getBytes());
        return new String(encodedBytes);
    }

    public static String decodeFromBase64(String encodedText) {
        byte[] decodedBytes = Base64.getDecoder().decode(encodedText);
        return new String(decodedBytes);
    }
}
