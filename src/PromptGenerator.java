import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by sherryyuan on 15-11-28.
 */
public class PromptGenerator {
    List<String> lines;

    public PromptGenerator(){
        lines = new ArrayList<String>();
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new InputStreamReader
                    (this.getClass().getResourceAsStream("US.dic")));
            String line = null;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public String generateWord(){
        Random rand = new Random();

        int  n = rand.nextInt(lines.size()) + 1;

        return lines.get(n);
    }
}
