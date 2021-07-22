package quru.qa;

import com.codeborne.xlstest.XLS;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

public class XlsTest {

    @Test
    void simpleXlsTest() throws Exception {
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            InputStream stream = classLoader.getResourceAsStream("XLS sample.xls");
            XLS xlsFile = new XLS(stream);
            Assertions.assertEquals("Unknow", xlsFile.excel.getSheetAt(0).
                    getRow(12).getCell(2).getStringCellValue());
        }
    }

