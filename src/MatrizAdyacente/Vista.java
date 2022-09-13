package MatrizAdyacente;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
public class Vista extends JFrame {

	public Vista(String[][] matriz) {
		String[] columnName = new String[matriz[0].length];
        for (int i = 0; i < matriz[0].length; i++) {
        	columnName[i]=("a"+i);      
        }
        JTable table = new JTable(matriz, columnName);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(450,150));
        table.setFillsViewportHeight(true);

        this.getContentPane().add(scrollPane, BorderLayout.CENTER);

        this.pack();
	}

}
