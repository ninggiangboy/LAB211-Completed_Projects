package Calculator.controller;

import Calculator.view.Inputted;
import Calculator.model.Matrix;

/**
 *
 * @author duykhanh
 */
public class Manager {
    public static void additionMatrixes() {
        System.out.println("----------Addition----------");
        System.out.println("Matrix 1");
        int rows = Inputted.inputInt("Enter Row Matrix: ", 1, Integer.MAX_VALUE);
        int cols = Inputted.inputInt("Enter Col Matrix: ", 1, Integer.MAX_VALUE);
        Matrix matrix1 = new Matrix(new double[rows][cols]);
        matrix1.inputElements();
        System.out.println("Matrix2 (auto set the same size as Matrix1)");
        Matrix matrix2 = new Matrix(new double[rows][cols]);
        matrix2.inputElements();
        calMatrix(matrix1, matrix2, '+');
    }

    public static void subtractionMatrixes() {
        System.out.println("----------Subtraction----------");
        System.out.println("Matrix 1");
        int rows = Inputted.inputInt("Enter Row Matrix1: ", 1, Integer.MAX_VALUE);
        int cols = Inputted.inputInt("Enter Col Matrix1: ", 1, Integer.MAX_VALUE);
        Matrix matrix1 = new Matrix(new double[rows][cols]);
        matrix1.inputElements();
        System.out.println("Matrix2 (auto set the same size as Matrix1)");
        Matrix matrix2 = new Matrix(new double[rows][cols]);
        matrix2.inputElements();
        calMatrix(matrix1, matrix2, '-');
    }

    public static void multiplicationMatrixes() {
        System.out.println("----------Multiplication----------");
        System.out.println("Matrix 1");
        int rows = Inputted.inputInt("Enter Row Matrix1: ", 1, Integer.MAX_VALUE);
        int cols = Inputted.inputInt("Enter Col Matrix1: ", 1, Integer.MAX_VALUE);
        Matrix matrix1 = new Matrix(new double[rows][cols]);
        matrix1.inputElements();
        System.out.println("Matrix2 (auto set the Row size as Col Matrix1)");
        rows = cols;
        cols = Inputted.inputInt("Enter Col Matrix1: ", 1, Integer.MAX_VALUE);
        Matrix matrix2 = new Matrix(new double[rows][cols]);
        matrix2.inputElements();
        calMatrix(matrix1, matrix2, '*');
    }

    private static void calMatrix(Matrix matrix1, Matrix matrix2, char operator) {
        System.out.println("----------Result----------");
        Matrix matrixResult;
        switch (operator) {
            case '+':
                matrixResult = matrix1.add(matrix2);
                break;
            case '-':
                matrixResult = matrix1.subtract(matrix2);
                break;
            case '*':
                matrixResult = matrix1.multiply(matrix2);
                break;
            default:
                throw new AssertionError();
        }
        if (matrixResult == null)
            return;
        matrix1.print();
        System.out.println(operator);
        matrix2.print();
        System.out.println("=");
        matrixResult.print();
    }

}
