package br.com.andre.service;

public class MathService {

    public Double somar(Double numberOne, Double numberTwo) {
        return (numberOne + numberTwo);
    }

    public Double subtrair(Double numberOne, Double numberTwo) {
        return (numberOne - numberTwo);
    }

    public Double multiplicar(Double numberOne, Double numberTwo) {
        return (numberOne * numberTwo);
    }

    public Double dividir(Double numberOne, Double numberTwo) {
        return (numberOne / numberTwo);
    }

    public Double media(Double numberOne, Double numberTwo) {
        return (numberOne + numberTwo) / 2;
    }

    public Double raiz(Double number) {
        return Math.sqrt(number);
    }

}
