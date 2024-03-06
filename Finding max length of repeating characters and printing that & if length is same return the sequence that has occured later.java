public class MyClass {
	private static void func(String str){
	
	String res="";
	String pres="";
	for(int i=0;i<str.length();i++){
	char ch=str.charAt(i);
	if(i!=0 && ch==pres.charAt(pres.length()-1)){
	pres+=ch+"";
	}else{
		if(i==0){
			res=pres=ch+"";
		}
	else if(res.length()<=pres.length()){
	res=pres;
	pres=ch+"";
	}
	}
	
	}
	
	if(res.length()<=pres.length()){
	res=pres;
	}
	System.out.println(res);
	}
    public static void main(String args[]) {
      func("aabbcc");  //output should be "cc"
	  
    }
}