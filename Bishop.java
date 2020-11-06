import java.lang.Math;
public class Bishop extends Piece {

private char p = 'B';
private boolean move;
private boolean white;
public Bishop (int i, int j, boolean w){
	this.setX(i);
	this.setY(j);
	this.setW(w);
	}
public boolean canMove(int x, int y){
	int extra=1;
	int n=0;
	if (x>this.getX()){
		
		if (y>this.getY()&&(y-this.getY()==x-this.getX())){
			
			for (int i=this.getX();i<x-1;i++){
				//if (Board.chessBoard.get(i).get(i)!=null){
				//	return false;
				//	}
				//System.out.println(Board.chessBoard.get(x-extra).get(y+extra).getP());
				if (Board.idiot.get(this.getX()+extra).get(this.getY()+extra)==null){
					n+=1;
					
					}
					extra+=1;
				}
				
			}
		else if (y< this.getY() &&(this.getY()-y==x-this.getX())){
			for (int i=this.getX(); i<x-1;i++){
				//if (Board.chessBoard.get(i).get(i)!=null){
				//	return false;
				//	}
				
				if (Board.idiot.get(this.getX()+extra).get(this.getY()-extra)==null){
					n+=1;
					//System.out.println("hi");
					}
				extra+=1;
				}
				
			}
		}
	else if (x<this.getX()){
			if (y>this.getY()&&(y-this.getY()==this.getX()-x)){
			for (int i= x;i<this.getX()-1;i++){
				//if (Board.chessBoard.get(i).get(i)!=null){
				//	return false;
				//	}
				//System.out.println("hi");
				if (Board.idiot.get(this.getX()-extra).get(this.getY()+extra)==null){
					n+=1;
					}
				extra+=1;
				}
				
			}
		else if (y< this.getY() &&(this.getY()-y==this.getX()-x)){
			//System.out.println(Board.chessBoard.get(x).get(y));
			for (int i=x; i<this.getX()-1;i++){
				//if (Board.chessBoard.get(i).get(i)!=null){
				//	return false;
				//	}
				 if (Board.idiot.get(this.getX()-extra).get(this.getY()-extra)==null){
					n+=1;

					}
					
					extra+=1;
				}
			}
		
		}
		if (n>0){
		if (Board.idiot.get(x).get(y)!=null){
					//System.out.println("hi");
				if (Board.idiot.get(x).get(y).getW()!=this.getW()){
						n+=1;
						}
					}
		else if (Board.idiot.get(x).get(y)==null){
			n+=1;
			}}
		//System.out.println(n);
	if (Math.abs(this.getX()-x)==Math.abs(this.getY()-y)){
	if (n==Math.abs(this.getX()-x)){return true;}
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
