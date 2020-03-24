package com.challenges.codeWars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.type.filter.RegexPatternTypeFilter;

import java.util.Arrays;
import java.util.regex.Pattern;

@SpringBootApplication
public class CodeWarsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodeWarsApplication.class, args);
    }

    public static String maskify(String str) {

        if (str.length() <= 4) {
            return str;
        }

        int count = 0;
        String block = "";
        String[] newStr;

        if (str.length() - 4 >= 0) {
            count = str.length() - 3;
        }

        newStr = str.split("", count);

        int i = 0;
        for (String s : newStr) {
            if (newStr.length - 2 >= i) {
                newStr[i] = "#";
            }
            i++;
        }
        for (int j = 0; j <= newStr.length - 1; j++) {
            block += newStr[j];
        }
		
        return block;
    }
}
