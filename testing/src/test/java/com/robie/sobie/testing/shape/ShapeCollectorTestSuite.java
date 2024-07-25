package com.robie.sobie.testing.shape;

import org.junit.jupiter.api.*;

/*
Celem zadania jest przetestowanie klasy, którą musisz napisać, o nazwie – powiedzmy – ShapeCollector, przy następujących założeniach:
    • Klasa ta przechowuje figury geometryczne w kolekcji ArrayList. Figury są następujące: kwadrat, koło, trójkąt (oczywiście użyj angielskich nazw klas).
    • Utwórz interfejs Shape zawierający deklarację metod:
        o metoda zwracająca nazwę figury,
        o metoda zwracająca pole powierzchni tej figury. • Klasy figur implementują interfejs Shape oraz posiadają wszystkie wymagane przez interfejs Shape metody. • Klasa ShapeCollector ma cztery metody:
        o dodającą figurę do kolekcji,
        o usuwającą figurę z kolekcji,
        o pobierającą z kolekcji figurę z pozycji n listy,
        o zwracającą nazwy wszystkich figur w postaci jednego Stringa.
Aby przygotować rozwiązanie zadania:
    1. W katalogu src/main/java utwórz pakiet com.kodilla.testing.shape.
    2. W stworzonym pakiecie utwórz interfejs Shape, zawierający dwie metody: getShapeName() oraz getField().
    3. Utwórz klasy reprezentujące poszczególne figury – posiadające już właściwe implementacje metod interfejsu.
    4. Utwórz klasę ShapeCollector z metodami: o addFigure(Shape shape), o removeFigure(Shape shape), o getFigure(int n) oraz o showFigures().
    5. W katalogu src/test/java utwórz pakiet com.kodilla.testing.shape.
    6. Stwórz w tym pakiecie klasę testową (zbiór testów) ShapeCollectorTestSuite.
    7. Napisz testy sprawdzające metody klasy ShapeCollector. W swoich testach wykorzystaj klasy wewnętrzne i adnotacje @Nested oraz @DisplayName.
Zadanie wykonaj zgodnie z podejściem TDD: najpierw napisz testy (wyślij klasę z testami jako snippet do Mentora poprzez czat przed dalszym wykonywaniem zadania), a dopiero potem uzupełnij implementację metod klasy ShapeCollector.
 */

@DisplayName("TDD: Shape Collector Test Suite")
class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests(){
        System.out.println("Begining of tests");
    }

    @AfterAll
    public static void afterAllTests(){
        System.out.println("End of tests");
    }

    @BeforeEach
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @DisplayName("When a figure is added to the list," +
            "then method getFigure should return the figure")
    @Test
    void testAddFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle1 = new Circle("circle1",3.3);

        //When
        shapeCollector.addFigure(circle1);

        //Then
        Assertions.assertEquals(circle1,shapeCollector.getFigure(0));
    }

    @DisplayName("When a figure had been added to the list has been removed, " +
            "then removeFigure method should return 'true' " +
            "and the figure should not be placed at the \"figures\" list")
    @Test
    void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle1 = new Circle("circle1",3.3);

        //When
        shapeCollector.addFigure(circle1);
        boolean result = shapeCollector.removeFigure(circle1);

        //Then
        Assertions.assertTrue(result);
        Assertions.assertEquals(shapeCollector.getFigure(0),null);
    }

    @DisplayName("When a figure has not been added to the list, " +
            "then removeFigure method should return 'false'")
    @Test
    void testRemoveFigureNotExisting(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle1 = new Circle("circle1",3.3);

        //When
        boolean result = shapeCollector.removeFigure(circle1);

        //Then
        Assertions.assertFalse(result);
    }

    @DisplayName("When \"figures\" list does not contain any figures or requested number of element is inappropriate, " +
            "then method getFigure should return 'null'")
    @Test
    void testGetFigureNotExisting(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        Shape result = shapeCollector.getFigure(0);

        //Then
        Assertions.assertNull(result);
    }

    @DisplayName("When two figures had been added to the list, " +
            "then names of figures should be printed by showFigures method")
    @Test
    void testShowFigures(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle1 = new Circle("circle1",2.4);
        Circle circle2 = new Circle("circle2",2.2);

        //When
        shapeCollector.addFigure(circle1);
        shapeCollector.addFigure(circle2);
        String result = shapeCollector.showFigures();

        //Then
        Assertions.assertEquals(circle1.getShapeName(),result.substring(0,circle1.getShapeName().length()-1));
        Assertions.assertEquals(circle2.getShapeName(),result.substring(circle1.getShapeName().length()+1,result.length()-1));//Assumption that between two shape names there are two chars (comma and space)
    }

    @DisplayName("When a figure has not been added to the list, " +
            "then showFigures method should return 'null'")
    @Test
    void testShowFiguresNotExisting(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        String result = shapeCollector.showFigures();

        //Then
        Assertions.assertNull(result);
    }
}