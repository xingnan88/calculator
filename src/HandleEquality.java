//代码6 HandleEquality.java
import java.util.LinkedList;
import javax.swing.*;
import java.awt.event.*;
public class HandleEquality implements ActionListener{
    LinkedList<String> list;
    JTextField resultShow,showComputerProcess;          
    JTextArea saveComputerProcess; 
    HandleEquality(LinkedList<String> list,JTextField t1,JTextField t2,
                    JTextArea t3){
        this.list=list;
        resultShow=t1;
        showComputerProcess=t2; 
        saveComputerProcess=t3;
    }
    public void actionPerformed(ActionEvent e){
        if(list.size()==1){   
           String num=list.getFirst();
           resultShow.setText(""+num);
           showComputerProcess.setText(list.get(0));
        }
        if(list.size()==2){   
           String num=list.getFirst();
           String 运算符号=list.get(1);
           try{  double n1=Double.parseDouble(num);
                 double n2=Double.parseDouble(num);
                 double result=0;
                 if(运算符号.equals("+"))
                      result=n1+n2;
                 else if(运算符号.equals("-"))
                      result=n1-n2;
                 else if(运算符号.equals("*"))
                      result=n1*n2;
                 else if(运算符号.equals("/"))
                      result=n1/n2;
                 resultShow.setText(""+result);
                 String proccess=num+""+运算符号+""+num+"="+result;
                 showComputerProcess.setText(proccess);
                 saveComputerProcess.append(" "+proccess+"\n");
                 list.set(0,""+result);
           }//在输入数字+，再按等于号等到数字+数字（例如：2+=4 2+2=4）其他的雷同
           catch(Exception ee){}
        }
        else if(list.size()==3){
           String numOne=list.getFirst();
           String 运算符号=list.get(1);
           String numTwo=list.getLast();
           try{  double n1=Double.parseDouble(numOne);
                 double n2=Double.parseDouble(numTwo);
                 double result=0;
                 if(运算符号.equals("+"))
                      result=n1+n2;
                 else if(运算符号.equals("-"))
                      result=n1-n2;
                 else if(运算符号.equals("*"))
                      result=n1*n2;
                 else if(运算符号.equals("/"))
                      result=n1/n2;
                 resultShow.setText(""+result);
                 String proccess=numOne+""+运算符号+""+numTwo+"="+result;
                 showComputerProcess.setText(proccess);
                 saveComputerProcess.append(" "+proccess+"\n");
                 list.set(0,""+result);
                 list.removeLast();  //移掉第2个运算数 
                 list.removeLast();  //移掉运算符号
           }
           catch(Exception ee){}
       }
    }
}  //
