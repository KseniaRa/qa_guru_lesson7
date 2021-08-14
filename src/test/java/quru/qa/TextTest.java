package quru.qa;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static utils.Files.readTextFromPath;

public class TextTest {
    @Test
    void textTest() throws IOException {
        String FilePath = "src/test/resources/text.txt";
        String expectedData = "CHAPTER I";

        String actualData = readTextFromPath(FilePath);

        assertThat(actualData, containsString(expectedData));
    }
}
