public class Minesweeper {
    public static void main(String [] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);
//        TODO: 1st. Fill the mines
        int [] mines_locations = new int[m * n];
        int mine_index = 0;
        for (int i = 0; i < k; i++) {
            int new_index = (int) (Math.random() * m * n);
            if (mines_locations[new_index] == 1) {
                i--;
            } else {
              mines_locations[new_index] = 1;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mine_index = n * i + j;
                if (mines_locations[mine_index] == 1) {
                    System.out.print("*  ");
                } else {
                    // TODO: Calculate the number of neighboring mines
                    int neighbors = 0;
                    int rows = n * i;
                    int column = j;
                    if (i == 0) {
                        if (j == 0) {  // Don't check left
                            if (mines_locations[rows + column + 1] == 1) {  //check right
                                neighbors++;
                            }
                            if (mines_locations[n * (i + 1) + column] == 1) {  // check down
                                neighbors++;
                            }
                            if (mines_locations[n * (i + 1) + column + 1] == 1) {  // right-down
                                neighbors++;
                            }
                        } else if (j == n - 1) {  // Don't check right
                            if (mines_locations[rows + column - 1] == 1) {  // check left
                                neighbors++;
                            }
                            if (mines_locations[n * (i + 1) + column] == 1) {  // check down
                                neighbors++;
                            }
                            if (mines_locations[n * (i + 1) + column - 1] == 1) {  // left-down
                                neighbors++;
                            }
                        } else {
                            if (mines_locations[rows + column - 1] == 1) {  // check left
                                neighbors++;
                            }
                            if (mines_locations[n * (i + 1) + column - 1] == 1) {  // left-down
                                neighbors++;
                            }
                            if (mines_locations[n * (i + 1) + column] == 1) {  // check down
                                neighbors++;
                            }
                            if (mines_locations[n * (i + 1) + column + 1] == 1) {  // right-down
                                neighbors++;
                            }
                            if (mines_locations[rows + column + 1] == 1) {  //check right
                                neighbors++;
                            }
                        }
                    }
                    else if (i == m - 1) {
                        if (j == 0) {
                            if (mines_locations[rows + column + 1] == 1) {  //check right
                                neighbors++;
                            }
                            if (mines_locations[n * (i - 1) + column] == 1) {  // check up
                                neighbors++;
                            }
                            if (mines_locations[n * (i - 1) + column + 1] == 1) {  // right-up
                                neighbors++;
                            }
                        } else if (j == n - 1) {
                            if (mines_locations[rows + column - 1] == 1) {  // check left
                                neighbors++;
                            }
                            if (mines_locations[n * (i - 1) + column] == 1) {  // check up
                                neighbors++;
                            }
                            if (mines_locations[n * (i - 1) + column - 1] == 1) {  // left-up
                                neighbors++;
                            }
                        } else {
                            if (mines_locations[rows + column - 1] == 1) {  // check left
                                neighbors++;
                            }
                            if (mines_locations[n * (i - 1) + column - 1] == 1) {  // left-up
                                neighbors++;
                            }
                            if (mines_locations[n * (i - 1) + column] == 1) {  // check up
                                neighbors++;
                            }
                            if (mines_locations[n * (i - 1) + column + 1] == 1) {  // right-up
                                neighbors++;
                            }
                            if (mines_locations[rows + column + 1] == 1) {  //check right
                                neighbors++;
                            }
                        }
                    }

                    else if (j == 0) {
                        // Don't check left
                        if (mines_locations[n * (i - 1) + column] == 1) {  // check up
                            neighbors++;
                        }
                        if (mines_locations[n * (i - 1) + column + 1] == 1) {  // right-up
                            neighbors++;
                        }
                        if (mines_locations[rows + column + 1] == 1) {  //check right
                            neighbors++;
                        }
                        if (mines_locations[n * (i + 1) + column + 1] == 1) {  // right-down
                            neighbors++;
                        }
                        if (mines_locations[n * (i + 1) + column] == 1) {  // check down
                            neighbors++;
                        }
                    }
                    else if (j == n - 1) {
                        // Don't check right
                        if (mines_locations[n * (i + 1) + column] == 1) {  // check down
                            neighbors++;
                        }
                        if (mines_locations[n * (i + 1) + column - 1] == 1) {  // left-down
                            neighbors++;
                        }
                        if (mines_locations[rows + column - 1] == 1) {  // check left
                            neighbors++;
                        }
                        if (mines_locations[n * (i - 1) + column - 1] == 1) {  // left-up
                            neighbors++;
                        }
                        if (mines_locations[n * (i - 1) + column] == 1) {  // check up
                            neighbors++;
                        }
                    } else {
                        if (mines_locations[rows + column - 1] == 1) {  // check left
                            neighbors++;
                        }
                        if (mines_locations[n * (i - 1) + column - 1] == 1) {  // left-up
                            neighbors++;
                        }
                        if (mines_locations[n * (i - 1) + column] == 1) {  // check up
                            neighbors++;
                        }
                        if (mines_locations[n * (i - 1) + column + 1] == 1) {  // right-up
                            neighbors++;
                        }
                        if (mines_locations[rows + column + 1] == 1) {  //check right
                            neighbors++;
                        }
                        if (mines_locations[n * (i + 1) + column + 1] == 1) {  // right-down
                            neighbors++;
                        }
                        if (mines_locations[n * (i + 1) + column] == 1) {  // check down
                            neighbors++;
                        }
                        if (mines_locations[n * (i + 1) + column - 1] == 1) {  // left-down
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
