package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ExampleClassTest {
    private ExampleClass ex;
    @BeforeEach
    public void init(){
        this.ex = new ExampleClass();
    }


    @Test
    public void testSumar(){

        //Given - Teniendo
        int a = 4;
        int b = 4;

        //When- Cuando
        int result = ex.sumar(a,b);
        //Then - Entonces
        assertEquals(8,result);
        assertInstanceOf(Integer.class,result);
        assertNotNull(result);
    }

    @Test
    public void testCheckPositivo(){

        //Given - Teniendo
        int number = 0;
        //When - Cuando
        boolean result = ex.checkPositivo(1);
        //Then - Entonces
        assertTrue(result);
        assertInstanceOf(Boolean.class,result);

    }
    @Test
    public void testCheckPositivoError(){
        //Given - Teniendo
        int number = -4;
        //When - Cuando
        //boolean result = ex.checkPositivo(number);
        //Then - Entonces
        assertThrows(IllegalArgumentException.class, ()->{
            ex.checkPositivo(number);
        });
    }
    @Test
    public void testContadorLetrasA(){
        //Given
        String palabra = "palabra";

        //When
        int cantidadLetrasA= ex.contadorLetrasA(palabra);

        //Then
        assertInstanceOf(Integer.class,cantidadLetrasA);
        assertEquals(3,cantidadLetrasA);
        assertNotNull(cantidadLetrasA);
    }
    @Test
    public void testContieneElemento(){
        //Given
        List<String> list = List.of("Maria","Jose","Pedro","Juan");
        String elemento= "Juan";

        //When
        boolean isPresentElement = ex.contieneElemento(list,elemento);

        //Then
        assertTrue(isPresentElement);
    }
    @Test
    public void testRevertirCadena(){
        //Given
        String palabra = "Mira como se voltea un string";

        //When
        String palabraAlrevez = ex.revertirCadena(palabra);

        //Then
        assertEquals("gnirts nu aetlov es omoc ariM",palabraAlrevez);

    }
    @Test
    public void testFactorial(){
        //Given
        int number = 5;
        //When
        long result = ex.factorial(number);

        //then
        assertEquals(120,result);



    }
    @Test
    public void testFactorialError(){
        //Given
        int number = 0;
        //Then
        assertThrows(IllegalArgumentException.class,()->{
            ex.factorial(number);
        });
    }
    @Test
    public void testIsPrime(){
        //Given
        int number = 3;
        //When
        boolean isPrimo = ex.isPrime(number);
        //Then
        assertTrue(isPrimo);
    }@Test
    public void testIsPrimeGreaterThan(){
        //Given
        int number = 17;
        //When
        boolean isPrimo = ex.isPrime(number);
        //Then
        assertTrue(isPrimo);
    }
    @Test
    public void testIsPrimeFalse(){
        //Given
        int number = 8;
        //When
        boolean isNotPrimo = ex.isPrime(number);
        //Then
        assertFalse(isNotPrimo);
    }
    @Test
    public void testIsPrimeLessThanOne(){
        //Given
        int number = -6;
        //When
        boolean lessNumber = ex.isPrime(number);
        //Then

        assertFalse(lessNumber);

    }
    @Test
    public void testRetardedMessage() throws InterruptedException {
        //Given

        //When
        String retardeMessage = ex.retardedMessage();
        //Then
        assertEquals("Enviando mensaje..",retardeMessage);
    }
    @Test
    public void testIntToString(){
        //Given
        List<Integer> intList = List.of(1,2,3,4,5,6,7,8);

        //When
        List<String> listString = ex.intToString(intList);

        //Then

        assertEquals(List.of("1","2","3","4","5","6","7","8"),listString);
    }
    @Test
    public void testCalculateAverageList(){
        //Given
        List<Integer> listInt = List.of(5,5,5);

        // When
        double average = ex.calculateAverageList(listInt);
        //Then
        assertEquals(5,average);
    }

    @Test
    public void testCalculateAverageListErrorEmpty(){
        //Given
        List<Integer> listInt = new ArrayList<>();

        // When
        //Then
        assertThrows(IllegalArgumentException.class, ()->{
            ex.calculateAverageList(listInt);
        });
    }@Test
    public void testCalculateAverageListErrorNull(){
        //Given
        List<Integer> listInt = null;
        // When
        //Then
        assertThrows(IllegalArgumentException.class, ()->{
            ex.calculateAverageList(listInt);
        });
    }
    @Test
    public void testListToString(){
        //Given
        List<String> list = List.of("Pana","amigo","Locote");
        //When
        String palabra = ex.listToString(list);
        //Then
        assertEquals("PANA,AMIGO,LOCOTE",palabra);

    }


}
