/**
 * 
 */
package kr.blogspot.hjya.txt2excel;

import kr.blogspot.hjya.*;

/**
 * @author Administrator
 *
 */
public class UIProperty {

	/**
	 * 
	 */
	private String sourcetxtfile;
	private String targetxlsfile;
	private boolean guimode;
	
	public String getsourcetxtfile()
	{
		return this.sourcetxtfile;
	}
	private void setsourcetxtfile(String file)
	{
		this.sourcetxtfile = file;
	}
	
	public String gettargetxlsfile()
	{
		return this.targetxlsfile;
	}
	private void settargetxlsfile(String file)
	{
		this.targetxlsfile = file;
	}
	
	public boolean getguimode()
	{
		return this.guimode;
	}
	public void setguidmode(boolean mode)
	{
		this.guimode = mode;
	}
	
	
	public UIProperty() {
		// TODO Auto-generated constructor stub
	}
    	
    public UIProperty(String[] args)
    {
			
		for( int cnt =0 ; cnt < args.length ; cnt++)
		{
			if( args[cnt].equals("-s") )
			{
				this.sourcetxtfile = args[cnt+1];
			}
			if( args[cnt].equals("-t") )
			{
				this.targetxlsfile = args[cnt+1];
			}
			if( args[cnt].equals("-m") )
			{
				if( args[cnt+1].trim().equals("Y") || args[cnt+1].trim().equals("y")  )
				{
					this.guimode = true;
				}
				else if( args[cnt+1].trim().equals("N") || args[cnt+1].trim().equals("n")  )
				{
					this.guimode = false;
				}
				else
				{
					kr.blogspot.hjya.trace.Trace.trace( "Usage : -s source_txt_file_path, -t traget_xls_file_path, -m gui_mode (Y/N) ", true);
					return;
				}
			}
		}//for( int cnt =0 ; cnt < args.length ; cnt++)

    }//public UIProperty(String[] args)
    

}
