package ge.ufc.main;

import java.io.*;
import java.util.TreeSet;

public class Task6 {

    public static void main(String[] args) throws IOException {
        readTriangles(args[0]);
    }

    public static void readTriangles(String address) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream(address), "UTF-8");
        BufferedReader br = new BufferedReader(isr);

        String line;
        TreeSet<Triangle> tris = new TreeSet<>(new ReverseCmp());

        while ((line = br.readLine()) != null) {
            String[] nums = line.split("-");
            if (!(isInt(nums[0]) && isInt(nums[1]) && isInt(nums[2]))) {
                continue;
            }

            tris.add(new Triangle(Integer.parseInt(nums[0]), Integer.parseInt(nums[1]), Integer.parseInt(nums[1])));
        }
        br.close();

        String outAdd = "C:\\Users\\User\\HomeworkSeventeen\\src\\ge\\ufc\\main\\Triangles_out.dat";
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(outAdd), "UTF-8");
        BufferedWriter bw = new BufferedWriter(osw);

        int count = 0;

        for (Triangle t : tris) {
            count++;
            bw.write(String.valueOf(t.getSideA()) + "-" + String.valueOf(t.getSideB()) + "-" + String.valueOf(t.getSideC()));
            if (count != tris.size()) {
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