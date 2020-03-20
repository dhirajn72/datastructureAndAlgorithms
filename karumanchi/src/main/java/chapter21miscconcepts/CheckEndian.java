

package chapter21miscconcepts;

import java.nio.ByteOrder;
public class CheckEndian {
	public static boolean isBigEndian() {
        return ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN);
    }
	public static boolean isLittleEndian() {
        return ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN);
    }
}
