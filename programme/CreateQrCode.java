package org.CreateQrCode.seraphin.fr;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import lombok.Data;

import java.io.IOException;
import java.nio.file.Paths;

@Data
public class CreateQrCode {
    private String data;
    private String path;

    private static BitMatrix bitMatrix;

    public static void creationQrCode(String data, String path) throws WriterException, IOException {
        bitMatrix = new MultiFormatWriter().encode(data, BarcodeFormat.QR_CODE,2000,2000);
        MatrixToImageWriter.writeToPath(bitMatrix,"jpg", Paths.get(path));
        System.out.println("Creation QRCode avec succès");
    }


}
