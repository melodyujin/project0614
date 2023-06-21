//java.exe 실행 시 원하는 수를 매개변수로 넘겨 짝수, 홀수 여부를 출력하는 코드를 작성하세요
class Test6{
	public static void main(String[]args){

		int n=Integer.parseInt(args[0]);
		if(n%2==0){
			System.out.print("짝수입니다");
		}else{
			System.out.print("홀수입니다");
		}
	}
}
