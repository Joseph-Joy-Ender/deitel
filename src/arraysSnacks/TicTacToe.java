package arraysSnacks;

import java.util.Scanner;

class TicTacToe {
    public static void main(String[] args) {

        Game game = new Game();
        game.play();

    }

}

class Board {
    int count = 0;
    String[] board = {" ", " ", " ", " ", " ", " ", " ", " ", " "};

    void printBoard(){
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("-----------");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("-----------");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
    }

    boolean updateBoard(int position, String type) {
        if (board[position -1].equals(" ")){
            board[position - 1] = type;
            count ++;
            return true;
        }
        else {
            System.out.println("Position already selected. select another position");
            return false;
        }
    }

    boolean checkDraw(){
        return count == 9;
    }

    boolean checkWinner(String type){
        return (board[0].equals(type) && board[1].equals(type) && board[2].equals(type))
               || (board[3].equals(type) && board[4].equals(type) && board[5].equals(type))
               || (board[6].equals(type) && board[7].equals(type) && board[8].equals(type))
               || (board[0].equals(type) && board[3].equals(type) && board[6].equals(type))
               || (board[1].equals(type) && board[4].equals(type) && board[7].equals(type))
               || (board[2].equals(type) && board[5].equals(type) && board[8].equals(type))
               || (board[0].equals(type) && board[4].equals(type) && board[8].equals(type))
               || (board[2].equals(type) && board[4].equals(type) && board[6].equals(type));


    }
}

class Player {
   String name;
   String type;

   Player(String type){
       this.type = type;
       Scanner scanner = new Scanner(System.in);
       if (type.equals("X")){
           System.out.println("Player selecting X, enter your name: ");
       }
       else {
           System.out.println("Player selecting O, enter your name: ");
       }
       name = scanner.nextLine();
   }
}

class Game {
    Board board = new Board();
    Player player1 = new Player("X");
    Player player2 = new Player("O");
    Player currentPlayer = player1;

    void play(){
       String message;
        while (true){
           message = "Enter the position(1 - 9):";
            System.out.println(currentPlayer.name + " " + message);
            Scanner scanner = new Scanner(System.in);
            int position = scanner.nextInt();

            if (board.updateBoard(position, currentPlayer.type)) {
                board.printBoard();
                if (board.checkWinner(currentPlayer.type)){
                    System.out.println(currentPlayer.name + " Wins!");
                    break;
                } else if (board.checkDraw()) {
                    System.out.println("Game is a draw!");
                    break;
                }
                else {
                    if (currentPlayer == player1) {
                        currentPlayer = player2;
                    } else {
                        currentPlayer = player1;
                    }
                }
            }
        }

    }
}