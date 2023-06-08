package battleship;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        //? ===============================================================
        char[][] board1 = {
                {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'}
        };
        char[][] fakeBoard1 = {
                {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'}
        };
        char[][] board2 = {
                {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'}
        };
        char[][] fakeBoard2 = {
                {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                {'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'}
        };
        ArrayList<String> ShipsCount1 = new ArrayList<String>();
        ArrayList<String> ShipsCount2 = new ArrayList<String>();

        //? ===============================================================

        System.out.println("Player 1 ,place your ships on the game field");
        System.out.println();
        PrintBoard(board1);
        int turns = 5;
        Scanner scanner = new Scanner(System.in);
        while (turns > 0) {
            //*  Case Handler ===== Open
            String shipname = "";
            Integer ships = null;

            switch (turns) {
                case 5 -> {
                    ships = Integer.valueOf(5);
                    shipname = "Aircraft";
                }
                case 4 -> {
                    ships = Integer.valueOf(4);
                    shipname = "Battleship";
                }
                case 3 -> {
                    ships = Integer.valueOf(3);
                    shipname = "Submarine";
                }
                case 2 -> {
                    ships = Integer.valueOf(3);
                    shipname = "Cruiser";
                }
                case 1 -> {
                    ships = Integer.valueOf(2);
                    shipname = "Destroyer";
                }
            }
            //!  Case Handler ===== Close

            System.out.println();
            System.out.println("Enter the coordinates of the " + shipname + " Carrier (" + ships + " cells):");
            System.out.println();
            String turn = scanner.nextLine().toUpperCase();

            turn = turn.replaceAll(" ", "");

            // Turn Handler

            char getrow1 = turn.charAt(0);
            char getrow2 = turn.charAt(2);
            int row1 = (int) getrow1 - 65;
            int row2 = (int) getrow2 - 65;
            int col1 = turn.charAt(1) - 49;
            int col2 = turn.charAt(3) - 49;

            //coordenadas para checkeo


            if (turn.length() == 5 && turn.charAt(2) == 48) {
                getrow2 = turn.charAt(3);
                row2 = (int) getrow2 - 65;
                col1 = 9;
                col2 = turn.charAt(4) - 49;
            }
            if (turn.length() == 5 && turn.charAt(4) == 48) {
                getrow2 = turn.charAt(2);
                row2 = (int) getrow2 - 65;
                col2 = 9;
                col1 = turn.charAt(1) - 49;
            }
            if (turn.length() == 6 && turn.charAt(2) == 48) {
                getrow2 = turn.charAt(3);
                row2 = (int) getrow2 - 65;
                col1 = 9;
            }
            if (turn.length() == 6 && turn.charAt(5) == 48) {
                getrow2 = turn.charAt(3);
                row2 = (int) getrow2 - 65;
                col2 = 9;
            }

            /* Checkeo de alrededores */ //? Open
            boolean closeTo = false;
            int full = 0;
            int colp;
            int rowp;
            if (col1 < col2) {
                colp = col1;
            } else {
                colp = col2;
            }
            if (row1 < row2) {
                rowp = row1;
            } else {
                rowp = row2;
            }
            //horizontal
            if (row1 == row2) {
                for (int i = -1; i < 2; i++) {
                    for (int f = -1; f < (ships + 1); f++) {
                        try {
                            if (board1[rowp + i][colp + f] == 'O') {
                                full += 1;
                            }
                        } catch (ArrayIndexOutOfBoundsException exception) {

                        }
                    }
                }
            } else {// vertical
                for (int i = -1; i < 5; i++) {
                    for (int f = -1; f < 1; f++) {
                        try {
                            if (board1[rowp + i][colp + f] == 'O') {
                                full += 1;
                            }
                        } catch (ArrayIndexOutOfBoundsException exception) {

                        }
                    }
                }
            }


            if (full > 0) {
                closeTo = true;
            }
            /* Checkeo de alrededores */ //! close
            int diff = 0;
            if (row1 == row2) {
                diff = Math.abs(col1 - col2) + 1;
            } else if (col1 == col2) {
                diff = Math.abs(row1 - row2) + 1;
            }
            if (col1 == 9 && diff != ships || col2 == 9 && diff != ships) {
                diff += 1;
            }


            if (row1 == row2 && ((ships.equals(diff))) && !closeTo) { // Horizontal ship
                if (col2 > col1) {
                    for (int i = 0; i < ships; i++) { // Upwards
                        board1[row1][col1 + i] = 'O';

                    }
                } else {
                    for (int i = 0; i < ships; i++) { // Downwards
                        board1[row1][col2 + i] = 'O';
                    }
                }
                ShipsCount1.add(Integer.toString(row1) + Integer.toString(col1) + Integer.toString(row2) + Integer.toString(col2));
                turns -= 1;
                System.out.println();
                PrintBoard(board1);
                // Vertical ship
            } else if (col1 == col2 && ((ships.equals(diff))) && !closeTo) { // Vertical ship
                if (row1 > row2) {
                    for (int i = 0; i < ships; i++) { // Upwards
                        board1[row2 + i][col1] = 'O';
                    }
                } else {
                    for (int i = 0; i < ships; i++) { //  Downward
                        board1[row1 + i][col1] = 'O';
                    }
                }
                ShipsCount1.add(Integer.toString(row1) + Integer.toString(col1) + Integer.toString(row2) + Integer.toString(col2));
                turns -= 1;
                System.out.println();
                PrintBoard(board1);

            } else {
                if (col1 == col2 && ((row1 + (row2 + 1)) != (ships - 1)) && !closeTo) { // if same collumn but lengt doesnt fit
                    System.out.println("Error! Wrong length of the Submarine! Try again:");
                } else if (row1 == row2 && ((col1 + (col2 + 1) != ships)) && !closeTo) { // if same collumn but lengt doesnt fit
                    System.out.println("Error! Wrong length of the Submarine! Try again:");
                } else if (col1 != col2 && row1 != row2 && !closeTo) {
                    System.out.println("Error! Wrong ship location! Try again:");
                } else if (closeTo) {
                    System.out.println("Error! You placed it too close to another one. Try again:");
                }
            }
        } // Ships placement

        //* segundo turno


        System.out.println();
        System.out.println("Press Enter and pass the move to another player");
        System.in.read();
        System.out.println("...");


        System.out.println("Player 2 ,place your ships on the game field");
        System.out.println();
        PrintBoard(board2);
        turns = 5;
        while (turns > 0) {
            //*  Case Handler ===== Open
            String shipname = "";
            Integer ships = null;

            switch (turns) {
                case 5 -> {
                    ships = Integer.valueOf(5);
                    shipname = "Aircraft";
                }
                case 4 -> {
                    ships = Integer.valueOf(4);
                    shipname = "Battleship";
                }
                case 3 -> {
                    ships = Integer.valueOf(3);
                    shipname = "Submarine";
                }
                case 2 -> {
                    ships = Integer.valueOf(3);
                    shipname = "Cruiser";
                }
                case 1 -> {
                    ships = Integer.valueOf(2);
                    shipname = "Destroyer";
                }
            }
            //!  Case Handler ===== Close

            System.out.println();
            System.out.println("Enter the coordinates of the " + shipname + " Carrier (" + ships + " cells):");
            System.out.println();
            String turn = scanner.nextLine().toUpperCase();
            turn = turn.replaceAll(" ", "");

            // Turn Handler

            char getrow1 = turn.charAt(0);
            char getrow2 = turn.charAt(2);
            int row1 = (int) getrow1 - 65;
            int row2 = (int) getrow2 - 65;
            int col1 = turn.charAt(1) - 49;
            int col2 = turn.charAt(3) - 49;

            //coordenadas para checkeo


            if (turn.length() == 5 && turn.charAt(2) == 48) {
                getrow2 = turn.charAt(3);
                row2 = (int) getrow2 - 65;
                col1 = 9;
                col2 = turn.charAt(4) - 49;
            }
            if (turn.length() == 5 && turn.charAt(4) == 48) {
                getrow2 = turn.charAt(2);
                row2 = (int) getrow2 - 65;
                col2 = 9;
                col1 = turn.charAt(1) - 49;
            }
            if (turn.length() == 6 && turn.charAt(2) == 48) {
                getrow2 = turn.charAt(3);
                row2 = (int) getrow2 - 65;
                col1 = 9;
            }
            if (turn.length() == 6 && turn.charAt(5) == 48) {
                getrow2 = turn.charAt(3);
                row2 = (int) getrow2 - 65;
                col2 = 9;
            }

            /* Checkeo de alrededores */ //? Open
            boolean closeTo = false;
            int full = 0;
            int colp;
            int rowp;
            if (col1 < col2) {
                colp = col1;
            } else {
                colp = col2;
            }
            if (row1 < row2) {
                rowp = row1;
            } else {
                rowp = row2;
            }
            //horizontal
            if (row1 == row2) {
                for (int i = -1; i < 2; i++) {
                    for (int f = -1; f < (ships + 1); f++) {
                        try {
                            if (board2[rowp + i][colp + f] == 'O') {
                                full += 1;
                            }
                        } catch (ArrayIndexOutOfBoundsException exception) {

                        }
                    }
                }
            } else {// vertical
                for (int i = -1; i < (ships); i++) {
                    for (int f = -1; f < 2; f++) {
                        try {
                            if (board2[rowp + i][colp + f] == 'O') {
                                full += 1;
                            }
                        } catch (ArrayIndexOutOfBoundsException exception) {

                        }
                    }
                }
            }


            if (full > 0) {
                closeTo = true;
            }
            /* Checkeo de alrededores */ //! close
            int diff = 0;
            if (row1 == row2) {
                diff = Math.abs(col1 - col2) + 1;
            } else if (col1 == col2) {
                diff = Math.abs(row1 - row2) + 1;
            }
            if (col1 == 9 && diff != ships || col2 == 9 && diff != ships) {
                diff += 1;
            }


            if (row1 == row2 && ((ships.equals(diff))) && !closeTo) { // Horizontal ship
                if (col2 > col1) {
                    for (int i = 0; i < ships; i++) { // Upwards
                        board2[row1][col1 + i] = 'O';

                    }
                } else {
                    for (int i = 0; i < ships; i++) { // Downwards
                        board2[row1][col2 + i] = 'O';
                    }
                }
                ShipsCount2.add(Integer.toString(row1) + Integer.toString(col1) + Integer.toString(row2) + Integer.toString(col2));
                turns -= 1;
                System.out.println();
                PrintBoard(board2);
                // Vertical ship
            } else if (col1 == col2 && ((ships.equals(diff))) && !closeTo) { // Vertical ship
                if (row1 > row2) {
                    for (int i = 0; i < ships; i++) { // Upwards
                        board2[row2 + i][col1] = 'O';
                    }
                } else {
                    for (int i = 0; i < ships; i++) { //  Downward
                        board2[row1 + i][col1] = 'O';
                    }
                }
                ShipsCount2.add(Integer.toString(row1) + Integer.toString(col1) + Integer.toString(row2) + Integer.toString(col2));
                turns -= 1;
                System.out.println();
                PrintBoard(board2);

            } else {
                if (col1 == col2 && ((row1 + (row2 + 1)) != (ships - 1)) && !closeTo) { // if same collumn but lengt doesnt fit
                    System.out.println("Error! Wrong length of the Submarine! Try again:");
                } else if (row1 == row2 && ((col1 + (col2 + 1) != ships)) && !closeTo) { // if same collumn but lengt doesnt fit
                    System.out.println("Error! Wrong length of the Submarine! Try again:");
                } else if (col1 != col2 && row1 != row2 && !closeTo) {
                    System.out.println("Error! Wrong ship location! Try again:");
                } else if (closeTo) {
                    System.out.println("Error! You placed it too close to another one. Try again:");
                }
            }
        } // Ships placement
        while(!ShipsCount1.isEmpty() ||!ShipsCount2.isEmpty()){
            int shotRow;
            int shotCol;
            System.out.println();
            System.out.println("Press Enter and pass the move to another player");
            System.in.read();

            System.out.println("...");
            System.out.println();

            PrintBoard(fakeBoard2);
            System.out.println("---------------------");
            PrintBoard(board1);
            System.out.println();
            System.out.println("Player 1, it's your turn:");
            System.out.println();

            String shot1 = scanner.nextLine().toUpperCase();

            while (true){
                if (shot1.isEmpty()){
                    System.out.println("Error! You entered the wrong coordinates! Try again:");
                    shot1 = scanner.nextLine().toUpperCase();
                } else if (shot1.length() == 3 && (shot1.charAt(1) + shot1.charAt(2)) != 97){
                    System.out.println("Error! You entered the wrong coordinates! Try again:");
                    shot1 = scanner.nextLine().toUpperCase();
                }else {
                    break;
                }
            }

            shotRow = Math.abs(shot1.charAt(0) - 65);
            shotCol = Math.abs(shot1.charAt(1) - 49);

            if (board2[shotRow][shotCol] == 'O'){
                board2[shotRow][shotCol] = 'X';
                fakeBoard2[shotRow][shotCol] = 'X';
                System.out.println();
                switch (checkoDestroy(ShipsCount2, board2)) {
                    case 1 -> {
                        System.out.println("You sank the last ship. You won. Congratulations!");
                        System.exit(0);
                    }
                    case 2 -> {
                        System.out.println();
                        System.out.println("You hit a ship!");
                    }
                    case 3 -> {
                        System.out.println();
                        System.out.println("You sank a ship!");
                    }
                }

            }
            else if (board2[shotRow][shotCol] == '~'){
                board2[shotRow][shotCol] = 'M';
                fakeBoard2[shotRow][shotCol] = 'M';
                System.out.println();
                System.out.println("You missed!");
            }
            else if (board1[shotRow][shotCol] == 'X') {
                System.out.println();
                System.out.println("You already shot there dumbass!");

            }

            System.out.println("Press Enter and pass the move to another player");
            System.in.read();
            System.out.println("...");
            System.out.println();

            PrintBoard(fakeBoard1);
            System.out.println("---------------------");
            PrintBoard(board2);

            System.out.println();
            System.out.println("Player 2, it's your turn:");
            System.out.println();

            String shot2 = scanner.nextLine().toUpperCase();
            System.out.println(shot2);
            while (true){
                if (shot2.isEmpty()){
                    System.out.println("Error! You entered the wrong coordinates! Try again:");
                    shot2 = scanner.nextLine().toUpperCase();
                } else if (shot2.length() == 3 && (shot2.charAt(1) + shot2.charAt(2)) != 97){
                    System.out.println("Error! You entered the wrong coordinates! Try again:");
                    shot2 = scanner.nextLine().toUpperCase();
                }else {
                    break;
                }
            }

            shotRow = Math.abs(shot2.charAt(0) - 65);
            if (shot2.length() > 2){
                shotCol = 9;
            } else {
                shotCol = Math.abs(shot2.charAt(1) - 49);
            }


            if (board1[shotRow][shotCol] == 'O'){
                board1[shotRow][shotCol] = 'X';
                fakeBoard1[shotRow][shotCol] = 'X';
                System.out.println();
                switch (checkoDestroy(ShipsCount1, board1)) {
                    case 1 -> {
                        System.out.println("You sank the last ship. You won. Congratulations!");
                        System.exit(0);
                    }
                    case 2 -> {
                        System.out.println();
                        System.out.println("You hit a ship!");
                    }
                    case 3 -> {
                        System.out.println();
                        System.out.println("You sank a ship!");
                    }
                }
            }
            else if (board1[shotRow][shotCol] == '~'){
                board1[shotRow][shotCol] = 'M';
                fakeBoard1[shotRow][shotCol] = 'M';
                System.out.println();
                System.out.println("You missed!");
            }
            else if (board1[shotRow][shotCol] == 'X') {
                System.out.println();
                System.out.println("You already shot there dumbass!");

            }
        }

    }
    public static void PrintBoard(char[][] Board){
        System.out.println("  1 2 3 4 5 6 7 8 9 10 ");
        int i = 0;

        for (char[] row : Board) {
            System.out.print((char)(65 + i) + " ");
            for (char c : row) {
                System.out.print(c + " ");

            }
            System.out.println();
            i++;
        }
    }


    public static int checkoDestroy(ArrayList<String> ships, char[][]board){
        int colmin;
        int rowmin;
        int row;
        int col;
        Integer amountOfDestruction = 0;

        try {
            for (int i = 0; i < ships.size() ; i++) {
                int shipsize;
                int verticalDiff1 = ships.get(i).charAt(1) - (48);
                int verticalDiff2 = ships.get(i).charAt(3) - (48);
                int horDiff1 = ships.get(i).charAt(0) -48;
                int horDiff2 = ships.get(i).charAt(2) -48;
                if (ships.get(i).charAt(0) == ships.get(i).charAt(2)){//horizontal
                    shipsize = Math.abs((ships.get(i).charAt(1) - (48)) - (ships.get(i).charAt(3) -(48))) + 1;
                    for (int j = 0; j < (Math.abs(verticalDiff1 - verticalDiff2) + 1);j++){
                        colmin = Integer.min(ships.get(i).charAt(1),ships.get(i).charAt(3)) - 48;
                        row = Math.abs(ships.get(i).charAt(0) - 48);

                        try {
                            if (board[row][colmin+j] == 'X'){
                                amountOfDestruction +=1;
                            }
                        } catch (ArrayIndexOutOfBoundsException e){
                            amountOfDestruction += 0;
                        }
                    }
                    if (amountOfDestruction.equals(shipsize)) {
                        ships.remove(i);
                        if (ships.isEmpty()){
                            return 1;
                        } else {
                            return 3;
                        }
                    }
                    if(amountOfDestruction >= 1 && !amountOfDestruction.equals(shipsize)){
                        return 2;
                    }


                }

                if (ships.get(i).charAt(1) == ships.get(i).charAt(3)){//vertical
                    shipsize = Math.abs((ships.get(i).charAt(0) - (48)) - (ships.get(i).charAt(2) -(48))) + 1;
                    for (int k = 0; k < (Math.abs(horDiff1 - horDiff2) + 1);k++){
                        rowmin = Integer.min(ships.get(i).charAt(0),ships.get(i).charAt(2)) - 48;
                        col = Math.abs(ships.get(i).charAt(1) - 48);
                        try {

                            if (board[rowmin + k][col] == 'X'){
                                amountOfDestruction +=1;
                            }
                        } catch (ArrayIndexOutOfBoundsException e){

                        }
                    }
                    if (amountOfDestruction.equals(shipsize)) {
                        ships.remove(i);
                        if (ships.isEmpty()){
                            return 1;
                        } else {
                            return 3;
                        }
                    }if(amountOfDestruction >= 1 && !amountOfDestruction.equals(shipsize)){
                        return 2;
                    }
                }

            }
        } catch (Exception e) {

        }
        return 4;
    }

}
