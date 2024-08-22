package State;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class SafeFrame extends Frame implements ActionListener, Context { 
    private final TextField textClock = new TextField(60);	// �������ʱ��
    private final TextArea textScreen = new TextArea(10, 60);	// �����������
    private final Button buttonUse = new Button("ʹ�ý��");	// ʹ�ý��İ���
    private final Button buttonAlarm = new Button("����");	// ����İ���
    private final Button buttonPhone = new Button("һ��ͨ��");	// һ��ͨ���İ���
    private final Button buttonExit = new Button("����");		// �����İ���
 
    //private State state = DayState.getInstance();		// ����״̬ 
    private State state = NightState.getInstance();		// ����״̬ 
 
    // ������ 
    public SafeFrame(String title) { 
        super(title); 
        setBackground(Color.lightGray); 
        setLayout(new BorderLayout()); 
        // ���textClock 
        add(textClock, BorderLayout.NORTH); 
        textClock.setEditable(false); 
        // ���textScreen 
        add(textScreen, BorderLayout.CENTER); 
        textScreen.setEditable(false); 
        // �Ѱ����ŵ������ 
        Panel panel = new Panel(); 
        panel.add(buttonUse); 
        panel.add(buttonAlarm); 
        panel.add(buttonPhone); 
        panel.add(buttonExit); 
        // ������ 
        add(panel, BorderLayout.SOUTH); 
        // ����������� 
        pack(); 
        show(); 
        // �趨��������� 
        buttonUse.addActionListener(this); 
        buttonAlarm.addActionListener(this); 
        buttonPhone.addActionListener(this); 
        buttonExit.addActionListener(this); 
    } 
    // �����˰��°��������������� 
    public void actionPerformed(ActionEvent e) { 
        System.out.println("" + e); 
        if (e.getSource() == buttonUse) {           // ʹ�ý��İ��� 
            state.doUse(this); 
        } else if (e.getSource() == buttonAlarm) {  // ����İ��� 
            state.doAlarm(this); 
        } else if (e.getSource() == buttonPhone) {  // һ��ͨ���İ��� 
            state.doPhone(this); 
        } else if (e.getSource() == buttonExit) {   // �����İ��� 
            System.exit(0); 
        } else { 
            System.out.println("?"); 
        } 
    } 
    // �趨ʱ�� 
    public void setClock(int hour) { 
        String clockstring = "����ʱ����"; 
        if (hour < 10) { 
            clockstring += "0" + hour + ":00"; 
        } else { 
            clockstring += hour + ":00"; 
        } 
        System.out.println(clockstring); 
        textClock.setText(clockstring); 
        state.doClock(this, hour); 
    } 
    // ״̬�仯 
    public void changeState(State state) { 
        System.out.println("״̬�Ѿ���" + this.state + "���" + state + "��"); 
        this.state = state; 
    } 
    // ���б������� 
    public void callSecurityCenter(String msg) { 
        textScreen.append("call! " + msg + "\n"); 
    } 
    // �������ı�����¼ 
    public void recordLog(String msg) { 
        textScreen.append("record ... " + msg + "\n"); 
    } 
}
