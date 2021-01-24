package domashnoit;


	

	import javax.swing.ImageIcon;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.SwingConstants;
	import java.awt.Font;
	public class projekte {
		
	    public static void main(String[] args) {
	        JFrame screen = new JFrame(); // ��� �����
	        screen.setLayout(null);
	        screen.setVisible(true);

	        JLabel placeLabel = new JLabel("", SwingConstants.CENTER); // �� �� ���� ������ ������ ���������.
	        placeLabel.setBounds(0, 90, 850, 40);
	        placeLabel.setFont(new Font(placeLabel.getFont().getName(), Font.PLAIN, 25)); // �������� ������ 25 �� ������.
	        screen.add(placeLabel); // �������� label-a �� ������.

	        JLabel imageLabel = new JLabel();
	        imageLabel.setBounds(250, 80, 500, 500);
	        screen.add(imageLabel); // �������� ���������� �� ������.

	        // ����� �� ���������, ����� �� ������ �� ����� � ��������.
	        String[] daysOfWeek = new String[] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

	        // ����������� �����, ������ ������ �� ��� ���� ����� ��� �� ���������.
	        String[] placesToVisit = new String[] {"���������� - ������ �����",
	                                               "����� - ������",
	                                               "����� - ������",
	                                               "������ - �������",
	                                               "��������� - ������",
	                                               "Day off",
	                                               "Day off"};

	        for (int i = 0; i < daysOfWeek.length; i++) { // �� ����� �� �����.
	            JButton current = new JButton(daysOfWeek[i]); // ��������� ����� �����.
	            current.setBounds(50 + i * 100, 30, 100, 50); // ��������� ������ �� ���������� �����.
	            screen.add(current); // �������� ������� �����.
	            final int placeId = i;
	            current.addActionListener(event -> {
	                placeLabel.setText(placesToVisit[placeId]); // ������� ���������� ������
	                if(placesToVisit[placeId].equals("Day off")) {
	                    imageLabel.setIcon(new ImageIcon("beer.png")); // ��� ����� � �������, ������� ����.
	                }
	                else {
	                    imageLabel.setIcon(null); // ��� ����� �� � �������, �� ������� ��������.
	                }
	            });
	        }
	        screen.setSize((daysOfWeek.length + 1) * 100,700); // ����������� ������� �� ������.
	    }
	}


