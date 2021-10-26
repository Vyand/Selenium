

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Properties;

//import javax.mail.
import javax.mail.*;

//import javax.annotation.processing.Filer;
//import java.util.*;
//import org.openqa.selenium.remote.server.Session;

public class OutlookMailReader 
{

    public static String conn(String mailFolderName, String emailSubjectContent,String emailContent,int lengthOfOTP) 
    {        
        
        String hostName = "";
        String username = "";
        String password = "";
        int messageCount;
        int unreadMsgCount;
        String emailSubject;
        String searchText = null;
        Properties sysProps = System.getProperties();
        //Properties sysProps = new Properties();
        
        sysProps.setProperty("mail.store.protocol", "imaps");
        
        try {
            Session session = Session.getDefaultInstance(sysProps, null);
            Store store = session.getStore("imaps");
            store.connect(hostName, username, password);
            Folder emailbox =store.getFolder(mailFolderName);
            emailbox.open(Folder.READ_WRITE);
            messageCount = emailbox.getMessageCount();
            System.out.println(messageCount + " messages in your email");
            unreadMsgCount = emailbox.getUnreadMessageCount();
            System.out.println(unreadMsgCount + " unread messages in your email");
            for (int i=messageCount; i>(messageCount-unreadMsgCount); i--) {
                Message emailMessage = emailbox.getMessage(i);
                emailSubject = emailMessage.getSubject();
                if (emailSubject.contains(emailSubjectContent)) {
                    System.out.println("OTP has been found");
                    String line;
                    StringBuffer buffer = new StringBuffer();
                    BufferedReader reader = new BufferedReader(new InputStreamReader(emailMessage.getInputStream()));
                    while ((line = reader.readLine()) != null) {
                        buffer.append(line);
                        }
            String messageContent = emailContent;
            String result = buffer.toString().substring(buffer.toString().indexOf(messageContent));
            searchText = result.substring(messageContent.length(), messageContent.length()+lengthOfOTP);
            System.out.println("OTP email found");
            emailMessage.setFlag(Flags.Flag.SEEN, true);
            break;
                }
            emailMessage.setFlag(Flags.Flag.SEEN, true);
                    
                }
            emailbox.close(true);
            store.close();
            
        }catch (Exception mex)
        {
            mex.printStackTrace();
            System.out.println("OTP email not found");
            
            }
        return searchText;
    }
        
    public static void main(String[] args) 
    {
            // TODO Auto-generated method stub
        
        conn("INBOX", "Welcome Testtest", "Welcome Testtest", 6 );

    }

}