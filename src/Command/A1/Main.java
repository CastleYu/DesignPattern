package Command.A1;

import Command.A1.command.Command;
import Command.A1.command.MacroCommand;
import Command.A1.drawer.ColorCommand;
import Command.A1.drawer.DrawCanvas;
import Command.A1.drawer.DrawCommand;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener, MouseMotionListener, WindowListener {
    // 绘制记录
    private final MacroCommand history = new MacroCommand();
    // 绘制区域
    private final DrawCanvas canvas = new DrawCanvas(400, 400, history);
    // 刪除键
    private final JButton clearButton = new JButton("clear");
    // 紅色键
    private final JButton redButton = new JButton("red");
    // 綠色键
    private final JButton greenButton = new JButton("green");
    // 藍色键
    private final JButton blueButton = new JButton("blue");

    // 构造子
    public Main(String title) {
        super(title);

        this.addWindowListener(this);
        canvas.addMouseMotionListener(this);
        clearButton.addActionListener(this);
        redButton.addActionListener(this);
        greenButton.addActionListener(this);
        blueButton.addActionListener(this);

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
        buttonBox.add(redButton);
        buttonBox.add(greenButton);
        buttonBox.add(blueButton);
        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);
        getContentPane().add(mainBox);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main("Command Pattern Sample");
    }

    // ActionListener用
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clearButton) {
            history.clear();
            canvas.init();
            canvas.repaint();
        } else if (e.getSource() == redButton) {
            Command cmd = new ColorCommand(canvas, Color.red);
            history.append(cmd);
            cmd.execute();
        } else if (e.getSource() == greenButton) {
            Command cmd = new ColorCommand(canvas, Color.green);
            history.append(cmd);
            cmd.execute();
        } else if (e.getSource() == blueButton) {
            Command cmd = new ColorCommand(canvas, Color.blue);
            history.append(cmd);
            cmd.execute();
        }
    }

    // MouseMotionListener用
    public void mouseMoved(MouseEvent e) {
    }

    public void mouseDragged(MouseEvent e) {
        Command cmd = new DrawCommand(canvas, e.getPoint());
        history.append(cmd);
        cmd.execute();
    }

    // WindowListener用
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    public void windowActivated(WindowEvent e) {
    }

    public void windowClosed(WindowEvent e) {
    }

    public void windowDeactivated(WindowEvent e) {
    }

    public void windowDeiconified(WindowEvent e) {
    }

    public void windowIconified(WindowEvent e) {
    }

    public void windowOpened(WindowEvent e) {
    }
}

