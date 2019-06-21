package com.collections;

public class Studentvector
{
	   String sname;
	   int sid;
	   String sbranch;
	   Studentvector(String sname,int sid,String sbranch)
	   {
		    this.sname = sname;
			this.sid = sid;
			this.sbranch = sbranch;
	   }
	   public String toString()
		 {
			 return this.sname+" "+this.sid+" "+this.sbranch;
		 }
}
