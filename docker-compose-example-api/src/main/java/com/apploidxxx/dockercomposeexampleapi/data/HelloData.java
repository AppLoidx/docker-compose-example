package com.apploidxxx.dockercomposeexampleapi.data;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Arthur Kupriyanov on 12.06.2020
 */
@Data@NoArgsConstructor
public class HelloData {
    private String message;
    private Date createdDate;
    
    public HelloData(String message) {
        this.message = message;
        this.createdDate = new Date();
    }
    
}
