package week03;

public class Minesweeper {
    public static void main(String [] args) {
        int mRows = Integer.parseInt(args[0]);
        int nColumns = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);
        // 1st. Fill the mines
        int [] minesLocations = new int[mRows * nColumns];
        int mineIndex;
        for (int p = 0; p < k; p++) {
            int newIndex = (int) (Math.random() * mRows * nColumns);
            if (minesLocations[newIndex] == 1) {
                p--;
            } else {
              minesLocations[newIndex] = 1;
            }
        }

        for (int i = 0; i < mRows; i++) {
            for (int j = 0; j < nColumns; j++) {
                mineIndex = nColumns * i + j;
                if (minesLocations[mineIndex] == 1) {
                    System.out.print("*  ");
                } else {
                    // Calculate the number of neighboring mines
                    int neighbors = 0;
                    int rows = nColumns * i;

                    if (j - 1 >= 0)
                    if (minesLocations[rows + j - 1] == 1) {  // check left
                        neighbors++;
                    }

                    if (j - 1 >= 0 && i - 1 >= 0)
                    if (minesLocations[nColumns * (i - 1) + j - 1] == 1) {  // left-up
                        neighbors++;
                    }

                    if (i - 1 >= 0)
                    if (minesLocations[nColumns * (i - 1) + j] == 1) {  // check up
                        neighbors++;
                    }

                    if (i - 1 >= 0 && j + 1 < nColumns)
                    if (minesLocations[nColumns * (i - 1) + j + 1] == 1) {  // right-up
                        neighbors++;
                    }

                    if (j + 1 < nColumns)
                    if (minesLocations[rows + j + 1] == 1) {  // check right
                        neighbors++;
                    }

                    if (j + 1 < nColumns && i + 1 < mRows)
                    if (minesLocations[nColumns * (i + 1) + j + 1] == 1) {  // right-down
                        neighbors++;
                    }

                    if (i + 1 < mRows)
                    if (minesLocations[nColumns * (i + 1) + j] == 1) {  // check down
                        neighbors++;
                    }

                    if (i + 1 < mRows && j - 1 >= 0)
                    if (minesLocations[nColumns * (i + 1) + j - 1] == 1) {  // left-down
                        neighbors++;
                    }
                    System.out.print(neighbors + "  ");
                }

            }
            System.out.println();
        }
    }

}
