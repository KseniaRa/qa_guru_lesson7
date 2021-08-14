package quru.qa;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.zip.ZipException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static utils.Zip.unzip;

public class ZipTest {
    @Test
    void zipTest() throws IOException, ZipException, net.lingala.zip4j.exception.ZipException {
        String zipFilePath = "./src/test/resources/1.zip";
        String unzipFolderPath = "./src/test/resources/unzip";
        String password = "12345";
        String unzipTxtFilePath = "./src/test/resources/unzip/sample.txt";
        String expectedText = "Thanks";

        unzip(zipFilePath, unzipFolderPath, password);

        File txt = new File(unzipTxtFilePath);
        String actualText = FileUtils.readFileToString(txt, StandardCharsets.UTF_8);
        assertThat(actualText, containsString(expectedText));
    }
}
