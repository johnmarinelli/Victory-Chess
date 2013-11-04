package com.sodaasu.victorychess;

import java.util.Collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public abstract class Piece {

	//contains the color of the piece
	private ChessColor pieceColor;
	
	//holds a reference to the piece's board
	private Board sourceBoard;
	
	//true if the piece has moved at all during the current game
	private boolean hasPieceMoved;
	
	//holds the piece's location on the board.
	private Position location;
	
	//constructs a new piece, setting the sourceBoard to the board param
	//this should never be used directly, but overridden by the individual piece type
	public Piece(Board theBoard, Position initialLocation){
		throw new NotImplementedException();
	}
	
	
	public Position getLocation() {
		return location;
	}

	public void setLocation(Position location) {
		this.location = location;
	}
	
}
