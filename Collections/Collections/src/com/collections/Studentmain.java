package com.collections;

import java.util.LinkedList;

public class Studentmain
{

	public static void main(String[] args) 
	{
        LinkedList<Studentlinkedlist> linkedlist = new LinkedList<Studentlinkedlist>();
        Studentlinkedlist student1 = new Studentlinkedlist("Hanee",   503,  "Computer Science Engineering",990,  85000);
        Studentlinkedlist student2 = new Studentlinkedlist("Lucky",   504,  "Electrical Engineering",840,  79000);
        Studentlinkedlist student3 = new Studentlinkedlist("Vijju",   505,  "Mechanical Engineering",640,  70000);
        Studentlinkedlist student4 = new Studentlinkedlist("Bindhu",  506,  "Civil Engineering",540,  60000);
        Studentlinkedlist student5 = new Studentlinkedlist("Sampada", 507,  "Mining Engineering",840,  76000);
		linkedlist.add(student1);
		linkedlist.add(student2);
		linkedlist.add(student3);
		linkedlist.add(student4);
		linkedlist.add(student5);
		System.out.println("Display students details:");
		for(Studentlinkedlist student:linkedlist)
		{
			
			
			System.out.println(student +   "\t");
		}
		linkedlist.removeFirst();
		System.out.println();
		System.out.println("After removing display students details:");
		for(Studentlinkedlist student:linkedlist)
		{
			
			System.out.println(student +   "\t");
			
		}
	}
}
	
