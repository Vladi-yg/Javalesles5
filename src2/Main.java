import java.util.Random;
import java.util.Scanner;

public class Main {

    // \u007C vertical line
    // \u005F underscore character
    // \u00AF macron character
    // \u00A4 currency sign
    // \u00D8 ) letter with stroke
    // \u00B7 Middle dot

    /**
     * 1. Initialize field 3x7
     * 2. Specify players' sign
     * 3. Keyboard handling (hometask achievment)
     * 4. Move handling
     * 5. Chek win
     * 6. Move handling (coordinates)
     * 7. Put values on fiel
     */
    public static void main(String[] args) {

      init();


    }
    static void init () {
        char signs [] = signOption();
        char humanSign = signs[0];
        char computerSign = signs[1];


        char [] [] gameField = gameFieldparts();
        getGameField(gameField);

        String currentPlayer = "Human";
        char currentPlayerSign = humanSign;
        boolean isWin;

        do {
            int[] coordinates = move(currentPlayer);

            boolean isPlotted;
            do {
                isPlotted = putValueOnField(gameField, coordinates, currentPlayerSign);
                if (!isPlotted) {
                    coordinates = move(currentPlayer);
                    isPlotted = putValueOnField(gameField, coordinates, currentPlayerSign);

                }
            } while (!isPlotted);

            clearFiled();
            getGameField(gameField);

            isWin = checkWin(gameField);
            if (!isWin) {
                currentPlayer = switchPlayer(currentPlayer);
                currentPlayerSign = switchPlayerSign(currentPlayerSign);
            }
        } while (!isWin);
        if (isWin) {
            System.out.println(String.format("Congrats Mr. %s!!! You are winner", currentPlayer));
        }
    }


    static boolean checkWin(char[][] gameField) {
        // Horizontal
        if (gameField[0][1] != '\u00B7' && gameField[0][3] != '\u00B7' && gameField[0][5] != '\u00B7' && gameField[0][7] != '\u00B7' && gameField[0][9] != '\u00B7') {
            if (gameField[0][1] == gameField[0][3] && gameField[0][3] == gameField[0][5] && gameField[0][5] == gameField[0][7] && gameField[0][7] == gameField[0][9]) {
                return true;
            }
        } else if (gameField[1][1] != '\u00B7' && gameField[1][3] != '\u00B7' && gameField[1][5] != '\u00B7' && gameField[1][7] != '\u00B7' && gameField[1][9] != '\u00B7') {
            if (gameField[1][1] == gameField[1][3] && gameField[1][3] == gameField[1][5] && gameField[1][5] == gameField[1][7] && gameField[1][7] == gameField[1][9]) {
                return true;
            }
        } else if (gameField[2][1] != '\u00B7' && gameField[2][3] != '\u00B7' && gameField[2][5] != '\u00B7' && gameField[2][7] != '\u00B7' && gameField[2][9] != '\u00B7') {
            if (gameField[2][1] == gameField[2][3] && gameField[2][3] == gameField[2][5] && gameField[2][5] == gameField[2][7] && gameField[2][7] == gameField[2][9]) {
                return true;
            }
        }else if (gameField[3][1] != '\u00B7' && gameField[3][3] != '\u00B7' && gameField[3][5] != '\u00B7' && gameField[3][7] != '\u00B7' && gameField[3][9] != '\u00B7') {
                if (gameField[3][1] == gameField[3][3] && gameField[3][3] == gameField[3][5] && gameField[3][5] == gameField[3][7] && gameField[3][7] == gameField[3][9]) {
                    return true;
                }
        }else if (gameField[4][1] != '\u00B7' && gameField[4][3] != '\u00B7' && gameField[4][5] != '\u00B7' && gameField[4][7] != '\u00B7' && gameField[4][9] != '\u00B7') {
                    if (gameField[4][1] == gameField[4][3] && gameField[4][3] == gameField[4][5] && gameField[4][5] == gameField[4][7] && gameField[4][7] == gameField[4][9]) {
                        return true;
                    }
        }

        // vertical

        if (gameField[0][1] != '\u00B7' && gameField[1][1] != '\u00B7' && gameField[2][1] != '\u00B7' && gameField[3][1] != '\u00B7' && gameField[4][1] != '\u00B7') {
            if (gameField[0][1] == gameField[1][1] && gameField[1][1] == gameField[2][1] && gameField[2][1] == gameField[3][1] && gameField[3][1] == gameField[4][1]) {
                return true;
            }
        } else if (gameField[0][3] != '\u00B7' && gameField[1][3] != '\u00B7' && gameField[2][3] != '\u00B7' && gameField[3][3] != '\u00B7' && gameField[4][3] != '\u00B7') {
            if (gameField[0][3] == gameField[1][3] && gameField[1][3] == gameField[2][3] && gameField[2][3] == gameField[3][3] && gameField[3][3] == gameField[4][3]) {
                return true;
            }
        } else if (gameField[0][5] != '\u00B7' && gameField[1][5] != '\u00B7' && gameField[2][5] != '\u00B7' && gameField[3][5] != '\u00B7' && gameField[4][5] != '\u00B7') {
            if (gameField[0][5] == gameField[1][5] && gameField[1][5] == gameField[2][5] && gameField[2][5] == gameField[3][5] && gameField[3][5] == gameField[4][5]) {
                return true;
            }
        }else if (gameField[0][7] != '\u00B7' && gameField[1][7] != '\u00B7' && gameField[2][7] != '\u00B7' && gameField[3][7] != '\u00B7' && gameField[4][7] != '\u00B7') {
            if (gameField[0][7] == gameField[1][7] && gameField[1][7] == gameField[2][7] && gameField[2][7] == gameField[3][7] && gameField[3][7] == gameField[4][7]) {
                return true;
            }
        }else if (gameField[0][9] != '\u00B7' && gameField[1][9] != '\u00B7' && gameField[2][9] != '\u00B7' && gameField[3][9] != '\u00B7' && gameField[4][9] != '\u00B7') {
            if (gameField[0][9] == gameField[1][9] && gameField[1][9] == gameField[2][9] && gameField[2][9] == gameField[3][9] && gameField[3][9] == gameField[4][9]) {
                return true;
            }
        }

        //Diagonal

        if (gameField [0] [1] != '\u00B7' && gameField [1] [3] != '\u00B7' && gameField [2] [5] != '\u00B7' && gameField [3] [7] != '\u00B7' && gameField [4] [9] != '\u00B7') {
            if (gameField [0] [1] == gameField [1] [3] && gameField [1] [3] == gameField [2] [5] && gameField [2] [5] == gameField [3] [7] && gameField [3] [7] == gameField [4] [9]) {
                return true;
            }
        }

        return false;
    }

