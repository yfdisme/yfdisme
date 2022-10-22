import org.junit.jupiter.api.Test;

import java.io.*;

public class DependenceTests {
    @Test
    void main() {
        File file = new File("D:/AA/github/yfdisme/tree.txt");
        StringBuilder stringBuilder = new StringBuilder();

        try (
                //创建一个filereader 读取文件
                FileReader fileReader = new FileReader(file);
                //创建一字符缓冲输入流
                BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String readLine;
            while ((readLine = bufferedReader.readLine()) != null) {
                if (readLine.contains("[INFO] org.yfd")) {
                } else if (readLine.contains("[INFO] +- ")) {
                } else if ("[INFO] ".equals(readLine)) {
                } else {
                    continue;
                }
                readLine = readLine.replace("[INFO] ", "").replace("+- ", "│        └──");
                stringBuilder.append(System.lineSeparator()).append(readLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(stringBuilder);
        //
    }
}
