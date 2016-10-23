package full_guide.part_01.chapter_04._10_HexByte;

/**
 * Created by mega on 22.08.2016.
 */
// Маскирование двоичных разрядов расширения знака
public class HexByte {
    public static void main(String[] args) {
        char[] hex = {
                '0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
        };

        byte b = (byte) 0xf1; // 241

        System.out.println("b = 0x" + hex[(b >> 4) & 0x0f]
        + hex[b & 0x0f]);
    }
}
