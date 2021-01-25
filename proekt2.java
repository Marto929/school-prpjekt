package domashnoit;


	

	import javax.swing.ImageIcon;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.SwingConstants;
	import java.awt.Font;
	public class projekte {
		
	    public static void main(String[] args) {
	        JFrame screen = new JFrame(); // nov ekran
	        screen.setLayout(null);
	        screen.setVisible(true);

	        JLabel placeLabel = new JLabel("", SwingConstants.CENTER); // za da  bude teksta centriran.
	        placeLabel.setBounds(0, 90, 850, 40);
	        placeLabel.setFont(new Font(placeLabel.getFont().getName(), Font.PLAIN, 25)); // razmer 25 na shrifta.
	        screen.add(placeLabel); // dobavqme  label-a na ekrana.

	        JLabel imageLabel = new JLabel();
	        imageLabel.setBounds(250, 80, 500, 500);
	        screen.add(imageLabel); // dobavqme kartinkata na ekrana.

	        //dnite ot sedmicata koito sa teksta v butonite.
	        String[] daysOfWeek = new String[] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

	        // kude trqbva da sme prez vseki den .
	        String[] placesToVisit = new String[] {"Panagurishte -Azarel medet",
	                                               "Sofia-Buhovo",
	                                               "Sofia-Buhovo",
	                                               "Makedoniq-Bitolq",
	                                               "Serbia-Belgrad",
	                                               "Day off",
	                                               "Day off"};

	        for (int i = 0; i < daysOfWeek.length; i++) { // za vseki ot dnite.
	            JButton current = new JButton(daysOfWeek[i]); // suzdavame noviq buton.
	            current.setBounds(50 + i * 100, 30, 100, 50); // postavqme go na pravilnoto mqsto.
	            screen.add(current); // dobavqme tekushtiq buton.
	            final int placeId = i;
	            current.addActionListener(event -> {
	                placeLabel.setText(placesToVisit[placeId]); // slagame pravilniq tekst
	                if(placesToVisit[placeId].equals("Day off")) {
	                    imageLabel.setIcon(new ImageIcon("beer.png")); //ako denq e pochiven slagame beer.
	                }
	                else {
	                    imageLabel.setIcon(null); 
	                }
	            });
	        }
	        screen.setSize((daysOfWeek.length + 1) * 100,700); 
	    }
	}


