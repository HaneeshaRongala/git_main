package com.collections;

public class Studentlinkedlist
{
   String sname;
   int sid;
   String sbranch;
   int smarks;
   int sfee;
	 Studentlinkedlist(String sname,int sid,String sbranch ,int smarks,int sfee )
	{
		this.sname = sname;
		this.sid = sid;
		this.sbranch = sbranch;
		this.smarks = smarks;
		this.sfee = sfee;
		}

	 public String toString()
	 {
		 return this.sname+" "+this.sid+" "+this.sbranch+" "+this.smarks+" "+this.sfee;
	 }
	 
}
