package com.kolanvs.feminist;

public class FeministException extends Exception {

    Integer excCode;

    FeministException(Integer code){
        this.excCode = code;
    }

    public String toString() {
        return "ExcCause is" + excCode.toString() + "\n";
    }
}
