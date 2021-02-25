import java.util.Scanner;


public class ticTacToe {

    public static final int SIZE = 3;
    public static char[][] map;
    public static final char X = 'X';
    public static final char O = 'O';
    public static final char DELIMITER  = '|';
    public static final char DEFAULT = '_';
    public static int turn = 0;
    public static Scanner in = new Scanner(System.in);


    public static void printMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(DELIMITER + "" + map[i][j]);
            }
            System.out.print(DELIMITER);
            System.out.println();
        }
    }

    public static void fillMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DEFAULT;
            }
        }
    }


    public static boolean isValid(int x, int y) {
        return  x >= 0 && y >= 0 && x < SIZE && y < SIZE && map[x][y] != X && map[x][y] != O;
    }


    public static boolean win(int x, int y, char constant) {
        boolean winner = true;

        //checking main diagonal
        if(x == y) {
            if(map[0][0] == map[1][1] && map[0][0] == map[2][2] && map[0][0] == constant) {
                return winner;
            }
        }

        //checking side diagonal
        if((x + y) == SIZE - 1) {
            if(map[0][2] == map[1][1] && map[2][0] == map[1][1] && map[0][2] == constant) {
                return winner;
            }
        }


        //checking rows & cols
        for (int i = 0; i < SIZE; i++) {
            if (map[i][y] != constant) {
                winner = false;
                break;
            }
        }

         if(winner) {
             return winner;
         }

        winner = true;


        for (int j = 0; j < SIZE; j++) {
            if (map[x][j] != constant) {
                winner = false;
                break;
            }
        }

        if(winner) {
            return winner;
        }



        return winner;
    }



    public static boolean aiTurn(int x, int y) {
        turn++;
        boolean flag = true;
        while (true) {
            if (map[1][1] != X && map[1][1] != O) {
                map[1][1] = O;
                if (win(1, 1, O)) {
                    printMap();
                    System.out.println("pc won");
                    return true;
                } else {
                    return false;
                }
            } else {
                for (int i = 0; i < SIZE; i++) {
                    flag = true;
                    for (int j = 0; j < SIZE; j++) {
                        if (map[i][j] == X) {
                            flag = false;
                            break;
                        }

                    }
                    if (flag) {
                        for (int k = 0; k < SIZE; k++) {
                            if (isValid(i, k)) {
                                map[i][k] = O;
                                if (win(i, k, O)) {
                                    printMap();
                                    System.out.println("pc won");
                                    return true;
                                } else {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }
    }




        public static void game() {
        fillMap();
        while (true) {
            System.out.println("Turn " + (turn + 1));
            printMap();

            int x = in.nextInt(), y = in.nextInt();
            turn++;
            --x;
            --y;
            if (isValid(x, y)) {
                map[x][y] = X;
                if (win(x, y, X)) {
                    printMap();
                    System.out.println("player won");
                    return;
                }
                if(aiTurn(x, y)) {
                    return;
                }
                } else if (turn == SIZE * SIZE) {
                    System.out.println("DRAW");
                } else {
                    System.out.println("your input is wrong, please enter something else");
                }
            }
        }




    public static void main(String[] args) {
        game();


    }
}
