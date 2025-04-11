package JavaIntermediate;

public class Stringhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String str ="bye";
//		String str1 = new String("bye");
//		String str2 = " bye ";
//		
//		if(str.equals(str2)) {
//			System.out.println("both are same");
//		}else {
//			System.out.println("both are diffrent.");
//		}
		
//		
//		long start,end;
//		start =System.nanoTime();
//		String str ="welcome to";
//		for(int i=1;i<1000;i++) {
//			str+="logipool";
//		}
//		end=System.nanoTime();
//		System.out.println("String takes "+(end-start)+" nano mili sec");
		
		
		
//		char ch[]= {'s','u','r','a','j'};
//		String str3="nik";
//		
//		str3.getChars(0, 2, ch, 0);
//		
//		System.out.println(str3);
		
		String str4 ="abhi";
		String str5 ="Abhi";
		
		System.out.println(str4.compareTo(str5));			
		// 0 only if same
		System.out.println(str4.compareToIgnoreCase(str5));
		
		String str6 ="hello world java intro";
		String str7=str6.substring(6);
		String str8=str6.substring(6,16);
		System.out.println(str7);
		System.out.println(str8);
		
		
		String str9 ="  ghibli  ";
		
		String str10 =str9.replace('i', 'a');
		System.out.println(str10);
		
		
		
		
		
		
		
	}

}
