package ru.mail.jobstest.jenkins.properties;

import config.CredentialsConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class OwnerTests {

    CredentialsConfig config = ConfigFactory.create(CredentialsConfig.class);

    @Test
    @Tag("owner")
    void loginTest() {
        String login = config.login();
        String password = config.password();

        String login_selenoid = config.login_selenoid();
        String password_selenoid = config.password_selenoid();

        System.out.println("Login " + login );
        System.out.println("Password " + password);

        String message = "I logged in as " + login + " with password " + password;
        String message_selenoid = "I logged in as " + login_selenoid + " with password " + password_selenoid;
        System.out.println(message);
        System.out.println(message_selenoid);
    }
}
