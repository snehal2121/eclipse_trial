package timestamp_java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CreateFileWithTimestamp {

    public static void main(String[] args)
    {
     //CreateFileWithTimeStamp("");

    	
    	 String filePath ="c:\\temp";
       /// String filePath = System.getProperty("user.dir");
        //create a new file with Time Stamp
        File file = new File(filePath + "\\" +GetCurrentTimeStamp().replace(":","_").replace(".","_")+".csv");

        try {
            if (!file.exists()) {
                file.createNewFile();
               // System.out.println("File is created; file name is " + file.getName());
            } else {
                System.out.println("File already exist");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        // Get current system time
    public static String GetCurrentTimeStamp() {
        SimpleDateFormat sdfDate = new SimpleDateFormat(
                "yyyy-MM-dd HH:mm:ss.SSS");// dd/MM/yyyy
        Date now = new Date();
        String strDate = sdfDate.format(now);
        return strDate;
    }
   


}
