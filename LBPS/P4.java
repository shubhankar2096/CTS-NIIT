import java.util.*;
public class P4 {
	public static void main(String[] args) {
		int curr_page_no;
		int no_of_digits;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter current page number:");
		curr_page_no=sc.nextInt();
		no_of_digits=sc.nextInt();
		int n=curr_page_no;
		int cnt=0;
		while(n>0)
		{
			cnt++;
			n=n/10;
		}
		int last_page_no=curr_page_no+(no_of_digits/cnt);
		System.out.println("Last page number that will be printed is:"+last_page_no);
	}
}
