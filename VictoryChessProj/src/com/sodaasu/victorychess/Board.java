package com.sodaasu.victorychess;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Board {
	
	//models the contents of the board. a space not containing a piece should be null
	private Piece[][] spaces;
	
	//this should set up the board with a standard piece layout
	public Board(){
		throw new NotImplementedException();
	}
	
	//returns true if the space is unoccupied
	public boolean isSpaceEmpty(int xCoord, int yCoord){
		throw new NotImplementedException();
	}
	
	//returns a reference to the piece on the space, or null if the space is empty
	public Piece getPieceOnSpace(int xCoord, int yCoord){
		throw new NotImplementedException();
	}
	
	
	//change the location of the piece. this is an internal method, add more error checking to a public version
	//IMPORTANT: this should also let the piece know where it is!
	private void changePieceLocation(Piece mover, Position pos){
		throw new NotImplementedException();
	}
	
	//add a piece to the board. this is an internal method, add more error checking to a public version
	//IMPORTANT: this should also let the piece know where it is!
	private void addPieceToBoard(Piece pieceToAdd, Position pos){
		throw new NotImplementedException();
	}
	
	//remove a piece from the board. this is an internal method, add more error checking to a public version
	private void removePieceFromBoard(Piece pieceToRemove){
		throw new NotImplementedException();
	}
	
}
