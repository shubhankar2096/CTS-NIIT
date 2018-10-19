class Patt
{
	boolean search(int[] input)
	{
		int i;
		for(i=0;i<input.length-2;i++)
		{
			if(input[i]==1 && input[i+1]==2 && input[i+2]==3)
					{
						return true;
					}
		}
		return false;
	}
}
public class P9 {

	public static void main(String[] args) {
		Patt p=new Patt();
		int[] input= {2,1,4,1,2,3,6};
		int[] input1= {1,2,1,3,4,5,8};
		boolean res=p.search(input);
		boolean res1=p.search(input1);
		System.out.println("Array1 contains given sequence:"+res);
		System.out.println("Array2 contains given sequence:"+res1);
	}

}
