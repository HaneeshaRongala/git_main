package com.collections;

import java.util.Iterator;
import java.util.Vector;

public class Studentv 
{
	public static void main(String[] args)
	{
		Vector<Studentvector> vec = new Vector<>();
		Studentvector student1 = new Studentvector("Hanee", 503,"Computer Science Engineering");
		Studentvector student2 = new Studentvector("Lucky", 504,"Electrical Engineering");
		Studentvector student3 = new Studentvector("Vijju", 505,"Civil Engineering");
		vec.add(student1);
		vec.add(student2);
		vec.add(student3);
		System.out.println("Display students details:");
		for (Iterator<Studentvector> iterator = vec.iterator(); iterator.hasNext();) 
		{
			var student = iterator.next();
			System.out.println(student + "\t");

		}
		// gives the index of the element
		{
			System.out.println();
			System.out.println("element at index student2 is: " + vec.get(2));
			System.out.println();
			System.out.println("Display the initial capacity:" + vec.capacity());
		}
		vec.trimToSize();
		System.out.println();
		System.out.println("Display students details after trimming the size:" + vec.capacity());
		for(Studentvector sv:vec)
		{
			System.out.println(sv + "\t");
		}
		
		// removing the second element 
		vec.remove(2);
		System.out.println();
		System.out.println("Display students details after removing element:");
		for (Studentvector sv:vec) 
		{
			
			System.out.println(sv + "\t");
		}
		System.out.println();
		{
			Vector<Studentvector> vec1 = new Vector<>();
			vec1.addAll(vec);
			if (vec.equals(vec1))  // checks whether the both the vectors are equal
				System.out.println("vec=vec1");
			{
			}
		}
	}
}
