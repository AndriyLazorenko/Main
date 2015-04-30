package Diploma;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Master on 28-Apr-15.
 */
public class FolderInput extends PathProcessing {

    @Override
    public FileReader input() throws IOException {
        do {
            setLocationIsCorrect(true);
            System.out.println("Insert file location from Windows Explorer");
            setFileLocation(getBr().readLine());
            setAdjustedFileLocation(getFileLocation().replaceAll("\\\\", "\\\\\\\\"));
            if (getAdjustedFileLocation().contains(".txt")) {

                //Add algorithm to work with file location. Think on some sort of check

            }
            else {

            }

            //Checking the file path

            try {
                setFileReader(new FileReader(getAdjustedFileLocation()));
            } catch (FileNotFoundException e) {
                System.err.println("File location is incorrect. Try again =)");
                setLocationIsCorrect(false);
            }
        } while (isLocationIsCorrect() == false);
        return getFileReader();
    }
}
