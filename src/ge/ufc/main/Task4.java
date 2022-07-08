package ge.ufc.main;

import java.io.*;
import java.util.HashSet;

public class Task4 {

    public static void main(String[] args) throws IOException {
        readCirclesUnique(args[0]);
    }

    public static void readCirclesUnique(String address) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream(address), "UTF-8");
        BufferedReader br = new BufferedReader(isr);

        HashSet<Circle> arrCircle = new HashSet<>();
        String line;
        int radius = 0;

        while ((line = br.readLine()) != null) {
            if (!(isInt(line))) {
                continue;
            }

            radius = Integer.parseInt(line);
            arrCircle.add(new Circle(radius));
        }
        br.close();

        String outAdd = "C:\\Users\\User\\HomeworkSeventeen\\src\\ge\\ufc\\main\\Circles_out_unique.dat";
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(outAdd), "UTF-8");
        BufferedWriter bw = new BufferedWriter(osw);

        int count = 0;

        for (Circle c : arrCircle) {
            count++;
            bw.write(String.valueOf(c.getRadius()));
            if (count != arrCircle.size()) {
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
