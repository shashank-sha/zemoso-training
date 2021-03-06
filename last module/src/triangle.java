import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;


public class triangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a=null ;int rows=0,cols=0,row=0,col=0,present_row_len=0;
		File filename = new File("/home/sudhanshu/Desktop/Assignment/git_clone_repo/zemoso-training/triangle1.txt");
		try {
			InputStream stream = new FileInputStream(filename);
			BufferedReader buffer = new BufferedReader(new InputStreamReader(stream));
			String line;
			
			//No.of rows
			while((line=buffer.readLine()) != null){
				rows++;
			}
			
			stream = new FileInputStream(filename);
			buffer = new BufferedReader(new InputStreamReader(stream));
			
			//no.of columns
			while((line=buffer.readLine()) != null){
	            String[] vals = line.trim().split("\\s+");
	            //System.out.println(vals[0]);
	            present_row_len = vals.length;
	            //System.out.println(present_row_len);
			}
			cols=present_row_len;
			
			a=new int[rows][cols];
			
			stream = new FileInputStream(filename);
			buffer = new BufferedReader(new InputStreamReader(stream));
			
			//storing data into array
			while((line=buffer.readLine()) != null){
	            String[] vals = line.trim().split("\\s+");
	            present_row_len = vals.length;
	            while(col<present_row_len) {
	                a[row][col] = Integer.parseInt(vals[col]);
	                col++;
	            }
	            while(col<cols){
	            	a[row][col] = 0;
	                col++;
	            }
	            row++;
	            col=0;
			}
			
			
			for (int r = rows-1; r > 0; r--)
	            for (int c = 0; c < cols - 1; c++)
	                a[r - 1][c] += Math.max(a[r][c], a[r][c + 1]);

			System.out.print(a[0][0]);
			
			
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		

	}

}
