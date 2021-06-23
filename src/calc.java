import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class calc implements ActionListener {
	public static String var = "";
	public static String ans = "";
	static evaluation obj = new evaluation();
	private static JPanel panel = new JPanel();
	private static JLabel label = new JLabel();
	private static JLabel label2 = new JLabel();
	private static JLabel label3 = new JLabel();
	private static JFrame frame = new JFrame();
	private static JButton clearButton = new JButton();
	private static JButton addButton = new JButton();
	private static JButton subButton = new JButton();
	private static JButton divButton = new JButton();
	private static JButton equalButton = new JButton();
	private static JButton multButton = new JButton();
	private static JButton sqrtButton = new JButton();
	private static JButton powButton = new JButton();
	private static JButton button1 = new JButton();
	private static JButton button2 = new JButton();
	private static JButton button3 = new JButton();
	private static JButton button4 = new JButton();
	private static JButton button5 = new JButton();
	private static JButton button6 = new JButton();
	private static JButton button7 = new JButton();
	private static JButton button8 = new JButton();
	private static JButton button9 = new JButton();
	private static JButton button0 = new JButton();

	public static void main(String[] args) {

		frame.setSize(260, 365);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel);

		panel.setLayout(null);
		label = new JLabel("calculator");
		label.setBounds(90, 10, 70, 30);
		panel.add(label);

		label2 = new JLabel(var);
		label2.setBounds(10, 45, 300, 30);
		panel.add(label2);

		label3 = new JLabel();
		label3.setBounds(10, 65, 300, 30);
		panel.add(label3);

		clearButton = new JButton("C");
		clearButton.setBounds(10, 95, 50, 35);
		panel.add(clearButton);

		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				var = "";
				ans = "";
				label2.setText(var);
				label3.setText("");

			}

		});

		divButton = new JButton("/");
		divButton.setBounds(70, 95, 50, 35);
		panel.add(divButton);

		divButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				var += "/";
				ans += "/";
				label2.setText(var);
			}

		});

		multButton = new JButton("X");
		multButton.setBounds(130, 95, 50, 35);
		panel.add(multButton);

		multButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				var += "*";
				ans += "*";
				label2.setText(var);
			}

		});

		subButton = new JButton("-");
		subButton.setBounds(190, 95, 50, 35);
		panel.add(subButton);

		subButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				var += "-";
				ans += "-";
				label2.setText(var);
			}

		});

		button7 = new JButton("7");
		button7.setBounds(10, 140, 50, 35);
		panel.add(button7);

		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				var += "7";
				ans += "7";
				label2.setText(var);
			}

		});

		button8 = new JButton("8");
		button8.setBounds(70, 140, 50, 35);
		panel.add(button8);

		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				var += "8";
				ans += "8";
				label2.setText(var);
			}

		});

		button9 = new JButton("9");
		button9.setBounds(130, 140, 50, 35);
		panel.add(button9);

		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				var += "9";
				ans += "9";
				label2.setText(var);
			}

		});

		button4 = new JButton("4");
		button4.setBounds(10, 185, 50, 35);
		panel.add(button4);

		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				var += "4";
				ans += "4";
				label2.setText(var);
			}

		});

		button5 = new JButton("5");
		button5.setBounds(70, 185, 50, 35);
		panel.add(button5);

		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				var += "5";
				ans += "5";
				label2.setText(var);
			}

		});

		button6 = new JButton("6");
		button6.setBounds(130, 185, 50, 35);
		panel.add(button6);

		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				var += "6";
				ans += "6";
				label2.setText(var);
			}

		});

		button1 = new JButton("1");
		button1.setBounds(10, 230, 50, 35);
		panel.add(button1);

		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				var += "1";
				ans += "1";
				label2.setText(var);
			}

		});

		button2 = new JButton("2");
		button2.setBounds(70, 230, 50, 35);
		panel.add(button2);

		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				var += "2";
				ans += "2";
				label2.setText(var);
			}

		});

		button3 = new JButton("3");
		button3.setBounds(130, 230, 50, 35);
		panel.add(button3);

		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				var += "3";
				ans += "3";
				label2.setText(var);
			}

		});

		addButton = new JButton("+");
		addButton.setBounds(190, 140, 50, 65);
		panel.add(addButton);

		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				var += "+";
				ans += "+";
				label2.setText(var);
			}

		});

		/* F */

		button0 = new JButton("0");
		button0.setBounds(10, 275, 50, 35);
		panel.add(button0);

		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				var += "0";
				ans += "0";
				label2.setText(var);
			}

		});

		sqrtButton = new JButton("\u221A");
		sqrtButton.setBounds(70, 275, 50, 35);
		panel.add(sqrtButton);

		sqrtButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				var += "\u221A";
				ans += "sqrt";
				label2.setText(var);
			}

		});
		powButton = new JButton("^");
		powButton.setBounds(130, 275, 50, 35);
		panel.add(powButton);

		powButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				var += "^";
				ans += "^";
				label2.setText(var);
			}

		});
		equalButton = new JButton("=");
		equalButton.setBounds(190, 220, 50, 90);
		panel.add(equalButton);

		equalButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				String qus = ans;
				double p = (double) obj.eval(qus);

				if (p >= 2147483647) {
					var = "calculator error[num too big]";

				} else {
					var = (Double.toString(p));
					ans = (Double.toString(p));

				}
				label3.setText("= " + var);

			}

		});

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}