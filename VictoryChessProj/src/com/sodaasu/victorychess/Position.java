package com.sodaasu.victorychess;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

//this class will allow locations to be passed around as monolithic objects
public class Position {

	int xCoord, yCoord;
	
	public Position(){	}
	
	public Position(int x, int y){
		throw new NotImplementedException();
	}
	
	//returns true if this position represents an actual chessboard square (that is, falls somewhere on an 8x8 grid)
	private boolean isPositionValid(){
		throw new NotImplementedException();
	}
}
