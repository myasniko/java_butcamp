import java.util.Arrays;

public class RandomNumber {


    public int getMinNumber(int number) {
        int[] sideNumbers = new int[number];

        if (number < 3) {
            throw new IllegalArgumentException("number < 3");
        }

        int[][] myArray = new int[number][number];
        for (int i = 0; i < myArray.length; i++) {

            for (int j = 0; j < myArray[0].length; j++) {
                myArray[i][j] = (int) (Math.random() * 100);
            }
        }

        int maxSide = myArray.length - 1;
        for (int a = maxSide; a >= 0; a--) {
            sideNumbers[a] = myArray[a][maxSide - a];
        }
        return Arrays.stream(sideNumbers).min().getAsInt();
    }
}


