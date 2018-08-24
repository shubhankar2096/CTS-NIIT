import java.util.*;
public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total_sec,hr,min,sec;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter total seconds:");
		total_sec=s.nextInt();
		hr=total_sec/3600;
		min=(total_sec-(hr*3600))/60;
		sec=total_sec-((hr*3600)+(min*60));
		System.out.println("H:M:S format is:");
		System.out.println(hr+":"+min+":"+sec);

	}

}
