import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JTextField;

public class HandleClear implements ActionListener
{
	LinkedList<String> list;
    JTextField resultShow,showComputerProcess;
	public HandleClear(LinkedList<String> list, JTextField resultShow, JTextField showComputerProcess)
	{
		this.list=list;
		this.resultShow=resultShow;
		this.showComputerProcess=showComputerProcess;
	}
	public void actionPerformed(ActionEvent e)
	{
		list.clear();
		resultShow.setText("0");
		showComputerProcess.setText(null);
	}

}
