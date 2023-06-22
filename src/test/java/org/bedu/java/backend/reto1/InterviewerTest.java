package org.bedu.java.backend.reto1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class InterviewerTest {
    static String existingInterviewerName = "First";
    static String getExistingInterviewerLastName = "User";
    static String getExistingInterviewerEmail = "first@email.com";

    @BeforeEach
    public void setUp() throws Exception {
        Interviewer.data = new ArrayList<>();
    }

    @Test
    public void add() {
        Interviewer interviewer = new Interviewer(
                "Test",
                "User",
                "any@email.com",
                true
        );

        interviewer.add();

        int expectedId = Interviewer.data.size();
        assertEquals(
                expectedId,
                interviewer.id,
                "Interviewer ID should be the new List's size"
        );
    }
}