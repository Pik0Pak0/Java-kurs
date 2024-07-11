package com.robie.sobie.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Condition;

import com.robie.sobie.testing.collection.OddNumbersExterminator;

@DisplayName("Odd Numbers Exterminator Test Suite")
public class CollectionTestSuite {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test suite: end");
    }

    @BeforeEach
    public void before() {
        System.out.println("Test case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test case: end");
    }

    @DisplayName("When given list is empty, " +
            "then method should return empty list")
    @Test
            void testOddNumbersExterminatorEmptyList(){
        //Given
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        //When
        list2.addAll(OddNumbersExterminator.exterminate(list));

        //Then
        Assertions.assertTrue(list2.isEmpty());
    }

    @DisplayName("When given list contains odd and even numbers," +
            "then method should return only even numbers")
    @Test
           void testOddNumbersExterminatorNormalList(){
        //Given
        Integer[] numbers = {1,2,3,4};
        List<Integer> list = Arrays.asList(numbers);

       /* List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);*/

        List<Integer> list2 = new ArrayList<>();

        //When
        list2.addAll(OddNumbersExterminator.exterminate(list));

        //Then
        boolean evenList = true;
        for(Integer i : list2){
            if(i%2==1){
                evenList = false;
                break;
            }
        }
        Assertions.assertTrue(evenList);
    }
}