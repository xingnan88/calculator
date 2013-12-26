import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JTextArea;
import javax.swing.JTextField;


public class HandleOperation implements ActionListener
{

    LinkedList<String> list;
    JTextField resultShow,showComputerProcess;          
    JTextArea saveComputerProcess; 
	public HandleOperation(LinkedList<String> list, JTextField resultShow, JTextField showComputerProcess, JTextArea saveComputerProcess)
	{
		this.list=list;
		this.resultShow=resultShow;
		this.showComputerProcess=showComputerProcess;
		this.saveComputerProcess=saveComputerProcess;
	}

	public void actionPerformed(ActionEvent e)
	{
		OperationButton b = (OperationButton)e.getSource();    //如果链表有3个节点
		if (list.size() == 1)
		{
			String fuhao = b.getOperator();
			list.add(fuhao);    //链表第二个节点存放操作符号
			resultShow.setText(fuhao);
		}
		else if (list.size() == 2)
		{
			String fuhao = b.getOperator();
			list.set(1, fuhao);   //改换第二节点的符号
			resultShow.setText(fuhao);
		}
		else if (list.size() == 3)
		{
			String fuhao = b.getOperator();
			String number1 = (String)list.getFirst();  //获取第链表第一个节点的数值
			String number2 = (String)list.getLast();   //获取第链表最后一个节点的数值
			String fuhao1 = (String)list.get(1);       //获取第链表第2个节点的符号
			double n1 = Double.parseDouble(number1);  //将第1个节点的值转化为double型
			double n2 = Double.parseDouble(number2);   //将第最后节点的值转化为double型
			double n = 0;
			if (fuhao1.equals("+"))
			{
				n = n1 + n2;
			}
			else if (fuhao1.equals("-"))
			{
				n = n1 - n2;
			}
			else if (fuhao1.equals("*"))
			{
				n = n1 * n2;
			}
			else if (fuhao1.equals("/"))
			{
				n = n1 / n2;
			}
			list.clear();      //清空链表
			list.add(" " + n);   //链表添加n
			list.add(fuhao);       //添加符号
			resultShow.setText(" " + n);
	}
	}
}
