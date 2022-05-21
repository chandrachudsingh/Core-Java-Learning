import java.applet.Applet;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Button;
import java.awt.TextArea;
import java.awt.Choice;
import java.awt.Color;
import java.awt.GridLayout;

public class AdmissionForm extends Applet implements ActionListener, ItemListener, KeyListener
{
	Panel P,P1,P2,P3,P4,P5,P6,Pbill;
	Label lbadm,lbcand,lbfat,lbgen,lbadd,lbdeg,lbdegfee,lbfac,lbfacfee,lbtotfee;
	Label lbrec,lbcand2,lbfat2,lbgen2,lbadd2,lbdeg2,lbdegfee2,lbfac2,lbfacfee2,lbtotfee2;
	TextField txcand,txfat,txdegfee,txfacfee,txtotfee;
	TextArea taadd;
	Checkbox rbmale,rbfemale,rbref,cbmess,cbhostel,cbbus;
	CheckboxGroup gr;
	Choice cbdeg;
	Button btcal,btrec,btref,btclose;
	
	public void init()
	{
		lbadm=new Label("Admission Form");
		lbadm.setForeground(Color.MAGENTA);
		lbcand=new Label("Candidate Name");
		lbcand.setForeground(Color.red);
		lbfat=new Label("Father Name");
		lbfat.setForeground(Color.red);
		lbgen=new Label("Gender");
		lbgen.setForeground(Color.red);
		lbadd=new Label("Address");
		lbadd.setForeground(Color.red);
		lbdeg=new Label("Degree");
		lbdeg.setForeground(Color.red);
		lbdegfee=new Label("Degree fee");
		lbdegfee.setForeground(Color.red);			
		lbfac=new Label("Facilities");
		lbfac.setForeground(Color.red);		
		lbfacfee=new Label("Facilities fee");
		lbfacfee.setForeground(Color.red);		
		lbtotfee=new Label("Total fee");
		lbtotfee.setForeground(Color.red);
		
		lbrec=new Label();
		lbrec.setVisible(false);
		lbcand2=new Label();
		lbcand2.setVisible(false);
		lbfat2=new Label();
		lbfat2.setVisible(false);
		lbgen2=new Label();
		lbgen2.setVisible(false);
		lbadd2=new Label();
		lbadd2.setVisible(false);
		lbdeg2=new Label();
		lbdeg2.setVisible(false);
		lbdegfee2=new Label();
		lbdegfee2.setVisible(false);
		lbfac2=new Label();
		lbfac2.setVisible(false);
		lbfacfee2=new Label();
		lbfacfee2.setVisible(false);
		lbtotfee2=new Label();
		lbtotfee2.setVisible(false);
		
		txcand=new TextField();
		txfat=new TextField();
		txdegfee=new TextField();
		txdegfee.setEnabled(false);
		txfacfee=new TextField();
		txfacfee.setEnabled(false);
		txtotfee=new TextField();
		txtotfee.setEnabled(false);
		
		gr=new CheckboxGroup();
		rbmale=new Checkbox("Male",gr,false);
		rbmale.setForeground(Color.blue);
		rbfemale=new Checkbox("Female",gr,false);
		rbfemale.setForeground(Color.blue);
		rbref=new Checkbox("",gr,false);
		
		cbmess=new Checkbox("Mess");
		cbmess.setForeground(Color.green);
		cbhostel=new Checkbox("Hostel");
		cbhostel.setForeground(Color.green);
		cbbus=new Checkbox("Bus");
		cbbus.setForeground(Color.green);
		
		taadd=new TextArea();
		
		cbdeg=new Choice();
		cbdeg.setForeground(Color.gray);
		cbdeg.add("Select Degree");
		cbdeg.add("BTech");
		cbdeg.add("MTech");
		
		btcal=new Button("Calculate");
		btcal.setBackground(Color.yellow);
		btrec=new Button("Reciept");
		btrec.setBackground(Color.yellow);
		btref=new Button("Refresh");
		btref.setBackground(Color.yellow);
		btclose=new Button("Close");
		btclose.setBackground(Color.yellow);
		
		P=new Panel();
		P.add(lbadm);
		
		P1=new Panel();
		P1.setLayout(new GridLayout(2,2));
		P1.add(lbcand);
		P1.add(txcand);
		
		P1.add(lbfat);
		P1.add(txfat);
		
		P2=new Panel();
		P2.setLayout(new GridLayout(1,4));
		P2.add(lbgen);
		P2.add(rbmale);
		P2.add(rbfemale);
		
		P3=new Panel();
		P3.setLayout(new GridLayout(3,2));
		P3.add(lbadd);
		P3.add(taadd);
		
		P3.add(lbdeg);
		P3.add(cbdeg);
		
		P3.add(lbdegfee);
		P3.add(txdegfee);
		
		P4=new Panel();
		P4.setLayout(new GridLayout(1,4));
		P4.add(lbfac);
		P4.add(cbmess);
		P4.add(cbhostel);
		P4.add(cbbus);
		
		P5=new Panel();
		P5.setLayout(new GridLayout(2,2));
		P5.add(lbfacfee);
		P5.add(txfacfee);
		
		P5.add(lbtotfee);
		P5.add(txtotfee);
		
		Pbill=new Panel();
		Pbill.setLayout(new GridLayout(10,1));
		Pbill.add(lbrec);
		Pbill.add(lbcand2);
		Pbill.add(lbfat2);
		Pbill.add(lbgen2);
		Pbill.add(lbadd2);
		Pbill.add(lbdeg2);
		Pbill.add(lbdegfee2);
		Pbill.add(lbfac2);
		Pbill.add(lbfacfee2);
		Pbill.add(lbtotfee2);
		
		P6=new Panel();
		P6.setLayout(new GridLayout(1,4));
		P6.add(btcal);
		P6.add(btrec);
		P6.add(btref);
		P6.add(btclose);
		
		Pbill=new Panel();
		Pbill.setLayout(new GridLayout(10,1));
		Pbill.add(lbrec);
		Pbill.add(lbfat2);
		Pbill.add(lbgen2);
		Pbill.add(lbadd2);
		Pbill.add(lbdeg2);
		Pbill.add(lbdegfee2);
		Pbill.add(lbfac2);
		Pbill.add(lbfacfee2);
		Pbill.add(lbtotfee2);
		
		setLayout(new GridLayout(8,1));
		add(P);
		add(P1);
		add(P2);
		add(P3);
		add(P4);
		add(P5);
		add(P6);
		add(Pbill);
		
		txcand.requestFocus();
		
		cbdeg.addItemListener(this);
		
		cbmess.addItemListener(this);
		cbhostel.addItemListener(this);
		cbbus.addItemListener(this);
		
		btcal.addActionListener(this);
		btrec.addActionListener(this);
		btref.addActionListener(this);
		btclose.addActionListener(this);
		
		txcand.addKeyListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		if(cbdeg.getSelectedItem()=="BTech")
			txdegfee.setText("60000");
		else if(cbdeg.getSelectedItem()=="MTech")
			txdegfee.setText("80000");
		else
			txdegfee.setText("Please select any option");
		
		float facfee=0;
		if(cbmess.getState())
			facfee+=25000;
		if(cbhostel.getState())
			facfee+=30000;
		if(cbbus.getState())
			facfee+=20000;
		
		txfacfee.setText(facfee+"");
		
		validate();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Object src=e.getSource();
		
		if(src==btcal)
		{
			float degfee=Float.parseFloat(txdegfee.getText());
			float facfee=Float.parseFloat(txfacfee.getText());
			txtotfee.setText((degfee+facfee)+"");
		}
		
		else if(src==btrec)
		{
			lbrec.setText("-----------Reciept----------");
			lbrec.setVisible(true);
			lbcand2.setText("Candidate Name :- "+txcand.getText());
			lbcand2.setVisible(true);
			lbfat2.setText("Father Name :- "+txfat.getText());
			lbfat2.setVisible(true);
			
			if(rbmale.getState())
				lbgen2.setText("Gender :- Male");
			else 
				lbgen2.setText("Gender :- Female");
			lbgen2.setVisible(true);
			
			lbadd2.setText("Address :- "+taadd.getText());
			lbadd2.setVisible(true);
			
			lbdeg2.setText("Degree :- "+cbdeg.getSelectedItem());
			lbdeg2.setVisible(true);
			
			lbdegfee2.setText("Degree Fee :- "+txdegfee.getText());
			lbdegfee2.setVisible(true);

			String str="";
			if(cbmess.getState())
				str+="mess ";
			if(cbhostel.getState())
				str+="Hostel ";
			if(cbbus.getState())
				str+="Bus";
			lbfac2.setText("Facilities :- "+str);
			lbfac2.setVisible(true);
			
			lbfacfee2.setText("Facilities Fee :- "+txfacfee.getText());
			lbfacfee2.setVisible(true);
			lbtotfee2.setText("Total Fee :- "+txtotfee.getText());
			lbtotfee2.setVisible(true);
		}
		
		else if(src==btref)
		{
			txcand.setText("");
			txfat.setText("");
			txdegfee.setText("");
			txfacfee.setText("");
			txtotfee.setText("");
			cbdeg.select(0);                  //Combobox refresh
			
			rbref.setState(true);                //Radiobutton refresh 
			
			cbmess.setState(false);
			cbhostel.setState(false);               //Checkbox refresh
			cbbus.setState(false);
			txcand.requestFocus();
			
			lbcand2.setVisible(false);
			lbfat2.setVisible(false);
			lbgen2.setVisible(false);
			lbadd2.setVisible(false);
			lbdeg2.setVisible(false);
			lbdegfee2.setVisible(false);
			lbfac2.setVisible(false);
			lbfacfee2.setVisible(false);
			lbtotfee2.setVisible(false);
		}
		
		else
		{
			System.exit(0);
		}
	}

	@Override
	public void keyTyped(KeyEvent ke) 
	{
		//System.out.println(ke.getKeyChar());
		//System.out.println(ke.getKeyCode());          //This does not work in keypad
		
		//if(ke.getKeyChar()>='0' && ke.getKeyCode()<='9')
		//	ke.consume();
		
		if (!((ke.getKeyChar()>='a'&& ke.getKeyChar()<='z')
				||(ke.getKeyChar()>='A'&& ke.getKeyChar()<='Z')))
			ke.consume();
	} 

	@Override
	public void keyPressed(KeyEvent ke) 
	{
		//System.out.println(ke.getKeyChar());
		//System.out.println(ke.getKeyCode());
	}

	@Override
	public void keyReleased(KeyEvent ke) 
	{
		//System.out.println(ke.getKeyChar());
		//System.out.println(ke.getKeyCode());
	}
}
//<applet code="AdmissionForm.class" width=500 height=500></applet>