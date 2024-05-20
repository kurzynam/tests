package org.example;

import pl.umcs.oop.auth.Account;
import pl.umcs.oop.database.DatabaseConnection;

import javax.naming.AuthenticationException;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection.connect("songs.db");
        Account.Persistence.init();
        Account.Persistence.register("mkurzyna", "maslo");
        try {
            Account.Persistence.authenticate("mkurzyna", "maslo");
        } catch (AuthenticationException e) {
            throw new RuntimeException(e);
        }
    }
}