
public class Ex09 {

	public static void main(String[] args) {
	     boolean flag = gugudan();
	      
	      if (flag == true)
	         System.out.println("��� ����");
	      else
	         System.out.println("��� ����");
	         
	   }
	   
	   //4)  ��(x), ���(O)
	   public static boolean gugudan() {
	      
	      boolean flag = true;
	      int n = 3;
	      
	      System.out.println("�Է��� " + n + "�� ���");
	      for(int i=1; i<=9; i++)
	         System.out.println(n*i);
	      
	      return flag;
	}

}