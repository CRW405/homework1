package homework1;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class byteReader {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        byte[] bytes = getFileBytes("./half_gaps.bin");

        int[] gaps = convertBytes(bytes);

        int[] cumsum = cumsum(gaps);

        int[] modifiedCumSum = modifyCumSum(cumsum);
        double endTime = (System.nanoTime() - startTime) / Math.pow(10, 9);

        int[] first15 = first15(modifiedCumSum);
        int[] last15 = last15(modifiedCumSum);

        for (int i : first15) {
            System.out.println("23" + i);
        }

        for (int i : last15) {
            System.out.println("23" + i);
        }

        System.out.println(endTime);
    }

    public static byte[] getFileBytes(String path) {
        byte[] bytes = null;
        try {
            bytes = Files.readAllBytes(Paths.get(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        // System.out.println("bytes gotten");
        return bytes;
    }

    public static int[] convertBytes(byte[] bytes) {
        int[] gaps = new int[bytes.length];
        for (int i = 0; i < bytes.length; i++)
            gaps[i] = Byte.toUnsignedInt(bytes[i]);
        // System.out.println("bytes converted");
        return gaps;
    }

    public static int[] cumsum(int[] gaps) {
        // System.out.println("cumsum started");
        int[] cumsum = new int[gaps.length];

        for (int i = 0; i < gaps.length; i++) {
            int cumsumAti = 0;

            cumsumAti += i;

            cumsum[i] = cumsumAti;
        }

        return cumsum;
    }

    public static int[] modifyCumSum(int[] cumsum) {
        int[] modifiedCumSum = new int[cumsum.length];

        for (int i = 0; i < cumsum.length; i++) {
            modifiedCumSum[i] = (cumsum[i] * 2) + 3;
        }

        return modifiedCumSum;
    }

    public static int[] last15(int[] array) {
        int[] last15 = new int[15];

        for (int i = 0; i < last15.length; i++) {
            last15[i] = array[array.length - 16 + i];
        }

        return last15;
    }

    public static int[] first15(int[] array) {
        int[] first15 = new int[15];

        for (int i = 0; i < first15.length; i++) {
            first15[i] = array[i];
        }

        return first15;
    }
}