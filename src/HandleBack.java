import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JTextField;

public class HandleBack implements ActionListener
{
	LinkedList<String> list;
	JTextField resultShow, showComputerProcess;

	public HandleBack(LinkedList<String> list, JTextField resultShow, JTextField showComputerProcess)
	{
		this.list = list;
		this.resultShow = resultShow;
		this.showComputerProcess = showComputerProcess;
	}

	public void actionPerformed(ActionEvent e)
	{
		if (list.size() > 0)
		{
			String s = list.getLast();
			if (s.length() > 0)
			{
				String k = s.substring(0, s.length() - 1);
				resultShow.setText(k);
			}
		}
	}

}
