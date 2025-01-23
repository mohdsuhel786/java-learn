package DesignPattern.SystemDesignAskedQuestion.TicTacToeGame;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTocToeGame
{

    Deque<Player> players;
    Board gameboard;

    public TicTocToeGame(){
        initializeGame();
    }

    public void initializeGame(){

        players = new LinkedList<>();
        PlayingPiece pieceTypeX = new PlayingPieceX();
        Player player1 = new Player("Player1",pieceTypeX);
        players.add(player1);
        PlayingPiece pieceTypeO = new PlayingPieceO();
        Player player2 = new Player("Player2",pieceTypeO);
        players.add(player2);
        gameboard = new Board(3);

    }

    public String startGame(){
        boolean noWinner = true;
        while(noWinner){

            Player playerTurn = players.removeFirst();
            gameboard.printBoard();

            List<Board.Pair<Integer, Integer>> freeCells = gameboard.getFreeCells();
            Scanner sc = new Scanner(System.in);
            if(freeCells.isEmpty()){
                return "Game Tie";
            }
            else{
                System.out.print("Players: " +playerTurn.getName()+ "  Enter row,col: ");
                String input = sc.nextLine();
                String[] split = input.split(",");
                int row = Integer.parseInt(split[0]);
                int col = Integer.parseInt(split[1]);
                boolean PieceAddedSuccessFully = gameboard.addPiece(row, col, playerTurn.getPlayingPiece());
                if(!PieceAddedSuccessFully){
                    System.out.println("Incorrect position chosen, Try again ");
                    players.addFirst(playerTurn);
                    continue;
                }
                players.addLast(playerTurn);

                boolean winner = checkWinner(row,col,playerTurn.getPlayingPiece());
                if(winner){
                    System.out.println("Wow "+ playerTurn.getName()+ " winner..!");
                    return playerTurn.getName();
                }
            }


        }

        return "Game Tie";
    }

    private boolean checkWinner(int row, int col, PlayingPiece playingPiece)
    {
        boolean rowMatch = true;
        boolean colMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        for(int i =0 ;i<gameboard.getSize();i++){
            if(gameboard.getBoard()[row][i] ==null || gameboard.getBoard()[row][i].getPieceType()!=playingPiece.getPieceType()){
                rowMatch = false;
            }
        }
        for(int i =0 ;i<gameboard.getSize();i++){
            if(gameboard.getBoard()[i][col] ==null || gameboard.getBoard()[i][col].getPieceType()!=playingPiece.getPieceType()){
                colMatch = false;
            }
        }


        for(int i =0,j =0  ;i<gameboard.getSize();i++,j++){
            if(gameboard.getBoard()[i][j] ==null || gameboard.getBoard()[i][j].getPieceType()!=playingPiece.getPieceType()){
                diagonalMatch = false;
            }
        }

        for(int i =0,j =gameboard.getSize()-1; i<gameboard.getSize();  i++,j--){
            if(gameboard.getBoard()[i][j] ==null || gameboard.getBoard()[i][j].getPieceType()!=playingPiece.getPieceType()){
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || colMatch || diagonalMatch || antiDiagonalMatch;
    }
}
