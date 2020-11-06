public class Pawn extends Piece {

private char p = 'P';
private boolean move;

private boolean isW;
private boolean white;
private boolean enpassant; //decides if the pawn can be taken by en passant

public Pawn (int i, int j, boolean w){
	this.setX(i);
	this.setY(j);
	this.setW(w);
	}
public Pawn (int i, int j,boolean w,boolean h){
	super(i,j,w,h);
}
	
//it is important for this class to knowif we are white or black because pawns cant move backwards!	
public void setEnPassant(boolean boo){
	this.enpassant=boo;
}
public boolean getEnPassant(){
	return this.enpassant;
}
public boolean canMove(int x, int y){
isW=Game.isW;
int n=0;
//for white moves
		if ((this.getW()==true)&&this.getHasMoved()==false){
			//
			if (y==this.getY()-1 && x==this.getX() && Board.idiot.get(x).get(y)==null){
				n+=1;
				}
			else if(y==this.getY()-2 && x==this.getX() && Board.idiot.get(x).get(y)==null){
			n=1;
			setEnPassant(true);
			}
			else if (y==this.getY()-1&&x==this.getX()+1){
				if (Board.idiot.get(x).get(y)!=null&&Board.idiot.get(x).get(y).getW()!=this.getW()){
					n+=1;
				}	
				else if (Board.chessBoard.get(x).get(y+1)!=null && Board.chessBoard.get(x).get(y+1).getW()!=this.getW() && Board.chessBoard.get(x).get(y+1).getP()=='P'){
					if(Board.chessBoard.get(x).get(y+1).getEnPassant()){
						Board.chessBoard.get(x).set(y+1,null);
						n+=1;
					}
					//for en passant
				}}
			else if (y==this.getY()-1&&x==this.getX()-1){
				if (Board.idiot.get(x).get(y)!=null&&Board.idiot.get(x).get(y).getW()!=this.getW()){
					n+=1;
				}
				else if (Board.chessBoard.get(x).get(y+1)!=null && Board.chessBoard.get(x).get(y+1).getW()!=this.getW() && Board.chessBoard.get(x).get(y+1).getP()=='P'){
					if(Board.chessBoard.get(x).get(y+1).getEnPassant()){
						Board.chessBoard.get(x).set(y+1,null);
						n+=1;
					}
					//for en passant
				}
				}
				
				
				}
		else if (this.getW()==true && this.getHasMoved()==true){
			if (y==this.getY()-1 && x==this.getX() && Board.idiot.get(x).get(y)==null){
				n+=1;
			}
			else if (y==this.getY()-1&&(x==(this.getX()+1))){

				if (Board.idiot.get(x).get(y)!=null&&Board.idiot.get(x).get(y).getW()!=this.getW()){
					n+=1;
				}
				else if (Board.chessBoard.get(x).get(y+1)!=null && Board.chessBoard.get(x).get(y+1).getW()!=this.getW() && Board.chessBoard.get(x).get(y+1).getP()=='P'){
					if(Board.chessBoard.get(x).get(y+1).getEnPassant()){
						Board.chessBoard.get(x).set(y+1,null);
						n+=1;
					}
					//for en passant
				}}
			else if (y==this.getY()-1&&(x==(this.getX()-1))){
					if (Board.idiot.get(x).get(y)!=null&&Board.idiot.get(x).get(y).getW()!=this.getW()){
					n+=1;
					}
				else if (Board.chessBoard.get(x).get(y+1)!=null && Board.chessBoard.get(x).get(y+1).getW()!=this.getW() && Board.chessBoard.get(x).get(y+1).getP()=='P'){
					if(Board.chessBoard.get(x).get(y+1).getEnPassant()){
						Board.chessBoard.get(x).set(y+1,null);
						n+=1;
					}
					//for en passant
				}}
			}
	
		
		//for black moves
		if ((this.getW()==false)&&this.getHasMoved()==false){
			if ((y==this.getY()+1 && x==this.getX() && Board.idiot.get(x).get(y)==null))
				n+=1;
			else if(y==this.getY()+2 && x==this.getX() && Board.idiot.get(x).get(y)==null){
				n=1;
				setEnPassant(true);
				}
			else if (y==this.getY()+1&&x==this.getX()+1){
				if (Board.idiot.get(x).get(y)!=null&&Board.idiot.get(x).get(y).getW()!=this.getW()){
					n+=1;
				}
				else if (Board.chessBoard.get(x).get(y-1)!=null && Board.chessBoard.get(x).get(y-1).getW()!=this.getW() && Board.chessBoard.get(x).get(y-1).getP()=='P'){
					if(Board.chessBoard.get(x).get(y-1).getEnPassant()){
						Board.chessBoard.get(x).set(y-1,null);
						n+=1;
					}
					//for en passant
				}
				}
			else if (y==this.getY()+1&&x==this.getX()-1){	
				if (Board.idiot.get(x).get(y)!=null&&Board.idiot.get(x).get(y).getW()!=this.getW())
					n+=1;
				else if (Board.chessBoard.get(x).get(y-1)!=null && Board.chessBoard.get(x).get(y-1).getW()!=this.getW() && Board.chessBoard.get(x).get(y-1).getP()=='P'){
					if(Board.chessBoard.get(x).get(y-1).getEnPassant()){
						Board.chessBoard.get(x).set(y-1,null);
						n+=1;
					}
					//for en passant
				}
					
			}}
			
			
		else if (this.getW() == false && this.getHasMoved()==true){
			if (y==this.getY()+1 && x==this.getX() && Board.idiot.get(x).get(y)==null){
				n+=1;
			}
			else if (y==this.getY()+1 && x==(this.getX()+1)){
//checks to see if the pawn can move diagonal
				if (Board.idiot.get(x).get(y)!=null&&Board.idiot.get(x).get(y).getW()!=this.getW()){
					n+=1;
				}
				else if (Board.chessBoard.get(x).get(y-1)!=null && Board.chessBoard.get(x).get(y-1).getW()!=this.getW() && Board.chessBoard.get(x).get(y-1).getP()=='P'){
					if(Board.chessBoard.get(x).get(y-1).getEnPassant()){
						Board.chessBoard.get(x).set(y-1,null);
						n+=1;
					}
					//for en passant
				}
			}
			else if (y==this.getY()+1&&x==(this.getX()-1)){
				if (Board.idiot.get(x).get(y)!=null&&Board.idiot.get(x).get(y).getW()!=this.getW()){
					//System.out.println("hi");
					n+=1;}
				else if (Board.chessBoard.get(x).get(y-1)!=null && Board.chessBoard.get(x).get(y-1).getW()!=this.getW() && Board.chessBoard.get(x).get(y-1).getP()=='P'){
					if(Board.chessBoard.get(x).get(y-1).getEnPassant()){
						Board.chessBoard.get(x).set(y-1,null);
						n+=1;
					}
					//for en passant
				}
				}
		}
	
if (n>0){
	return true;
	}
else return false;
	
}	
	
public char getP(){
	return p;
	}
}
