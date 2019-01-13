package org.ljy.hello.user.enums;

import org.ljy.hello.rest.exceptions.ApiException;

import java.util.Arrays;

/**
 * @author LJY
 */
public enum GenderEnum {

    /**
     * 男
     */
    MALE("MALE"),

    /**
     * 女
     */
    FEMALE("FEMALE");

    private String gender;

    GenderEnum(String gender) {
        this.gender = gender;
    }

    public String gender() {
        return gender;
    }

    public static GenderEnum getGender(String gender) {
        return Arrays.stream(GenderEnum.values()).filter(e -> e.gender().equals(gender)).findFirst().orElseThrow(() -> new ApiException("Wrong Gender"));
    }
}
