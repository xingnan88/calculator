import javax.swing.JButton;



public class OperationButton extends JButton {
	String operator;
	public OperationButton(String s){
		super(s);
		operator=s;
	}
	   public String getOperator(){
		   return operator;
	   }
}



