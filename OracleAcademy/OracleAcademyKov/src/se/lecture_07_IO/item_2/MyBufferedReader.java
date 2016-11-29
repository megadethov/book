package se.lecture_07_IO.item_2;

import java.io.*;

public class MyBufferedReader {
    public static void main(String[] args) {
        String source = "src\\se\\lecture_07_IO\\item_2\\readEx.txt";
        String dest = "src\\se\\lecture_07_IO\\item_2\\writeEx.txt";

        Reader reader = null;
        BufferedReader bufferedInput = null;
        PrintWriter printWriter = null;

        try {
            reader = new FileReader(source); // читаем
            bufferedInput = new BufferedReader(reader); // decorator
            printWriter = new PrintWriter(new File(dest));

            String line;

            while ((line = bufferedInput.readLine()) != null) { // читаем строками, проверка на null
                System.out.println(line);
                printWriter.println(line); // каждый раз перезаписывает файл заново, при вызове auto-flush
//                printWriter.write(line); // каждый раз перезаписывает файл заново.
            }
            printWriter.flush(); // если не сделать flush и не закрыть ресурсы - двнные могут залипнуть в буфере

        } catch (FileNotFoundException e) {
            System.out.println("Can not find current file");
        } catch (IOException e2) {
            e2.printStackTrace();
        } finally { // при закрытии ресурсов автоматически - flush
            if (printWriter != null) {
                printWriter.close();
            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
