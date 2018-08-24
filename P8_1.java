
public class P8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k,z=1;
		for(i=5;i>=1;i--)//for row
		{
			for(j=1;j<i;j++)//for space in col
			{
				System.out.print(" ");
			}
			
			for(k=1;k<=z;k++)//for * in col
			{
				System.out.print("*");
			}
			z++;
			System.out.println();
		}

	}

}

