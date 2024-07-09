package com.robie.sobie.testing.forum;

import com.robie.sobie.testing.user.SimpleUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ForumTestSuite {
    @Test
    void testCaseUsername() {
        //Given
        SimpleUser user = new SimpleUser("TheForumUser");

        //When
        String result = user.getUsername();
        String expectedResult = "theForumUser";

        //Then
        Assertions.assertEquals(expectedResult, result);
    }
}
