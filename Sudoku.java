
public class Sudoku {

	public static boolean Correct(int x,int y, int[][] puzzle){
		String temp =" ";
		for(int i=0;i<9;i++){	
		    temp+=Integer.toString(puzzle[x][i]);
			temp+=Integer.toString(puzzle[i][y]);
			temp+=Integer.toString(puzzle[(x/3)*3+i/3][(y/3)*3+i%3]);
		 }
			
		int count=0,index=0;
		
		while ((index=temp.indexOf(Integer.toString(puzzle[x][y]), index))!=-1)	
		{
			count++;
			index++;
		}
	 	if(count==3)
	 		return true;
	 	else
	 		return false;
	 }
	
	
	public static int[][] SolvePuzzle(int x,int y,int[][]puzzle){
		while(!Correct(8,8,puzzle)|| puzzle[8][8]==0){
			if(puzzle[x][y]<9){
				puzzle[x][y]++;
			if(Correct(x,y,puzzle)){
				int x1,y1;
				if(y==8){
					y1=0;
					x1=x+1;
				}
				else
					{
						x1=x;y1=y+1;
					}
					SolvePuzzle(x1,y1,puzzle);
				}
			}
			
			else{
				puzzle[x][y]=0;
			
		break;	}
			
		}
		
		return puzzle;
	
	}
		public static void print(int [][]puzzle){
			for(int i=0;i<9;i++){
				for(int j=0;j<9;j++){
					System.out.print(puzzle[i][j]+" ");
				}
			System.out.println("");
			}
			
		}
	
	 
	 
	 
	 public static void main(String[] args) {
		
		  int [][] Puzzle= new int[][]{
				{0,0,3,0,2,0,6,0,0},
				{9,0,0,3,0,5,0,0,1},
				{0,0,1,8,0,6,4,0,0},
				{0,0,8,1,0,2,9,0,0},
				{7,0,0,0,0,0,0,0,8},
				{0,6,7,0,8,2,0,0,0},
				{0,2,6,0,9,5,0,0,0},
				{8,0,0,2,0,3,0,0,9},
				{0,0,5,0,1,0,3,0,0}
		};
	
			print(SolvePuzzle(0,0,Puzzle));
			
		}
		

	}




