package ArtCode.Hometasks.hometask4;

import java.util.Properties;

/**
 * Created by Master on 23-May-15.
 */
public class DownloaderProperties {
    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    private Properties properties;

    public DownloaderProperties(Properties properties){
        this.properties = properties;
    }

}
