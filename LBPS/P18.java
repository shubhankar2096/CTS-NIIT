import java.util.Scanner;
class Matrix
{
	void rotateMatrix()
	{
		int i,j;
		int row,col;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows and columns in matrix:");
		row=sc.nextInt();
		col=sc.nextInt();
		int mat[][]=new int[row][col];
		System.out.println("Enter the n*n matrix:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix after rotating in 90 degrees is:");
		for(i=0;i<row;i++)
		{
			for(j=col-1;j>=0;j--)
			{
				System.out.print("\t"+mat[j][i]);
			}
			System.out.println();
		}
	}
}
public class P18 {

	public static void main(String[] args) {
		Matrix m=new Matrix();
		m.rotateMatrix();
	}

}
