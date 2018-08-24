
public class P9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,z=0;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("\t"+(j+z));
			}
			z=z+i;
			System.out.println();
		}

	}

}
