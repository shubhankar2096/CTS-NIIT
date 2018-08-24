
/*public class P9_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char i,j,k,z='A',p;
		for(i='E';i>='A';i--)
		{
			for(j='A';j<i;j++)
			{
				System.out.print(" ");
			}
			//p=++j;
			for(k='A';k<=z;k++)
			{
				System.out.print(k);
			}
			z++;
			System.out.println();
		}

	}

}
*/


public class P9_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char i,j,k,z='A',p;
		for(i='A';i<='E';i++)
		{
			for(j='E';j>i;j--)
			{
				System.out.print(" ");
			}
			//p=++j;
			for(k=j;k>=z;k--)
			{
				System.out.print(k);
			}
			//z++;
			System.out.println();
			//System.out.println(z);
		}

	}

}

/*Output
    A
   BA
  CBA
 DCBA
EDCBA
*/