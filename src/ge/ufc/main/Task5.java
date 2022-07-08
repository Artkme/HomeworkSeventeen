package ge.ufc.main;

import java.io.*;
import java.util.TreeSet;

public class Task5 {

    public static void main(String[] args) throws IOException {
        readRectangles(args[0]);
    }

    public static void readRectangles(String address) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream(address), "UTF-8");
        BufferedReader br = new BufferedReader(isr);

        String line;
        TreeSet<Rectangle> rects = new TreeSet<>();
        while ((line = br.readLine()) != null) {
            String[] nums = line.split("-");
            if (!(isInt(nums[0]) && isInt(nums[1]))) {
                continue;
            }

            rects.add(new Rectangle(Integer.parseInt(nums[0]), Integer.parseInt(nums[1])));
        }
        br.close();

        String outAdd = "C:\\Users\\User\\HomeworkSeventeen\\src\\ge\\ufc\\main\\Rectangles_out.dat";
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(outAdd), "UTF-8");
        BufferedWriter bw = new BufferedWriter(osw);

        int count = 0;

        for (Rectangle r : rects) {
            count++;
            bw.write(String.valueOf(r.getHeight()) + "-" + String.valueOf(r.getWidth()));
            if (count != rects.size()) {
                bw.write("\n");
            }
        }
        bw.close();
    }

    public static boolean isInt(String txt){
        try {
            int inputAsInt = Integer.parseInt(txt);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }

    }
}
