//java.exe�� ����� ���ϴ� ���ڸ� �Ű������� �ѱ��,
//�� �Ű������� �ش��ϴ� �������� ����Ͻÿ�
class Test4 {
	//main�� �����ڰ� ���� ȣ���� �Ұ��ϸ�, ���������� ȣ���� �� �ִµ�,
	//�� ����� �ٷ� java.exe�� ���� ȣ��
	//java Test4 6  6�����
	public static void main (String[] args){ //let args=["aa","bb"]
		//js������ parseInt() �����Լ��� ����������,
		//java������ Wrapper Ŭ������ �����Ѵ�..

		int n=Integer.parseInt(args[0]); // "6"

		for(int i=1;i<=9;i++){
			System.out.println(n+"*"+i+"="+(n*i));
		}
	}
}
