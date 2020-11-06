public class King extends Piece {

private char p = 'K';
private boolean white;

public King (int i, int j,boolean w){
	this.setX(i);
	this.setY(j);
	this.setW(w);
	}
public King (int i, int j,boolean w,boolean h){
	super(i,j,w,h);
}
	
public boolean canMove(int x, int y){
	//check logic is done in board class, and this canmove isnt accessed until we know board is not in check.
	int Cx=this.getX();
	int Cy=this.getY();
	int n = 0;
	if (x==Cx){
		if (y==Cy+1||y==Cy-1){
			n+=1;
			}
		}
	else if (x==Cx+1){
		if (y==Cy|| y==Cy+1||y==Cy-1){
			n+=1;
			}
		}
	else if (x==Cx-1){
		if (y==Cy||y==Cy+1||y==Cy-1){
			n+=1;
			}
		}
	if (n>=1){
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
