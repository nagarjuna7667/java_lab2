import java.util.Random;
public class Experiment_7
{
	public static void main(String[] args) {
	    Random rn=new Random();
		int count=0;
		int ar1[] = new int[1000];
		int ar2[] = new int[1000];
		System.out.println("pair od dices with same number are");
		for(int i=0;i<1000;i++){
		    ar1[i]=rn.nextInt(6);
		    ar2[i]=rn.nextInt(6);
		    System.out.print("( "+ar1[i]+","+ar2[i]+" )/t");
		    if(ar1[i]==ar2[i])
		        count++;
		}
		System.out.println("Number of doubles = "+count);
	}
}