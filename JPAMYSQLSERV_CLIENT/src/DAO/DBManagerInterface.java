package DAO;

import java.util.Collection;

public interface DBManagerInterface {
	public String creategreetings(String name);
	public String updategreetings(long id,String newname);
	public String removegreetings(long id);
	public Collection<greetings> findAllGreetings();
	public Collection<greetings> findGreetingsId(long id);
}
