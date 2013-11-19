package com.sodaasu.victorychess;

import java.util.ArrayList;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Board {
	
	//32 is the max amt of pieces on the board; 64 is the max amt of spaces on 8x8 board
	private final int TOTAL_PIECES = 32;
	private final int TOTAL_SPACES = 64;
	
	//8x8 board
	private final int BOARD_WIDTH = 8;
	private final int BOARD_HEIGHT = 8;
	
	//models the contents of the board. a space not containing a piece should be null
	private ArrayList<Piece> spaces;
	
	//this should set up the board with a standard piece layout
	public Board(){
		//initialize board spaces & guarantee that 64 spaces will fit
		spaces = new ArrayList<Piece>();
		spaces.ensureCapacity(TOTAL_SPACES);
	}
	
	//helper function to make up for ArrayLists' lack of 2Dness
	public int getIndexFrom2D(int xCoord, int yCoord){
		return ((yCoord * BOARD_WIDTH) + xCoord);
	}
	
	//returns true if the space is unoccupied
	public boolean isSpaceEmpty(int xCoord, int yCoord){
		//for each element in 'spaces'
		for(Piece piece: spaces){
			//create a position object from current element
			Position pos = piece.getLocation();
			
			//if that objects' data are the same as the input, then the space is occupied
			if(pos.xCoord == xCoord && pos.yCoord == yCoord){
				return false;
			}
		}
		
		return true;
	}
	
	//returns a reference to the piece on the space, or null if the space is empty
	public Piece getPieceOnSpace(int xCoord, int yCoord){
		//for each element in 'spaces'
		for(Piece piece: spaces){
			//create a position object from current element
			Position pos = piece.getLocation();
			
			//if that objects' data are the same as the input, then the space is occupied
			if(pos.xCoord == xCoord && pos.yCoord == yCoord){
				return piece;
			}
		}
		
		return null;
	}
	
	
	//change the location of the piece. this is an internal method, add more error checking to a public version
	//IMPORTANT: this should also let the piece know where it is!
	private void changePieceLocation(Piece mover, Position pos){
		throw new NotImplementedException();
	}
	
	//public function to add the piece to board.  may want to ensure that the coordinates aren't out of bounds as well
	public boolean addPiece(Piece pieceToAdd, Position pos){
		//is the space available to add to?
		if(isSpaceEmpty(pos.xCoord, pos.yCoord)){
			//has the max capacity for pieces been reached?
			if(spaces.size() < TOTAL_PIECES){
				addPieceToBoard(pieceToAdd, pos);
				return true;
			}
			
			else
				System.out.println("Board has too many pieces!");
				return false;
		}
		
		else
			System.out.println("Desired location isn't available!");
			return false;
	}
	
	//add a piece to the board. this is an internal method, add more error checking to a public version
	//IMPORTANT: this should also let the piece know where it is!
	private void addPieceToBoard(Piece pieceToAdd, Position pos){
		pieceToAdd.setLocation(pos);
		spaces.add(pieceToAdd);
	}
	
	//public function to remove piece from board.  
	public boolean removePiece(Piece pieceToRemove){
		if(spaces.contains(pieceToRemove)){
			removePieceFromBoard(pieceToRemove);
			return true;
		}
		
		System.out.println("Inputted piece isn't valid!");
		return false;
	}
	
	//remove a piece from the board. this is an internal method, add more error checking to a public version
	private void removePieceFromBoard(Piece pieceToRemove){
		spaces.remove(pieceToRemove);
	}
	
}
