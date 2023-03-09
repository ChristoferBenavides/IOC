package Calcular;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Combo;

public class calcular {

	protected Shell shlCalculos;
	private Group grpSuma;
	private Label lblCalculaSuma;
	private Text textNum1;
	private Label Nombre1;
	private Text textNum2;
	private Label Nombre2;
	private Label Resultat;
	private Text textResultat;
	private Button btnCalcula;
	private Group grpMultiplicaresultat;
	private Label lblNummultiplicacio;
	private Button btnCalculam;
	private Combo comboNumMultiplicacio;
	private Text textNouResultat;
	private Label lblNouresultat;
	private Group grpAlerta;
	private Text textAlerta;
	private Button btnReestablir;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			calcular window = new calcular();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlCalculos.open();
		shlCalculos.layout();
		while (!shlCalculos.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlCalculos = new Shell();
		shlCalculos.setSize(719, 656);
		shlCalculos.setText("Calculos");
		
		grpSuma = new Group(shlCalculos, SWT.NONE);
		grpSuma.setToolTipText("Introdueix un nombre");
		grpSuma.setBounds(10, 21, 690, 260);
		
		lblCalculaSuma = new Label(grpSuma, SWT.NONE);
		lblCalculaSuma.setFont(SWTResourceManager.getFont("Segoe UI", 11, SWT.NORMAL));
		lblCalculaSuma.setBounds(10, 10, 139, 35);
		lblCalculaSuma.setText("Calcula suma ");
		
		textNum1 = new Text(grpSuma, SWT.BORDER);
		textNum1.setToolTipText("Introdueix un nombre");
		textNum1.setBounds(142, 76, 88, 26);
		
		Nombre1 = new Label(grpSuma, SWT.NONE);
		Nombre1.setBounds(28, 79, 78, 20);
		Nombre1.setText("Nombre 1");
		
		textNum2 = new Text(grpSuma, SWT.BORDER);
		textNum2.setBounds(142, 135, 88, 26);
		
		Nombre2 = new Label(grpSuma, SWT.NONE);
		Nombre2.setBounds(28, 138, 70, 20);
		Nombre2.setText("Nombre 2");
		
		Resultat = new Label(grpSuma, SWT.NONE);
		Resultat.setBounds(28, 194, 70, 20);
		Resultat.setText("Resultat");
		
		textResultat = new Text(grpSuma, SWT.BORDER);
		textResultat.setBounds(142, 188, 88, 26);
		
		btnCalcula = new Button(grpSuma, SWT.NONE);
		btnCalcula.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(ValidacioSuma(true)) {
					suma(textNum1.getText(), textNum2.getText());
					habilitarMultiplicacio();
					deshabilitarSuma();
				}				
			}
		});
		btnCalcula.setBounds(383, 116, 146, 45);
		btnCalcula.setText("Calcula");
		
		grpMultiplicaresultat = new Group(shlCalculos, SWT.NONE);
		grpMultiplicaresultat.setEnabled(false);
		grpMultiplicaresultat.setText("MultiplicaResultat");
		grpMultiplicaresultat.setBounds(10, 288, 684, 225);
		
		lblNummultiplicacio = new Label(grpMultiplicaresultat, SWT.NONE);
		lblNummultiplicacio.setBounds(30, 65, 126, 20);
		lblNummultiplicacio.setText("NumMultiplicacio");
		
		btnCalculam = new Button(grpMultiplicaresultat, SWT.NONE);
		btnCalculam.setEnabled(false);
		btnCalculam.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(validacioMultiplicacio(true)){
					multiplica(textResultat.getText());
				}
				
			}
		});
		btnCalculam.setBounds(447, 105, 90, 30);
		btnCalculam.setText("CalculaM");
		
		comboNumMultiplicacio = new Combo(grpMultiplicaresultat, SWT.NONE);
		comboNumMultiplicacio.setEnabled(false);
		comboNumMultiplicacio.setItems(new String[] {"2", "4", "6", "8"});
		comboNumMultiplicacio.setBounds(183, 65, 97, 28);
		
		textNouResultat = new Text(grpMultiplicaresultat, SWT.BORDER);
		textNouResultat.setEnabled(false);
		textNouResultat.setBounds(183, 136, 97, 26);
		
		lblNouresultat = new Label(grpMultiplicaresultat, SWT.NONE);
		lblNouresultat.setBounds(30, 136, 90, 20);
		lblNouresultat.setText("nouResultat");
		
		btnReestablir = new Button(grpMultiplicaresultat, SWT.NONE);
		btnReestablir.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				deshabilitarMultiplicacio();
				habilitarSuma();
			}
		});
		btnReestablir.setBounds(447, 33, 90, 30);
		btnReestablir.setText("Reestablir");
		
		grpAlerta = new Group(shlCalculos, SWT.NONE);
		grpAlerta.setText("Alerta");
		grpAlerta.setBounds(10, 524, 684, 77);
		
		textAlerta = new Text(grpAlerta, SWT.BORDER);
		textAlerta.setBounds(23, 41, 618, 26);

	}
	private void suma(String a, String b) {
		int resultat = Integer.parseInt(a) + Integer.parseInt(b);
		textResultat.setText((resultat+""));
	}
	private void multiplica(String resultat) {
		int nouResultat = Integer.parseInt(resultat) * Integer.parseInt(comboNumMultiplicacio.getText());
		textNouResultat.setText(nouResultat+"");
	}
	private boolean ValidacioSuma(boolean a) {
		if(campBuit(textNum1.getText())) {
			showAlerta("Espai en blanc", textNum1);
		}else if(!isNumeric(textNum1)) {
			showAlerta("No es un nombre", textNum1);
		}else if (!isNumeric(textNum2)) {
			showAlerta("No es un nombre", textNum2);
		}else {
			return true;
		}		
		return false;
	}
	private boolean validacioMultiplicacio(boolean b) {
		if(comboNumMultiplicacio.getSelectionIndex() == -1) {
			showAlerta("Selecciona una opcio", comboNumMultiplicacio);
		}else {
			return true;
		}
		
		return false;
	}
	private boolean isNumeric(Text text) {
        try {
            Double.parseDouble(text.getText());
            return true;
        } catch (NumberFormatException excepcion) {
            return false;
        }
    }
	private void showAlerta(String alerta, Text text) {
		text.setFocus();
		textAlerta.setText("Error : " + alerta);
		text.selectAll();
	}
	
	private void showAlerta(String alerta, Combo combo) {
		combo.setFocus();
		textAlerta.setText("Error : " + alerta);
		
	}
	private boolean campBuit (String s) {
		return s.trim().isEmpty();
	}
	private void habilitarMultiplicacio() {
		grpMultiplicaresultat.setEnabled(true);
		btnCalculam.setEnabled(true);
		btnReestablir.setEnabled(true);
		textNouResultat.setEnabled(true);
		comboNumMultiplicacio.setEnabled(true);		
	}
	private void deshabilitarSuma() {
		grpSuma.setEnabled(false);
		btnCalcula.setEnabled(false);
		textNum1.setEnabled(false);
		textNum2.setEnabled(false);
		textResultat.setEditable(false);
	}
	private void deshabilitarMultiplicacio() {
		grpMultiplicaresultat.setEnabled(false);
		btnCalculam.setEnabled(false);
		btnReestablir.setEnabled(false);
		textNouResultat.setEnabled(false);
		comboNumMultiplicacio.setEnabled(false);
		textNouResultat.setText("");
		comboNumMultiplicacio.deselectAll();
	}
	private void habilitarSuma() {
		grpSuma.setEnabled(true);
		btnCalcula.setEnabled(true);
		textNum1.setEnabled(true);
		textNum2.setEnabled(true);
		textResultat.setEditable(true);
		textNum1.setText("");
		textNum2.setText("");
		textResultat.setText("");
	}	
}
