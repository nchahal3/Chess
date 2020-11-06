public class Queen extends Piece {

private char p = 'Q';
private Rook dummyRook;
private Bishop dummyBishop;
private boolean white;
public Queen (int i, int j, boolean w){
	this.setX(i);
	this.setY(j);
	dummyRook = new Rook(i,j,w);
	dummyBishop = new Bishop(i,j,w);
	this.setW(w);
	}
	
public Queen (int i, int j,boolean w,boolean h){
	super(i,j,w,h);
	dummyRook = new Rook(i,j,w,h);
	dummyBishop = new Bishop(i,j,w,h);
}
	
public boolean canMove(int x, int y){
	//the first if statement checks if its moving like a rook or bishop

	boolean dummy1Move=this.dummyRook.canMove(x,y);
	boolean dummy2Move=this.dummyBishop.canMove(x,y);
	//System.out.println(dummyRook.getX()+","+dummyRook.getY());
	//System.out.println(dummyBishop.getX()+","+dummyBishop.getY());
	int n =0;
	if (x==this.getX()||y==this.getY()){
	if (dummy1Move==true){
		n+=1;
		}
	}
	else if (dummy2Move==true){
			n+=1;
			}
		
	if (n>=1){
		if (Board.idiot.get(x).get(y)!= null){
			if (Board.idiot.get(x).get(y).getP()!='K'){
				dummyRook.setX(x);
				dummyRook.setY(y);
				dummyBishop.setX(x);
				dummyBishop.setY(y);
		}}
		else if (Board.idiot.get(x).get(y)==null){
			dummyRook.setX(x);
			dummyRook.setY(y);
			dummyBishop.setX(x);
			dummyBishop.setY(y);
			}
		return true;
		}
	else return false;
}
	public char getP(){
	return p;
	}
	
	public void setEnPassant(boolean boo){
	}
	public boolean getEnPassant(){
		return false;
	}
}
