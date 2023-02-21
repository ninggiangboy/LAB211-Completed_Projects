package Calculator.model;

import Calculator.view.Inputted;

/**
 *
 * @author duykhanh
 */
public class Matrix {
    private final int rows, cols;
    private final double[][] matrix;

    public Matrix(double[][] matrix) {
        this.matrix = matrix;
        this.rows = matrix.length;
        this.cols = matrix[0].length;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public double[][] getMatrix() {
        return matrix;
    }

    public Matrix add(Matrix other) {
        if (this.rows != other.getRows() || this.cols != other.getCols()) {
            System.out.println("Matrices are different sizes. Cannot be added.");
            return null;
        }
        double[][] result = new double[rows][cols];
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                result[i][j] = this.matrix[i][j] + other.getMatrix()[i][j];
            }
        }
        return new Matrix(result);
    }

    public Matrix subtract(Matrix other) {
        if (this.rows != other.getRows() || this.cols != other.getCols()) {
            System.out.println("Matrices are different sizes. Cannot be subtracted.");
            return null;
        }
        double[][] result = new double[rows][cols];
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                result[i][j] = this.matrix[i][j] - other.getMatrix()[i][j];
            }
        }
        return new Matrix(result);
    }

    public Matrix multiply(Matrix other) {
        if (this.cols != other.getRows()) {
            System.out.println("Number of columns of matrix 1 must be equal to number of rows of matrix 2.");
            return null;
        }
        double[][] result = new double[this.rows][other.getCols()];
        double sum;
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.getCols(); j++) {
                sum = 0;
                for (int k = 0; k < this.cols; k++) {
                    sum += this.matrix[i][k] * other.getMatrix()[k][j];
                }
                result[i][j] = sum;
            }
        }
        return new Matrix(result);
    }

    public void print() {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                System.out.print("[" + this.matrix[i][j] + "]");
            }
            System.out.println();
        }
    }

    public void inputElements() {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                this.matrix[i][j] = Inputted.inputDouble("Enter [" + (i + 1) + "][" + (j + 1) + "]: ",
                        Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
            }
        }
    }
}
