class Arr3
{
	void arrCommon(int[] arr1,int[] arr2)
	{
		int i,j,cnt=0;
		int op1[]=new int[20];
		int op2[]=new int[20];
		for(i=0;i<arr1.length;i++)
		{
			for(j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					op1[cnt++]=arr1[i];
				}
			}
		}
		int temp;
		int cnt1=0;
		for(i=0;i<cnt;i++)
		{
			for(j=i+1;j<cnt;j++)
			{
				if(op1[i]!=op1[j] && i!=j)
				{
					op2[cnt++]=op1[i];
				}
			}
		}
			
	}
}
public class P16 {

	public static void main(String[] args) {
		

	}

}

/*Intersection and Union of 2 arrays
https://www.geeksforgeeks.org/find-union-and-intersection-of-two-unsorted-arrays/*/
