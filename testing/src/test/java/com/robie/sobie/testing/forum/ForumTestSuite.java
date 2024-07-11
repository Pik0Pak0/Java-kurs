package com.robie.sobie.testing.forum;

import com.robie.sobie.testing.user.SimpleUser;
import org.junit.jupiter.api.*;

@DisplayName("Forum Test Suite")
public class ForumTestSuite {

    @BeforeEach
    public void before(){
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after(){
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("Test Suite: end");
    }

    @DisplayName("When created SimpleUser with realName, "+
    "then getRealName should return real user name")
    @Test
    void testCaseRealName() {
        //Given
        SimpleUser user = new SimpleUser("TheForumUser","John Smith");

        //When
        String result = user.getRealName();
        System.out.println("Testing " + result);

        //Then
        Assertions.assertEquals("John Smith",result);
    }

    @DisplayName("When created SimpleUser with name, " +
    "then getUsername should return correct name")
    @Test
    void testCaseUsername() {
        //Given
        SimpleUser user = new SimpleUser("TheForumUser");

        //When
        String result = user.getUsername();
        String expectedResult = "TheForumUser";

        //Then
        Assertions.assertEquals(expectedResult, result);
    }
}
