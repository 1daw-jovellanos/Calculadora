/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author victor.fernandez
 */
public class Calculadora {

    private double result;
    private double memory;

    public Calculadora() {
        result = 0;
        memory = 0;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void plus(double d) {
        result += d;
    }

    public void minus(double d) {
        result -= d;
    }

    public void multiply(double d) {
        result *= d;
    }

    public void divide(double d) {
        result /= d;
    }

    public void squareRoot() {
        result = Math.sqrt(result);
    }

    public void changeSign() {
        result = -result;
    }

    public void clear() {
        result = 0;
    }

    public void plusMemory() {
        memory += result;
    }

    public void minusMemory() {
        memory -= result;
    }

    public void clearMemory() {
        memory = 0;
    }

    public double getMemory() {
        return memory;
    }

}
