package JPAMYSQL;

import java.util.Collection;
import java.util.Hashtable;
import javax.naming.Context;
//import org.apache.log4j.Logger;

import DAO.DBManagerInterface;
import DAO.greetings;

public class client {
	   public static void main(String[] args) throws Exception
	   {
		   Context context = getInitialContext();
		   //greetingsinterface grdb = (greetingsinterface) context.lookup("ejb:/JPAMYSQLSERV/greetingsbean!DAO.greetingsinterface");
		   DBManagerInterface grdb = (DBManagerInterface) context.lookup("ejb:/JPAMYSQLSERV/DBManager!DAO.DBManagerInterface");
		   System.err.println(grdb.creategreetings("!!!!!!!!!!!!!!! Create record !!!!!!!!!!"));
		   System.err.println(grdb.updategreetings(2,  "!!!!!!!!!!!!!!! Updated record !!!!!!!!!!"));
		   System.err.println(grdb.updategreetings(3,  "!!!!!!!!!!!!!!! Updated record !!!!!!!!!!"));
		   System.err.println(grdb.removegreetings(4));
		   
		   //System.err.println(grdb.INS_GREETINGS("!!!!!!!!!First program JPA!!!!!!"));
		   //System.err.println(grdb.REM_GREETINGS(3));
		   //System.err.println(grdb.UPD_GREETINGS(4,"!!!!!!!!!   UPDATED  !!!!!!"));
		   //System.err.println(grdb.UPD_GREETINGS(5,"!!!!!!!!!   UPDATED  !!!!!!"));
		   
		   Collection<greetings> list = grdb.findAllGreetings();
		   ////System.out.println(list.toString());
		   for(greetings tmp : list) {
				 System.out.println("Id=" + tmp.getId() + " Name=" + tmp.getName());
		       }
		   
		   System.out.println("*************query one record*******************");		   
		   Collection<greetings> list_id = grdb.findGreetingsId(1);
		   System.out.println(list_id.toString());		
		   for(greetings tmp2 : list_id) {
				 System.out.println("Id=" + tmp2.getId() + " Name=" + tmp2.getName());
		       }
		   
		   //final greetings gr = grdb.findGreetingsId(2);
		   //System.out.println(grdb.findGreetingsId(0));
		   //System.out.println(gr.getName());
	   }
	
	   public static Context getInitialContext()
				throws javax.naming.NamingException {
			
			Hashtable<String, String> prop = new Hashtable<String, String>();
			prop.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
			return new javax.naming.InitialContext(prop);
			
		}
	}