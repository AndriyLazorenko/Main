package Diploma;

import java.io.*;

/**
 * Created by Lazorenko on 21.04.2015.
 */
public class FileInput extends PathProcessing {

    //Ask user about file location with data to be read. Cycle makes sure the program runs until the correct file location is found

    public FileReader input() throws IOException {

        do {
            setLocationIsCorrect(true);
            System.out.println("Insert file location from Windows Explorer");
            setFileLocation(getBr().readLine());
            setAdjustedFileLocation(getFileLocation().replaceAll("\\\\", "\\\\\\\\"));
            if (getAdjustedFileLocation().contains(".txt")) {

            } else {
                System.out.println("Insert file name in following format: Filename.txt");
                setFileName(getBr().readLine());
                setAdjustedFileLocation(getAdjustedFileLocation() + "\\\\\\\\" + getFileName());
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
