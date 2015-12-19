import javax.swing.*;
import java.awt.*;
import java.io.IOException;

/**
 * Created by sherryyuan on 15-11-28.
 */
public class App {

    private final int HEIGHT;
    private final int WIDTH;

    public static App app;

    public App(){
        HEIGHT = 300;
        WIDTH = 300;

        JFrame jframe = new JFrame();
        jframe.setLayout(new GridLayout(5,0));
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(WIDTH, HEIGHT);
        jframe.setResizable(false);
        jframe.setVisible(true);

        String s1;
        String s2;
        String s3;
        String s4;
        String s5;

        PromptGenerator promptGenerator = new PromptGenerator();

        s1 = promptGenerator.generateWord();
        JLabel label1 = new JLabel();
        jframe.add(label1);
        label1.setText(s1);
        label1.setHorizontalAlignment(JLabel.CENTER);

        s2 = promptGenerator.generateWord();
        JLabel label2 = new JLabel();
        jframe.add(label2);
        label2.setText(s2);
        label2.setHorizontalAlignment(JLabel.CENTER);

        s3 = promptGenerator.generateWord();
        JLabel label3 = new JLabel();
        jframe.add(label3);
        label3.setText(s3);
        label3.setHorizontalAlignment(JLabel.CENTER);

        s4 = promptGenerator.generateWord();
        JLabel label4 = new JLabel();
        jframe.add(label4);
        label4.setText(s4);
        label4.setHorizontalAlignment(JLabel.CENTER);

        s5 = promptGenerator.generateWord();
        JLabel label5 = new JLabel();
        jframe.add(label5);
        label5.setText(s5);
        label5.setHorizontalAlignment(JLabel.CENTER);
    }

    public static void main(String[] args){
        app = new App();
    }
}
