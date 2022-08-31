
public class ShiftElementstoLeft {

	public static void main(String[] args) {
		int[] a = new int[] {74,85,78,12,48,95,35,75};
		int n =2;
		for(int i=0;i<n;i++) {
			int j,first;
			first = a[0];
			for(j=0;j<a.length-1;j++) {
				a[j]=a[j+1];
			}
			a[j]=first;
		}
		
		System.out.println("Array after left rotation: ");  
        for(int i = 0; i< a.length; i++){  
            System.out.print(a[i] + " ");  
        }
		/*for(int i:a) {
			System.out.println(i+"  ");
		}*/
	}

}
