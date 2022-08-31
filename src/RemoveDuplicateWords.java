
public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String str = "jagan mohan jagan mohan mylapuru";
		String res="";
		
		String[] arr = str.split(" ");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].equals(arr[j])) {
					arr[j]="remove";
				}
			}
		}
		
		for(String s: arr) {
			if(s!="remove") {
				res+=s+" ";
			}
		}
		System.out.println(res);

	}

}
