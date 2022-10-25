package ru.job4j.array;

import java.util.zip.ZipFile;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean valid = false;
        if (!name.isEmpty() && isLowerLatinLetter(name.codePointAt(0))) {
            valid = true;
                for (int i = 1; i < name.length(); i++) {
                    int code = name.codePointAt(i);
                    if (!(isLowerLatinLetter(code) || isUpperLatinLetter(code) || Character.isDigit(code) || isSpecialSymbol(code))) {
                        valid = false;
                        break;
                    }
                }
        }
        return valid;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 95 || code == 36;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}




