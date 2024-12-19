package com.example.demo.util;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PasswordEncoderTest {

    @Test
    public void testEncode() {
        String rawPassword = "mySecretPassword";

        String encodedPassword = PasswordEncoder.encode(rawPassword);

        assertThat(encodedPassword).isNotEqualTo(rawPassword);
        assertThat(encodedPassword).isNotEmpty();
    }

    @Test
    public void testMatches() {
        String rawPassword = "mySecretPassword";
        String encodedPassword = PasswordEncoder.encode(rawPassword);

        boolean matches = PasswordEncoder.matches(rawPassword, encodedPassword);

        assertThat(matches).isTrue();
    }

    @Test
    public void testMatchesWithInvalidPassword() {

        String rawPassword = "mySecretPassword";
        String wrongPassword = "wrongPassword";
        String encodedPassword = PasswordEncoder.encode(rawPassword);

        boolean matches = PasswordEncoder.matches(wrongPassword, encodedPassword);

        assertThat(matches).isFalse();
    }
}
