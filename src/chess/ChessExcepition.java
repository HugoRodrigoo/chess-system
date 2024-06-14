package chess;

import boardgame.BoardException;

public class ChessExcepition extends BoardException{

	
	private static final long serialVersionUID = 1L;
	
	public ChessExcepition(String msg) {
		super(msg);
	}

}
