package sanity;

import com.sunbird.PageActions.DashboardPageActions;
import com.sunbird.PageActions.LoginPageActions;
import com.sunbird.PageActions.OnBoardingActions;
import org.testng.annotations.Test;

import java.util.Base64;

public class EncodeText {
    public static void main(String[] args) {
    String username = "mercury";
    // Encode Username
    byte[] encodedByte = Base64.getEncoder().encode(username.getBytes());
    String encodedText = new String(encodedByte);
  System.out.println("Encoded Username : "+encodedText);

    //Decode Username
    byte[] decodedByte = Base64.getDecoder().decode(encodedByte);
    String decodedText = new String(decodedByte);
  System.out.println("Decoded Username : " +decodedText);

}
    @Test(description = "Creator should be able to add siblings and child in the toc and click on save as draft button")
    public void CreatorAbleToAddSibilingAndChildToColelctionAndSaveAsDraft() throws Exception {
/*String username="contentreviewerTN@yopmail.com";
String password="Test@123";

			String usernameEncrypt = EncoderAndDecoder.getEncodedText(username);
		String passwordEncrypt=  EncoderAndDecoder.getEncodedText(password);
		String usrName = EncoderAndDecoder.getdecodedText(usernameEncrypt);
		String pwd = EncoderAndDecoder.getdecodedText(passwordEncrypt);

		System.out.println(("EncryptedUsrName " +usernameEncrypt));
		System.out.println(("EncryptedPwd " +passwordEncrypt));

		System.out.println(("decryptedUsrName " +usrName));
		System.out.println(("decryptedPwd " +pwd));*/

        String username="Y29udGVudHJldmlld2VyVE5AeW9wbWFpbC5jb20";
        String password="VGVzdEAxMjM=";


        String usrName = EncoderAndDecoder.getdecodedText(username);
        String pwd = EncoderAndDecoder.getdecodedText(password);

        System.out.println(("decryptedUsrName " +usrName));
        System.out.println(("decryptedPwd " +pwd));

        OnBoardingActions.RolePoup();
        OnBoardingActions.BMCPopup();
        OnBoardingActions.LocationPopup();
        LoginPageActions.Login(usrName,pwd);
        DashboardPageActions.clickUserProfileIcon();

    }

}