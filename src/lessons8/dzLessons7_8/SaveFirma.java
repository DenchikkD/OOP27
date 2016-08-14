package lessons8.dzLessons7_8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Denni on 15.08.2016.
 */
public class SaveFirma {

    private SaveFirma() {
    }

    public static void saveFirma(String addressFile, Firma firma) throws IOException {
        FileWriter writerFirm = new FileWriter(addressFile, true);
       writerFirm.write(String.valueOf(new Date(System.currentTimeMillis())));
        writerFirm.write(firma.toString());
        writerFirm.flush();
    }
}
