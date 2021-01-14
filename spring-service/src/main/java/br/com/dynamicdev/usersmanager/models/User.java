package br.com.dynamicdev.usersmanager.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class User {

    private String name;
    private String lastname;
}