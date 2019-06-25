import com.fyy.po.Users;

public class test {	
	
	public static void say() {
		Users user=new Users();
		user.setUserId("123123");
		System.out.println(user.toString());
		
	}
	
	public static void main(String[] args) {
		say();
	}
}
