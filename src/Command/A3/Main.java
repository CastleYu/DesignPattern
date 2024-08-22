package Command.A3;

import Command.A3.command.Command;
import Command.A3.command.MacroCommand;
import Command.A3.drawer.DrawCanvas;
import Command.A3.drawer.DrawCommand;

import javax.swing.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {
    // ���Ƽ�¼
    private final MacroCommand history = new MacroCommand();
    // ��������
    private final DrawCanvas canvas = new DrawCanvas(400, 400, history);
    // �h����
    private final JButton clearButton = new JButton("clear");

    // ������
    public Main(String title) {
        super(title);

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        canvas.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                Command cmd = new DrawCommand(canvas, e.getPoint());
                history.append(cmd);
                cmd.execute();
            }
        });
        clearButton.addActionListener(this);

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);
        getContentPane().add(mainBox);

        pack();
        setVisible(true);
    }

    // ActionListener��
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clearButton) {
            history.clear();
            canvas.repaint();
        }
    }

    public static void main(String[] args) {
        new Main("Command Pattern Sample");
    }
}
