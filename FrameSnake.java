import javax.swing.JFrame;

public class FrameSnake extends JFrame{
    private static final long serialVersionUID = 1L;

    FrameSnake(){


        this.add(new PanelSnake());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }

}
