package ru.gretchen.quadraticequationsolving.exception;

public class EquationHasNoRootsException extends RuntimeException{
    public EquationHasNoRootsException(String formula, double D) {
        super("Уравнение " + formula + " с дискриминантом = " + D + " не имеет действительных корней");
    }
}
