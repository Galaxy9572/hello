package org.ljy.hello.rest.exceptions;

import lombok.Data;

/**
 * @author LJY
 */
@Data
public class ApiException extends RuntimeException {

    private String msg;

    public ApiException(String msg) {
        this.msg = msg;
    }


}
