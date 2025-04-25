package org.CreateQrCode.seraphin.fr;
import com.google.zxing.WriterException;
import java.io.IOException;
public class GenerateQrCode {
    public static void main(String[] args) throws IOException, WriterException {

        String data = "https://www.linkedin.com/in/s%C3%A9raphin-noche-bopda-42bb64190/";
        String path = "/Users/serap/Desktop/mon_bébé_Diane.jpg";

        CreateQrCode createQrCode = null;
        createQrCode.creationQrCode(data,path);
    }
}
