package frames;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MainTablePanel extends JPanel {
	public MainTablePanel() {
		String[] columnNames = {"�й�", "�г�", "�л��̸�", "���(10%)", "�߰�(30%)", "����Ʈ1(10%)", "����Ʈ2(15%)", "�⸻(30%)", "����", "����", "���"};
		Object[][] data = {
				{"60142626", "3", "����", "100","100","100","0","80","79","1","A"},
				{"60142525", "4", "������", "90","95","30","50","30","54","3","B"},
				{"60121212", "2", "�ڹڹ�", "80","20","20","70","10","66","2","C"},
				{"60142626", "3", "����", "100","100","100","0","80","79","1","A"},
				{"60142525", "4", "������", "90","95","30","50","30","54","3","B"},
				{"60121212", "2", "�ڹڹ�", "80","20","20","70","10","66","2","C"}
		};
		JTable scoreTable = new JTable(data, columnNames);
		JScrollPane scrollPane = new JScrollPane(scoreTable);
		scrollPane.setPreferredSize(new Dimension(600, 200));
		scoreTable.setCellSelectionEnabled(true);
		setLayout(new GridLayout(1, 0));
		add(scrollPane);
	}
}
