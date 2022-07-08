package ge.ufc.main;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Task3 {

    public static void main(String[] args) throws IOException {
        readCircles(args[0]);
    }

    public static void readCircles(String address) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream(address), "UTF-8");
        BufferedReader br = new BufferedReader(isr);

        ArrayList<Circle> arrCircle = new ArrayList<>();
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
        Collections.sort(arrCircle);

        String outAdd = "C:\\Users\\User\\HomeworkSeventeen\\src\\ge\\ufc\\main\\Circles_out.dat";
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
