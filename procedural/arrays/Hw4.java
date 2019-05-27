package hw_procedural.hw3_arrays;


import java.util.Arrays;

class Linearize {

    int[] one_dimensional(int[][] Two_dimensional) {
        int lng = (Two_dimensional[0].length + Two_dimensional[1].length);
        int[] onedimensional = new int[lng];
        int currentPosition = 0;

        for (int i = 0; i < Two_dimensional[0].length; i++) {
            onedimensional[currentPosition] = Two_dimensional[0][i];
            currentPosition++;
        }

        for (int j = 0; j < Two_dimensional[1].length; j++) {
            onedimensional[currentPosition] = Two_dimensional[1][j];
            currentPosition++;

        }
        System.out.println(onedimensional);
        String result = Arrays.toString(onedimensional);

        System.out.println(result);

        return onedimensional;

    }
}
    public class Hw4 {
        public static void main(String[] args) {
            int[][] Two_dimensional = {{14, 88,4456,456,546,45,23,5,345,22},
                    {13, 37,228,9,76,4,667}};
            Linearize result = new Linearize();
            result.one_dimensional(Two_dimensional);







        }

    }

