package DesignPattern.SystemDesignAskedQuestion.TicTacToeGame;

public class Player
{
    private String name;
    private PlayingPiece playingPiece;

    public Player(String name, PlayingPiece playingPiece){
        this.name = name;
        this.playingPiece = playingPiece;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public PlayingPiece getPlayingPiece()
    {
        return playingPiece;
    }

    public void setPlayingPiece(PlayingPiece playingPiece)
    {
        this.playingPiece = playingPiece;
    }
}
