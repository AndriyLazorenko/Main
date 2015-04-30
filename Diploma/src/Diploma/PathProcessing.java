package Diploma;

import java.io.*;

/**
 * Created by Master on 28-Apr-15.
 */
public abstract class PathProcessing {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private boolean locationIsCorrect;
    private String fileLocation;
    private String adjustedFileLocation;
    private String fileName;
    private FileReader fileReader;

    public abstract FileReader input() throws IOException;

    public BufferedReader getBr() {
        return br;
    }

    public void setBr(BufferedReader br) {
        this.br = br;
    }

    public boolean isLocationIsCorrect() {
        return locationIsCorrect;
    }

    public void setLocationIsCorrect(boolean locationIsCorrect) {
        this.locationIsCorrect = locationIsCorrect;
    }

    public String getFileLocation() {
        return fileLocation;
    }

    public void setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    public String getAdjustedFileLocation() {
        return adjustedFileLocation;
    }

    public void setAdjustedFileLocation(String adjustedFileLocation) {
        this.adjustedFileLocation = adjustedFileLocation;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public FileReader getFileReader() {
        return fileReader;
    }

    public void setFileReader(FileReader fileReader) {
        this.fileReader = fileReader;
    }
}
