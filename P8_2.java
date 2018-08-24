
public class P8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k,z=1;
			for(i=5;i>=1;i--)
			{
				for(j=1;j<i;j++)
				{
					System.out.print(" ");
				}
				for(k=1;k<=z;k++)
				{
					System.out.print("*");
				}
				z+=2;
				System.out.println();
			}

	}

}
