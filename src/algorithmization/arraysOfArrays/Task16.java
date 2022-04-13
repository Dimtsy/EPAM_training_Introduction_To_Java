package algorithmization.arraysOfArrays;

import algorithmization.PrintTwoDimensionalArray;

import java.util.Arrays;

public class Task16 {
    public static void task16() {
        System.out.println("16. Построить магический квадрат.");
        int n=7;
        System.out.println("n = "+n);
        int[][]a;
        a=magicSquare(n);
        PrintTwoDimensionalArray.printInt(a);



    }
        public static int [][] magicSquare(int n) {
            if (n % 2 !=0){
                return magicSquareOfOddOrder(n);
            }              // метод для n нечетной размерности (3, 7, 9, и тд)
            else if (n % 4 != 0) {
                return magicSquareOfEvenOddOrder(n);
            // метод для n четно-нечетной размерности (n кратно 2 но не кратно 4)
            }
            return evenMatrixSquare(n);                        // метод для n четн-четной размерности (n кратно и 2 и 4);
        }
        private static int[][] magicSquareOfOddOrder(int n) {
            // "Сиамский метод" - один из самых просты для восприятия
            // https://ru.xcv.wiki/wiki/Siamese_method
            int[][] matrix = new int[n][n];
            for (int i = 0; i < n; i++) {
                Arrays.fill(matrix[i], 0);
            }
            int count = 1, y = 0, x = matrix.length/2;
            while (true){
                matrix[y][x] = count;

                count++;
                if (((y == 0) && (x >= n-1)) && (matrix[n-1][0] != 0)){
                    y++;
                }
                else {
                    y--;
                    if (y < 0) {
                        y = n - 1;
                    }
                    x++;
                    if (x == n) {
                        x = 0;
                    }
                    if(matrix[y][x]!=0){
                        y+=2;
                        x--;
                    }
                }

                if(count==n*n+1) break;
            }
            return matrix;
        }
        private static int[][] magicSquareOfEvenOddOrder(int n) {
            // Метод "анонима"
            // Вот ссылка на подробное описание метода http://www.klassikpoez.narod.ru/mojmetod.htm
            int half = n/2;

            int[][] matrix = new int[n][n];
            int[][] tempMatrix;
            tempMatrix = magicSquareOfOddOrder(half);

            // 1/4 матрицы
            for (int i = 0; i < half; i++) {
                for (int j = 0; j < half; j++) {
                    matrix[i][j] = tempMatrix[i][j];
                }
            }
            // 2/4 матрицы
            for (int i = 0; i < half; i++) {
                for (int j = half; j < n; j++) {
                    int x = j-half;
                    matrix[i][j] = (tempMatrix[i][x]+2*half*half);
                }
            }
            // 3/4 матрицы
            for (int i = half; i < n; i++) {
                for (int j = 0; j < half; j++) {
                    int x = i-half;

                    matrix[i][j] = (tempMatrix[x][j]+3*half*half);
                }
            }
            // 4/4 матрицы
            for (int i = half; i < n; i++) {
                for (int j = half; j < n; j++) {
                    int x = i-half, y = j-half;
                    matrix[i][j] = (tempMatrix[x][y]+half*half);
                }
            }
            int move = 0;
            for (int i = 6; i < n; i++) {
                if((i%4!=0)&&(i%2==0)) move++;
            }
            for (int j = matrix.length/2-move; j <= matrix.length/2+move-1; j++) {
                for (int i = 0; i < tempMatrix.length; i++) {

                    int key = matrix[i][j];
                    matrix[i][j] = matrix[half+i][j];
                    matrix[half+i][j] = key;
                }
            }
            for (int j = 0; j <= 1; j++) {
                if (j == 0) {
                    int key = matrix[0][0];
                    matrix[0][0] = matrix[half][0];
                    matrix[half][0] = key;
                }
                if (j == 1) {
                    int key = matrix[half - 1][0];
                    matrix[half - 1][0] = matrix[n - 1][0];
                    matrix[n - 1][0] = key;
                }
            }
            for (int j = half+1; j < n-1; j++) {
                for (int i = 1; i < half-1; i++) {
                    int key = matrix[i][1];
                    matrix[i][1] = matrix[half+i][1];
                    matrix[half+i][1] = key;
                }
            }
            return matrix;
        }
    private static int[][] evenMatrixSquare(int n){
        // Метод Раус-Болла хорошое описание нашел тут:
        // https://rep.bntu.by/bitstream/handle/data/62327/Magicheskie_kvadraty.pdf?sequence=1&isAllowed=y
        // Страница 8, 9
        int[][] matrix = new int[n][n];
        int[][] tempMatrix = new int[n][n];
        int sh=1;
        for (int i =0;i< n;i++){
            for (int j =0;j< n;j++){
                matrix[i][j]=sh;
                sh++;
            }
        }

        sh=n*n;
        for (int i =0;i< n;i++){
            for (int j =0;j< n;j++){
                tempMatrix[i][j]=sh;
                sh--;
            }
        }


        int size = 4;    // Размерность каждого квадрата (4х4 тафтология)
        // можно заменить простой цифрой
        int x = 0;       // x, y - движение по кадратам (посмотрите как изменяются в ходе программы)
        int y = 0;
        for (int i = 0; i < (n*n/16); i++) {                // Смотрим сколько квадратов 4х4 помещается в матрице nxn
            if (x == (int)Math.sqrt(n*n/16)) {              // x, y переменные для движения по квадратам 4х4
                // х проходит по первому ряду квадратов, достигая последнего
                // обнуляется, а y увеличивается
                x = 0;
                y++;
            }
            // x и y должны лишь обеспечивать проход по квадратам
            for (int j = 0; j < 4; j++) {
                matrix[size*y+j][size*x+j] = tempMatrix[size*y+j][size*x+j];  // главная диагональ квадратов 4х4
                matrix[size*y+j][size*x+size-1-j] = tempMatrix[size*y+j][size*x+size-1-j]; // побочная диагональ
            }
            x++;
        }
        return matrix;
    }


}
