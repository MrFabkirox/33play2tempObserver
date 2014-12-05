package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.validation.Constraints;
import play.db.ebean.Model;

@Entity
public class Mess extends Model {
	
	public String author;
	public String message;
	
	
	public static Finder<String, Mess> find = 
			new Finder<String, Mess>(String.class, Mess.class); 
		
}