    static String switchPlayer(String currentUser) {
        return currentUser.equals("Human") ? "Computer" : "Human";
    }

    static char switchPlayerSign(char currentPlayerSign) {
        return currentPlayerSign == 'X' ? 'O' : 'X';
    }

    static void clearFiled() {
        for (int i = 0; i < 30; i++) {
            System.out.println("\b");
        }
    }

    static boolean putValueOnField(char[][] gameFieldParts, int[] coordinates, char playerSign) {
        if (gameFieldParts[coordinates[0]][coordinates[1]] == '\u00B7') {
            gameFieldParts[coordinates[0]][coordinates[1]] = playerSign;
            System.out.println(String.format("Value plotted on coordinates [x: %s, y: %s", coordinates[0], coordinates[1]));

            return true;
        }
        System.out.println("Value already plotted. pleas choose other coordinates");
        return false;
    }

    static int[] move(String currentPlayer) {
        if (currentPlayer.equals("Human")) {
            return myMove();
        }
        return computerMove();
    }

    static int[] computerMove() {
        int [] compXcoordinates = {0,1, 2, 3, 4};
        Random random = new Random();
        int xAvalableCoordinate = random.nextInt(5);
        int [] compYcoordinates = {0,1, 2, 3, 4};
        int yAvalableCoordinate = random.nextInt(5);
        return new int[] {xAvalableCoordinate,yAvalableCoordinate};
    }

    static int[] myMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input X coordinate. Available coordinates are [0, 1, 2, 3, 4]");
        int xCoordinate = scanner.nextInt();
        System.out.println("Input Y coordinate. Available coordinates are [1, 3, 5, 7, 9]");
        int yCoordinate = scanner.nextInt();
        return new int[]{xCoordinate, yCoordinate};
    }
    
    static char [] signOption() {
        char[] signs = new char[2];
        System.out.println("Choosing X or O ...");
        switch (new Random().nextInt(2)) {
            case 0: {
                signs[0] = 'O';
                signs[1] = 'X';
                System.out.println("Your sign: O");
                break;
            }
            case 1: {
                signs[0] = 'X';
                signs[1] = 'O';
                System.out.println("Your sign: X");
                break;

            }
            default: {
                System.out.println("Something went wrong. Unknown sign rather than [X,O]");
                System.exit(-1);
            }
        }
        return signs;
    }

    static void getGameField(char [] [] gameField) {
        for (int i =0; i < 5; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.print(gameField[i][j]);
            }

            System.out.println();
        }
    }

    static char [] [] gameFieldparts () {
        return new char[] [] {
                {'\u007C', '\u00B7','\u007C', '\u00B7','\u007C', '\u00B7','\u007C', '\u00B7','\u007C', '\u00B7','\u007C'},
                {'\u007C', '\u00B7','\u007C', '\u00B7','\u007C', '\u00B7','\u007C', '\u00B7','\u007C', '\u00B7','\u007C'},
                {'\u007C', '\u00B7','\u007C', '\u00B7','\u007C', '\u00B7','\u007C', '\u00B7','\u007C', '\u00B7','\u007C'},
                {'\u007C', '\u00B7','\u007C', '\u00B7','\u007C', '\u00B7','\u007C', '\u00B7','\u007C', '\u00B7','\u007C'},
                {'\u007C', '\u00B7','\u007C', '\u00B7','\u007C', '\u00B7','\u007C', '\u00B7','\u007C', '\u00B7','\u007C'}

        };
    }
}
