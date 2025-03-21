
public class UpperCase {
	public static void main(String[] args) {
		upper('A');
		upper('a');
		upper('B');
		upper('b');
		upper('C');
		upper('c');
		upper('D');
		upper('d');
		upper('Z');
		upper('z');
		upper('Y');
		upper('y');
		
	}
	public static void upper(char ch) {
		if(ch>=65 && ch<=90) {
		ch+=32;}
		System.out.println(ch);
	}
}
