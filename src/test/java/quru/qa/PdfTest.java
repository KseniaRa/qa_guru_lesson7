package quru.qa;

import com.codeborne.pdftest.PDF;
import com.codeborne.pdftest.assertj.Assertions;
import org.junit.jupiter.api.Test;

import java.io.InputStream;

public class PdfTest {

    @Test
    void pdfTest() throws Exception {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream stream = classLoader.getResourceAsStream("pdf sample.pdf");
         PDF pdfFile = new PDF(stream);
        Assertions.assertThat(pdfFile).containsText("Congratulations");



    }
}

