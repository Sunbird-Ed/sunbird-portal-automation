package sanity;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.PageActions.OnBoardingActions;
import org.testng.annotations.Test;

public class FirstStep4 extends BaseTestConfig {


	@Test
public void BMCPopup() throws InterruptedException
{
		//Thread.sleep(8000);
		//OnBoardingActions.RolePoup();
		OnBoardingActions.BMCPopup();

//String get=UtilityFunctions.generate_Do_id();
//System.out.println(get);
//
//
//String randomName=UtilityFunctions.generateRandomName("Course_");
//System.out.println(randomName);
//
//
//	LoginPageActions.fetchText();

}

}
