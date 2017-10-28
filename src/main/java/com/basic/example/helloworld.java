package com.basic.example;

/**
 * Hello world!
 *
 */
import java.io.IOException;
import java.io.PrintWriter;

public class helloworld {

	public helloworld() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args){
		// TODO Auto-generated method stub
		System.out.println("hello world from jar file");
	     try
	     {
	     PrintWriter writer = new PrintWriter("archivo-de-prueba.txt", "UTF-8");
	      writer.println("texto de prueba para comprobar la creacion");
	      writer.println("de un archivo txt desde un archivo jar");
	      writer.println("usando para ello un script");
	      writer.close();
		}
		catch (IOException e)
		{
				System.out.println(e.toString());
		}
	}

}
