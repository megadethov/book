package ua.mega.channel;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileChannelSimple {
    public static void main(String[] args) throws IOException {

         FileChannel input = FileChannel.open(Paths.get("lecture_11/src/file.txt"), StandardOpenOption.READ);

        FileChannel output = FileChannel.open(Paths.get("file2.txt"),
                StandardOpenOption.WRITE,
                StandardOpenOption.CREATE,
                StandardOpenOption.TRUNCATE_EXISTING);

        ByteBuffer buffer = ByteBuffer.allocate(1024 * 16);
        while (input.read(buffer) != -1) {
            buffer.flip();
            output.write(buffer);
            buffer.compact();
//            buffer.clear();


            // TODO: AsynchronousFileChannel

        }
    }
}
