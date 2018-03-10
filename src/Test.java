
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Queue<String> stack=new Queue<>();
		String s="a";
		for(int i=0;i<2;i++){
			stack.enqueue(s);
		
			s=s+1;
		}
//		for(int i=0;i<20;i++){
//			System.out.println(stack.pop());
//		}
		for(String b:stack){
			System.out.println(b);
		}
	}

}
