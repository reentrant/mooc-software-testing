public class Minesweeper {
    public static void main(String [] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);
        // 1st. Fill the mines
        int [] minesLocations = new int[m * n];
        int mineIndex;
        for (int p = 0; p < k; p++) {
            int newIndex = (int) (Math.random() * m * n);
            if (minesLocations[newIndex] == 1) {
                p--;
            } else {
              minesLocations[newIndex] = 1;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mineIndex = n * i + j;
                if (minesLocations[mineIndex] == 1) {
                    System.out.print("*  ");
                } else {
                    // Calculate the number of neighboring mines
                    int neighbors = 0;
                    int rows = n * i;
                    int column = j;
                    if (i == 0) {
                        if (j == 0) {  // Don't check left
                            if (minesLocations[rows + column + 1] == 1) {  // check right
                                neighbors++;
                            }
                            if (minesLocations[n * (i + 1) + column] == 1) {  // check down
                                neighbors++;
                            }
                            if (minesLocations[n * (i + 1) + column + 1] == 1) {  // right-down
                                neighbors++;
                            }
                        } else if (j == n - 1) {  // Don't check right
                            if (minesLocations[rows + column - 1] == 1) {  // check left
                                neighbors++;
                            }
                            if (minesLocations[n * (i + 1) + column] == 1) {  // check down
                                neighbors++;
                            }
                            if (minesLocations[n * (i + 1) + column - 1] == 1) {  // left-down
                                neighbors++;
                            }
                        } else {
                            if (minesLocations[rows + column - 1] == 1) {  // check left
                                neighbors++;
                            }
                            if (minesLocations[n * (i + 1) + column - 1] == 1) {  // left-down
                                neighbors++;
                            }
                            if (minesLocations[n * (i + 1) + column] == 1) {  // check down
                                neighbors++;
                            }
                            if (minesLocations[n * (i + 1) + column + 1] == 1) {  // right-down
                                neighbors++;
                            }
                            if (minesLocations[rows + column + 1] == 1) {  // check right
                                neighbors++;
                            }
                        }
                    }
                    else if (i == m - 1) {
                        if (j == 0) {
                            if (minesLocations[rows + column + 1] == 1) {  // check right
                                neighbors++;
                            }
                            if (minesLocations[n * (i - 1) + column] == 1) {  // check up
                                neighbors++;
                            }
                            if (minesLocations[n * (i - 1) + column + 1] == 1) {  // right-up
                                neighbors++;
                            }
                        } else if (j == n - 1) {
                            if (minesLocations[rows + column - 1] == 1) {  // check left
                                neighbors++;
                            }
                            if (minesLocations[n * (i - 1) + column] == 1) {  // check up
                                neighbors++;
                            }
                            if (minesLocations[n * (i - 1) + column - 1] == 1) {  // left-up
                                neighbors++;
                            }
                        } else {
                            if (minesLocations[rows + column - 1] == 1) {  // check left
                                neighbors++;
                            }
                            if (minesLocations[n * (i - 1) + column - 1] == 1) {  // left-up
                                neighbors++;
                            }
                            if (minesLocations[n * (i - 1) + column] == 1) {  // check up
                                neighbors++;
                            }
                            if (minesLocations[n * (i - 1) + column + 1] == 1) {  // right-up
                                neighbors++;
                            }
                            if (minesLocations[rows + column + 1] == 1) {  // check right
                                neighbors++;
                            }
                        }
                    }

                    else if (j == 0) {
                        // Don't check left
                        if (minesLocations[n * (i - 1) + column] == 1) {  // check up
                            neighbors++;
                        }
                        if (minesLocations[n * (i - 1) + column + 1] == 1) {  // right-up
                            neighbors++;
                        }
                        if (minesLocations[rows + column + 1] == 1) {  // check right
                            neighbors++;
                        }
                        if (minesLocations[n * (i + 1) + column + 1] == 1) {  // right-down
                            neighbors++;
                        }
                        if (minesLocations[n * (i + 1) + column] == 1) {  // check down
                            neighbors++;
                        }
                    }
                    else if (j == n - 1) {
                        // Don't check right
                        if (minesLocations[n * (i + 1) + column] == 1) {  // check down
                            neighbors++;
                        }
                        if (minesLocations[n * (i + 1) + column - 1] == 1) {  // left-down
                            neighbors++;
                        }
                        if (minesLocations[rows + column - 1] == 1) {  // check left
                            neighbors++;
                        }
                        if (minesLocations[n * (i - 1) + column - 1] == 1) {  // left-up
                            neighbors++;
                        }
                        if (minesLocations[n * (i - 1) + column] == 1) {  // check up
                            neighbors++;
                        }
                    } else {
                        if (minesLocations[rows + column - 1] == 1) {  // check left
                            neighbors++;
                        }
                        if (minesLocations[n * (i - 1) + column - 1] == 1) {  // left-up
                            neighbors++;
                        }
                        if (minesLocations[n * (i - 1) + column] == 1) {  // check up
                            neighbors++;
                        }
                        if (minesLocations[n * (i - 1) + column + 1] == 1) {  // right-up
                            neighbors++;
                        }
                        if (minesLocations[rows + column + 1] == 1) {  // check right
                            neighbors++;
                        }
                        if (minesLocations[n * (i + 1) + column + 1] == 1) {  // right-down
                            neighbors++;
                        }
                        if (minesLocations[n * (i + 1) + column] == 1) {  // check down
                            neighbors++;
                        }
                        if (minesLocations[n * (i + 1) + column - 1] == 1) {  // left-down
                            neighbors++;
                        }
                    }
                    System.out.print(neighbors + "  ");
                }

            }
            System.out.println();
        }
    }

}
