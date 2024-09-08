package exam;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonTest extends JFrame{
	
	public ButtonTest() {
		//레이어를 지정한다
		this.setLayout(new FlowLayout());
		JButton btn1 = new JButton("클릭"); //클릭 버튼 생성
		add(btn1);                         //버튼 추가
		btn1.setBackground(Color.green); //버튼 색변경
		
		btn1.addActionListener(new ActionListener() { //ActionListener F3 눌러보면 어떻게 구현되는 보임
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼클릭함");
				
			} 
		});
		
		
		setVisible(true);
		setSize(640,480);
		setResizable(false); //사이즈 재조정 불가능
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new ButtonTest();
	}

}
