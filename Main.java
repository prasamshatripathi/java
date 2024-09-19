import javax.swing.JButton;
import javax.swing.JFrame;

public class main {

    static void main(string[] args) {
        Myframe myframe = new Myframe();

    }
}

public class Myframe extends Jframe {

    Myframe() {
        JButton button = new JBUtton();
        button.setBounds(200, 100, 100, 50);

        this.setDefaultCloseOperation(Jfrane.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
    }

}