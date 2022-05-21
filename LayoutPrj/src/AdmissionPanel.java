import java.applet.Applet;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Button;
import java.awt.TextArea;
import java.awt.Choice;
import java.awt.Color;
import java.awt.GridLayout;


public class AdmissionPanel extends Panel implements ActionListener, ItemListener
{
	Panel P,P1,P2,P3,P4,P5,P6;
	Label lbadm,lbcand,lbfat,lbgen,lbadd,lbdeg,lbdegfee,lbfac,lbfacfee,lbtotfee;
	TextField txcand,txfat,txdegfee,txfacfee,txtotfee;
	TextArea taadd;
	Checkbox rbmale,rbfemale,rbref,cbmess,cbhostel,cbbus;
	CheckboxGroup gr;
	Choice cbdeg;
	Button btcal,btrec,btref,btclose;
	
	public AdmissionPanel()
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
		
		rbref=new Checkbox();
		
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
		P1.setLayout(new GridLayout(2,2,10,10));
		P1.add(lbcand);
		P1.add(txcand);
		
		P1.add(lbfat);
		P1.add(txfat);
		
		P2=new Panel();
		P2.setLayout(new GridLayout(1,3,10,10));
		P2.add(lbgen);
		P2.add(rbmale);
		P2.add(rbfemale);
		
		P3=new Panel();
		P3.setLayout(new GridLayout(3,2,10,10));
		P3.add(lbadd);
		P3.add(taadd);
		
		P3.add(lbdeg);
		P3.add(cbdeg);
		
		P3.add(lbdegfee);
		P3.add(txdegfee);
		
		P4=new Panel();
		P4.setLayout(new GridLayout(1,4,10,10));
		P4.add(lbfac);
		P4.add(cbmess);
		P4.add(cbhostel);
		P4.add(cbbus);
		
		P5=new Panel();
		P5.setLayout(new GridLayout(2,2,10,10));
		P5.add(lbfacfee);
		P5.add(txfacfee);
		
		P5.add(lbtotfee);
		P5.add(txtotfee);
		
		P6=new Panel();
		P6.setLayout(new GridLayout(1,4,10,10));
		P6.add(btcal);
		P6.add(btrec);
		P6.add(btref);
		P6.add(btclose);
		
		setLayout(new GridLayout(7,1));
		add(P);
		add(P1);
		add(P2);
		add(P3);
		add(P4);
		add(P5);
		add(P6);
		
		txcand.requestFocus();
		
		cbdeg.addItemListener(this);
		
		cbmess.addItemListener(this);
		cbhostel.addItemListener(this);
		cbbus.addItemListener(this);
		
		btcal.addActionListener(this);
		btrec.addActionListener(this);
		btref.addActionListener(this);
		btclose.addActionListener(this);
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
		}
		
		else
		{
			System.exit(0);
		}
	}
}
//<applet code="AdmissionPanel.class" width=500 height=500></applet>