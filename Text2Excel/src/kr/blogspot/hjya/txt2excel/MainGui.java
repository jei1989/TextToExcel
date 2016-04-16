package kr.blogspot.hjya.txt2excel;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class MainGui {

	public MainGui(String[] args)
	{
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(589, 428);
		shell.setText("SWT Application");

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
	
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		new MainGui(args);
	}

}
