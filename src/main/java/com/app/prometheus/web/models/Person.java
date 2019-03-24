package com.app.prometheus.web.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person implements Serializable {
    private static final long serialVersionUID = 3570556679061270028L;
    private int personId;
    private String firstName;
    private String lastName;
    private String email;

}
