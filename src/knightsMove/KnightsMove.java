package knightsMove;

import java.util.Arrays;

/**
 * Created by Iliren on 26.07.2016.
 */
public class KnightsMove {
    public static void main(String[] args) {
        int[][] pole = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
        int[][] board = new int[7][7];

//        printPole(pole);
        System.out.println(board[0].length);
        knigthsMove(board, 0, 0, 1);


//        printPole(board);

    }


    public static void knigthsMove(int[][] pole, int idxI, int idxJ, int step) {
//        System.out.println(step);
        System.out.println(idxI+" "+idxJ);
        if (step == pole.length*pole[0].length) {
            pole[idxI][idxJ] = step;
            printPole(pole);
            System.exit(0);
            return;
        }
        pole[idxI][idxJ] = step;
        step += 1;
        if ((idxI + 2) < pole.length && (idxJ + 1) < pole[idxI].length && pole[idxI + 2][idxJ + 1] == 0) {
            knigthsMove(pole, idxI + 2, idxJ + 1, step);

        }
        if ((idxI + 2) < pole.length &&  idxJ - 1 >= 0 && pole[idxI + 2][idxJ - 1] == 0) {
            knigthsMove(pole, idxI + 2, idxJ - 1, step);
        }
        if ( idxI - 2 >= 0 && (idxJ + 1) < pole[idxI].length && pole[idxI - 2][idxJ + 1] == 0) {
            knigthsMove(pole, idxI - 2, idxJ + 1, step);
        }
        if ( idxI - 2 >= 0 &&  idxJ - 1 >= 0 && pole[idxI - 2][idxJ - 1] == 0) {
            knigthsMove(pole, idxI - 2, idxJ - 1, step);
        }
        if ((idxI + 1) < pole.length && (idxJ + 2) < pole[idxI].length && pole[idxI + 1][idxJ + 2] == 0) {
            knigthsMove(pole, idxI + 1, idxJ + 2, step);
        }
        if (idxI - 1 >= 0 && (idxJ + 2) < pole[idxI].length && pole[idxI - 1][idxJ + 2] == 0) {
            knigthsMove(pole, idxI - 1, idxJ + 2, step);
        }
        if ((idxI + 1) < pole.length && idxJ - 2 >= 0 && pole[idxI + 1][idxJ - 2] == 0) {
            knigthsMove(pole, idxI + 1, idxJ - 2, step);
        }
        if ( idxI - 1 >= 0 && (idxJ - 2) < pole[idxI].length && idxJ - 2 >= 0 && pole[idxI - 1][idxJ - 2] == 0) {
            knigthsMove(pole, idxI - 1, idxJ - 2, step);
        }
            pole[idxI][idxJ] = 0;
            return;




//        pole[idxI][idxJ] = step;

    }


    public static void printPole(int[][] pole) {
        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole[i].length; j++) {
                System.out.print(pole[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
