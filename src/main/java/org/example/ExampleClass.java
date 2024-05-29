package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class ExampleClass {

    // 1. Metodo para sumar dos numeros
    public int sumar(int a, int b){
        return a+b;
    }

    // 2. Metodo para lanzar una excepcion si el argumento es negativo
    public boolean checkPositivo(int numero){
        if(numero<0){
            throw new IllegalArgumentException("El numero no puede ser negativo");
        }
        return true;
    }

    //3. Metodo para contar el numero de letras 'a' en una cadena

    public int contadorLetrasA(String cadena){
        return (int) cadena.chars().filter(l -> l == 'a').count();
    }

    //4. Metodo que retorna un valor booleano si la lista contiene un elemento
    public boolean contieneElemento(List<String> list, String elemento){
        return list.contains(elemento);
    }

    // 5. Metodo para revertir cadena
    public String revertirCadena(String cadena){
        return new StringBuilder(cadena).reverse().toString();
    }

    // 6. Metodo que calcular el factorial de un numero (1*2*3*4*5) numero base = 5 result = 120
    public long factorial(int numero){
        if(numero<=0){
            throw new IllegalArgumentException("Factorial no definido para negativos");
        }

        long result= 1;
        for(int i =1; i<=numero;i++){
            result *=i;
            System.out.print(result + (i==numero?"":","));
        }
        return result;
    }

    // 7. Metodo para verificar si un numero es primo
    public boolean isPrime(int numero){
        if(numero<=1){
            return false;
        }

        for(int i =2; i * i <= numero;i++){
            if(numero % i ==0){
                return false;
            }
        }
        return true;
    }

    // 8. Metodo que simula un retraso y retorna un mensaje
    public String retardedMessage() throws InterruptedException{
        Thread.sleep(5000);
        System.out.println("Mensaje enviado.");
        return "Enviando mensaje..";
    }

    // 9. Metodo para convertir una lista de enteros a una lista de String
    public List<String> intToString(List<Integer> intList){

        return intList.stream().map(String::valueOf).toList();
    }

    // 10. Metodo que calcula la media de una lista de enteros
    public double calculateAverageList(List<Integer> list){
        if(list == null ||list.isEmpty()){
            throw new IllegalArgumentException("List can't be empty or null");
        }
        System.out.println(list.stream().mapToInt(Integer::valueOf).average());


        return list.stream().mapToInt(Integer::valueOf).average().orElse(0.0);
    }

    // 11. Metodo para convertir una lista a un sting
    public String listToString(List<String> list){
        return list.stream().map(String::toUpperCase).collect(Collectors.joining(","));
    }
}
