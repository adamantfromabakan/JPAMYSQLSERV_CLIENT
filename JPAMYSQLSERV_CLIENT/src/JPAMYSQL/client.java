package JPAMYSQL;

import java.util.Collection;
import java.util.Hashtable;
import javax.naming.Context;
//import org.apache.log4j.Logger;

import DAO.DBManagerInterface;
import DAO.greetings;
import DAO.greetingsinterface;

public class client {
	   public static void main(String[] args) throws Exception
	   {
		   Context context = getInitialContext();
		   //greetingsinterface grdb = (greetingsinterface) context.lookup("ejb:/JPAMYSQLSERV/greetingsbean!DAO.greetingsinterface");
		   DBManagerInterface grdb = (DBManagerInterface) context.lookup("ejb:/JPAMYSQLSERV/DBManager!DAO.DBManagerInterface");
		   grdb.creategreetings("!!!!!!!!!!!!!!! Create record !!!!!!!!!!");
		   //System.err.println(grdb.INS_GREETINGS("!!!!!!!!!First program JPA!!!!!!"));
		   //System.err.println(grdb.REM_GREETINGS(3));
		   //System.err.println(grdb.UPD_GREETINGS(4,"!!!!!!!!!   UPDATED  !!!!!!"));
		   //System.err.println(grdb.UPD_GREETINGS(5,"!!!!!!!!!   UPDATED  !!!!!!"));
		   //Collection<greetings> list = grdb.findAllGreetings();
		   ////System.out.println(list.toString());
		   //for(greetings tmp : list) {
			//	 System.out.println("Id=" + tmp.getId() + " Name=" + tmp.getName());
		     //  }
		   //final greetings gr = grdb.FindGreetings(2);
		   //System.out.println(grdb.FindGreetings(0));
		   //System.out.println(gr.getName());
	   }
	
	   public static Context getInitialContext()
				throws javax.naming.NamingException {
			
			Hashtable<String, String> prop = new Hashtable<String, String>();
			prop.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
			return new javax.naming.InitialContext(prop);
			
		}
	}