package com.org.revenge.devstudio.services;

import java.util.Random;

import static com.org.revenge.devstudio.utils.Base64Hash.codeToBase64;
import static com.org.revenge.devstudio.utils.Base64Hash.decodeFromBase64;

public class KeyGeneration{
    public static String symbolGenerator() {
        StringBuilder key = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 8; i++) {
            key.append((char) (random.nextInt(('z' - 'a') + 1) + 'a'));
        } //random letter generator

        for (int i = 0; i < 2; i++) {
            key.append(random.nextInt(((9 - 1) + 1) + 1));
        } //random number generator

        return codeToBase64(key.toString());
    }

    public static boolean isOriginal() {
        //todo
        //проход по базе данных со всеми ключами, если уже есть такой - возвращаем false. Иначе true

        return false;
    }
}