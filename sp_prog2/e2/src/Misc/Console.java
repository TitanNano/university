package Misc;

import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Console {
	protected PrintStream stream = System.out;

	public void log(Object... args){
		stream.print(new SimpleDateFormat("HH:mm:ss").format(new Date().getTime()) + ": ");
		for(int i= 0; i < args.length; i++){
			Object item= args[i];
			stream.print("\""+ item +"\"");
			if(i < args.length-1){
				stream.print(", ");
			}
		}
		stream.println();
	}

	public void br(){
		this.log("------------------------------- BREAK -------------------------------");
	}
}
