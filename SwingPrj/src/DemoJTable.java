import javax.swing.JApplet;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class DemoJTable extends JApplet
{
	JScrollPane Jsp;
	JTable tb;
	
	Object[] cols= {"RollNo","Name","Age"};
	
	public void init()
	{
		Object[][] rows= {{1,"Anil",21},{2,"Bhaskar",23}};
		tb=new JTable(rows,cols);
		Jsp=new JScrollPane(tb, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		add(Jsp);
	}
}
