package com.broCode.javaClockApp;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {

	Calendar calendar;

	JLabel timeLabel;
	JLabel dayLabel;
	JLabel dateLabel;

	SimpleDateFormat timeFormat;
	SimpleDateFormat dateFormat;
	SimpleDateFormat dayFormat;
	
	String time;
	String day;
	String date;

	public MyFrame() {
		// TODO Auto-generated constructor stub

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Clock Program");
		this.setLayout(new FlowLayout()); ////
		this.setSize(350, 200);
		this.setResizable(true); // essayer avec true 

		timeFormat = new SimpleDateFormat("hh:mm:ss a");  // a pour am ou pm
		dayFormat = new SimpleDateFormat("EEEE");
		dateFormat = new SimpleDateFormat("MMMMM dd, yyyy");

		timeLabel = new JLabel();
		timeLabel.setFont(new Font("Verdana", Font.PLAIN, 50));
		timeLabel.setForeground(new Color(0x00FF00)); ////
		timeLabel.setBackground(Color.black);
		timeLabel.setOpaque(true);

		dayLabel = new JLabel();

		dayLabel.setFont(new Font("Ink Free", Font.PLAIN, 35));

		dateLabel = new JLabel();
		dateLabel.setFont(new Font("Ink Free", Font.PLAIN, 25));

		this.add(timeLabel);
		this.add(dayLabel);
		this.add(dateLabel);
		

		this.setVisible(true); ////
		
		setTime();

	}
	
	
	public void setTime() {
		
		while(true) {  // while(true) --> l'heure ne soit pas figé, affichage comme une montre 
			
			time = timeFormat.format(Calendar.getInstance().getTime());
			timeLabel.setText(time);
			
			date = dateFormat.format(Calendar.getInstance().getTime());
			dateLabel.setText(date);
			
			day = dayFormat.format(Calendar.getInstance().getTime());
			dayLabel.setText(day);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}
	  

}
