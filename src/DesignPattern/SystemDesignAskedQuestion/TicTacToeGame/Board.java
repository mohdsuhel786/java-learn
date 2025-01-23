package DesignPattern.SystemDesignAskedQuestion.TicTacToeGame;

import java.util.ArrayList;
import java.util.List;

public class Board
{
    private final int size;
    private final PlayingPiece[][] board;

    public Board(int size){
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int row, int col, PlayingPiece playingPiece){
        if(row >=size || col >= size){
            return false;
        }

        if(board[row][col] != null){
            return false;
        }
        else{
            board[row][col] = playingPiece;
            return true;
        }

    }


    public List<Pair<Integer,Integer>> getFreeCells(){
    List<Pair<Integer,Integer>> freeCells = new ArrayList<>();
    for(int i = 0 ;i<board.length;i++){
        for(int j = 0;j<board[i].length;j++){
            if(board[i][j] == null){
                Pair<Integer,Integer> pair = new Pair<>(i,j);
                freeCells.add(pair);
            }
        }
    }
    return freeCells;

    }



    public static class Pair<I extends Number, I1 extends Number>
    {
        Integer first;
        Integer second;

        Pair(Integer first, Integer second) {
            this.first = first;
            this.second = second;
        }
    }

    public void printBoard(){
        for(int i = 0 ;i<board.length;i++){
            for(int j = 0;j<board[i].length;j++){
                if(board[i][j] == null){
                    System.out.print(" "+"  |  ");
                }
                else{
                    System.out.print(board[i][j].getPieceType()+"  |  ");
                }

            }
            System.out.println();
        }
    }

    public int getSize()
    {
        return size;
    }

    public PlayingPiece[][] getBoard()
    {
        return board;
    }
}
