import java.util.Scanner;

public class Column {
    public static void main(String[] args) {
        int row, col;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row: ");
        row = sc.nextInt();
        System.out.println("Enter the columnn: ");
        col = sc.nextInt();
        int[][] matrix = new int[row][col];

        //Nhập dữ liệu cho matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = sc.nextInt();
            }
        }

        //Chọn cột để tính tổng
        System.out.println("What column number do you want to calculate?");
        int choice_index = sc.nextInt();
        System.out.println(choice_index);

        //Tính tổng
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][choice_index];
        }
        System.out.println("Sum for column " + (choice_index + 1) + " is " + sum);
    }
}
