
public class RemoveDuplicateChars {

	public static void main(String[] args) {
		String str = "jagan mohan jagan mohan mylapuru";
		char[] ch = str.toCharArray();
		
		String res ="";
		
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					ch[j]='r';
				}
			}
		}
		for(char c:ch) {
			if(c!='r') {
				res+=c;
			}
		}
		System.out.println(res);

	}

}
