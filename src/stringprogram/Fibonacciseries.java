package stringprogram;

public class Fibonacciseries {
	public static void main(String[] args) {
		int l=0, l1=1;
		for(int i=0;i<=6;i++)
		{
			System.out.print(l+" ");
			int l2=l+l1;
			l=l1;
			l1=l2;
			}
	}
}
