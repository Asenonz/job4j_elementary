package ru.job4j.array;

import java.util.zip.ZipFile;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean valid = true;
        if (name == "") {
            return false;
        }
            int code = name.codePointAt(0);
            if (isLowerLatinLetter(code)) {
                for (int i = 1; i < name.length(); i++) {
                    code = name.codePointAt(i);
                    if (isLowerLatinLetter(code) || isUpperLatinLetter(code) || isNumber(code) || isSpecialSymbol(code)) {
                        valid = true;
                    } else {
                        return false;
                    }
                }
            } else {
                return false;
            }
        return valid;
    }

    public static boolean isSpecialSymbol(int code) {
        boolean valid = true;
        if (code != 95 && code != 36) {
            valid = false;
        }
        return valid;
    }

    public static boolean isUpperLatinLetter(int code) {
        boolean valid = true;
        if (code < 65 || code > 90) {
            valid = false;
        }
        return valid;
    }

    public static boolean isLowerLatinLetter(int code) {
        boolean valid = true;
        if (code < 97 || code > 122) {
            valid = false;
        }
        return valid;
    }

    public static boolean isNumber(int code) {
        boolean valid = true;
        if (code < 48 || code > 57) {
            valid = false;
        }
        return valid;
    }
}




