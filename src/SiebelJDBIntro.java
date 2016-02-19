import com.siebel.data.SiebelDataBean;
import com.siebel.data.SiebelException;
import com.siebel.data.SiebelPropertySet;
import com.siebel.data.SiebelService;


public class SiebelJDBIntro {
		public static void main(String[] args) {
			try {
				SiebelDataBean sbean = new SiebelDataBean();
				sbean.login("siebel://sblva:2321/ENT_LMVA/loyaltyObjMgrLegacy_enu", "SADMIN", "t00s4dman", "enu");
					
				SiebelService service = sbean.getService("SampleBS");
				SiebelPropertySet input = new SiebelPropertySet();
				SiebelPropertySet output = new SiebelPropertySet();
				input.setValue("Hello! This is my first Siebel JDB program");
				service.invokeMethod("SimpleInOut",input , output);
				System.out.println("Output from Siebel: "+output);
				} 
				catch (SiebelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
		}
	
}
