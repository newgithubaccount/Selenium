package testing.com.SeleneiumB3;

import org.testng.annotations.Test;

public class GroupsDemo {
	
	@Test(groups={"sanity","regression"})
	public void login()
	{
		System.out.println("i am login");
	}
	
	@Test(groups={"regression","p1"})
	public void findFriends()
	{
		System.out.println("i am findfriends");
	}
	
	@Test(groups="regression")
	public void sendMessage()
	{
		System.out.println("i will test send message");
	}
	

}
