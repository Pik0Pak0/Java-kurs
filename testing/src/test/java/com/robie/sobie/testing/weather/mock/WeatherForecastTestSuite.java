package com.robie.sobie.testing.weather.mock;

import com.robie.sobie.testing.weather.stub.Temperatures;
import com.robie.sobie.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)

public class WeatherForecastTestSuite {

    @Mock
    private Temperatures temperaturesMock;

    private static int testCounter;
    Map<String, Double> temperaturesMap;
    WeatherForecast weatherForecast;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);

        temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        weatherForecast = new WeatherForecast(temperaturesMock);
    }

    @Test
    void testCalculateForecastWithMock() {
        //Given
        //BeforeEach

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testAverageTemperature(){
        //Given
        //BeforeEach

        //When
        double avg = weatherForecast.averageTempeture();

        //Then
        Assertions.assertEquals(avg,25.56);
    }

    @Test
    void testMedianTemperatureOddSize(){
        //Given
        //BeforeEach

        //When
        double median = weatherForecast.medianTemperature();

        //Then
        Assertions.assertEquals(median,25.5);
    }

    @Test
    void testMedianTemperatureEvenSize(){
        //Given
        //BeforeEach
        temperaturesMap.put("Lodz", 28.5);

        //When
        double median = weatherForecast.medianTemperature();

        //Then
        Assertions.assertEquals(median,25.8);
    }
}