import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JTextField;

public class HandleDigit implements ActionListener
{
	LinkedList<String> list;
    JTextField resultShow,showComputerProcess;
    boolean bd=false;
	public HandleDigit(LinkedList<String> list, JTextField resultShow, JTextField showComputerProcess)
	{
		this.list=list;
		this.resultShow=resultShow;
		this.showComputerProcess=showComputerProcess;
	}

	public void actionPerformed(ActionEvent e)
	{
		NumberButton b = (NumberButton)e.getSource();
			if (list.size() == 0)            //如果链表没有节点
			{
				int number = b.getNumber();    //获取按钮上的数字
				list.add(" " + number);          //将数据添加到链表
				resultShow.setText(" " + number);
				bd = false;
			}
			else if (list.size() == 1 && bd == false)   //如果链表有一个节点
			{
				int number = b.getNumber();
				String num = (String)list.getFirst();
				String s = num.concat("" + number);   //将两个数字首尾相接
				list.set(0, s);
				resultShow.setText(" " + s);
			}
			else if (list.size() == 1 && bd == true)
			{
				int number = b.getNumber();
				list.removeFirst();
				list.add(" " + number);     //将数据添加到链表
				bd = false;
				resultShow.setText("" + number);
			}
			else if (list.size() == 2)     //如果链表有2个节点
			{
				int number = b.getNumber();
				list.add(" " + number);    //链表添加第三个节点
				resultShow.setText(" " + number);
			}
			else if (list.size() == 3)    //如果链表有3个节点
			{
				int number = b.getNumber();
				String num = (String)list.getLast();
				String s = num.concat("" + number);
				list.set(2, s);
				resultShow.setText("" + s);
			}

	}



}
