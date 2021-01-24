package domashnoit;


	

	import javax.swing.ImageIcon;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.SwingConstants;
	import java.awt.Font;
	public class projekte {
		
	    public static void main(String[] args) {
	        JFrame screen = new JFrame(); // нов екран
	        screen.setLayout(null);
	        screen.setVisible(true);

	        JLabel placeLabel = new JLabel("", SwingConstants.CENTER); // За да бъде текста винаги центриран.
	        placeLabel.setBounds(0, 90, 850, 40);
	        placeLabel.setFont(new Font(placeLabel.getFont().getName(), Font.PLAIN, 25)); // избираме размер 25 на шрифта.
	        screen.add(placeLabel); // добавяме label-a на екрана.

	        JLabel imageLabel = new JLabel();
	        imageLabel.setBounds(250, 80, 500, 500);
	        screen.add(imageLabel); // добавяме картинката на екрана.

	        // дните от седмицата, които ще служат за текст в бутоните.
	        String[] daysOfWeek = new String[] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

	        // съответните места, където трябва да сме през всеки ден от седмицата.
	        String[] placesToVisit = new String[] {"Панагюрище - Азарел медет",
	                                               "София - Бухово",
	                                               "София - Бухово",
	                                               "Сърбия - Белград",
	                                               "Македония - Битоля",
	                                               "Day off",
	                                               "Day off"};

	        for (int i = 0; i < daysOfWeek.length; i++) { // за всеки от дните.
	            JButton current = new JButton(daysOfWeek[i]); // създаваме новия бутон.
	            current.setBounds(50 + i * 100, 30, 100, 50); // поставяме бутона на правилното място.
	            screen.add(current); // добавяме текущия бутон.
	            final int placeId = i;
	            current.addActionListener(event -> {
	                placeLabel.setText(placesToVisit[placeId]); // Слагаме подходящия надпис
	                if(placesToVisit[placeId].equals("Day off")) {
	                    imageLabel.setIcon(new ImageIcon("beer.png")); // ако денят е почивен, слагаме бира.
	                }
	                else {
	                    imageLabel.setIcon(null); // ако денят не е почивен, не слагаме картинка.
	                }
	            });
	        }
	        screen.setSize((daysOfWeek.length + 1) * 100,700); // Настройваме размера на екрана.
	    }
	}


