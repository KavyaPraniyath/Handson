
public class ChatCount {

	public static void charCount(String s) {
		int len=s.length();
		char ch=' ';
		int cur_count=1;
		for(int i=0;i<len;i++) {
			
			if(i<len-1 && s.charAt(i)==s.charAt(i+1)) {
				cur_count++;
			}
			else {
				ch=s.charAt(i);
				System.out.print(ch+""+cur_count);
				cur_count=1;
			}
		}		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aaabbbbbccccdaa";
		charCount(str);
	}

}
