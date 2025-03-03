package stringprogram;

public class Fibonacciseries {
	public static void main(String[] args) {
		long l=0, l1=1;
		for(int i=0;i<=500;i++)
		{
			System.out.println("New Line added");
			System.out.print(l+" ");
			long l2=l+l1;
			l=l1;
			l1=l2;
			System.out.println("Code updated");
			}
	}
}
