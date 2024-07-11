//Zadanie: test klasy wybierającej parzyste liczby z kolekcji
//Celem zadania jest przetestowanie klasy, która udostępnia metodę przyjmującą jako argument listę obiektów typu Integer i zwracającą nową listę obiektów tego samego typu. Obiekty te mają stanowić podzbiór danych wejściowych z pominięciem liczb nieparzystych.
//W utworzonym pakiecie stwórz klasę testową (zbiór testów) CollectionTestSuite, a w niej napisz testy sprawdzające, czy metoda filtrująca liczby nieparzyste działa poprawnie:
// o testOddNumbersExterminatorEmptyList – sprawdzający, czy klasa zachowuje się poprawnie, gdy lista jest pusta,
// o testOddNumbersExterminatorNormalList – sprawdzający, czy klasa zachowuje się poprawnie, gdy lista zawiera liczby parzyste i nieparzyste.
//Zadanie dodatkowe (nieobowiązkowe): spróbuj wykorzystać metodę Arrays.asList() do utworzenia listy zawierającej numery w teście. Poszukaj w dokumentacji języka Java, jak używać tej metody, oraz sprawdź, jakie inne metody znajdują się w klasie Arrays.

package com.robie.sobie.testing.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class OddNumbersExterminator {

    public static List<Integer> exterminate(List<Integer> numbers){
            List<Integer> evenNumbers = new ArrayList<>();
            for(Integer i : numbers)
            {
                if(i%2==0) evenNumbers.add(i);
            }
        return evenNumbers;
    }
}