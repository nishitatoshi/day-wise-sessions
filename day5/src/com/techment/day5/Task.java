package com.techment.day5;

interface JdbcConnection
{

	
}
class Oracle implements JdbcConnection
{
	public void correct()
	{
		System.out.println("connected to oracle");
	}
}

class Sql implements JdbcConnection
{
	
}

public class Task {
public static void main(String[] args)
{
	JdbcConnection connection = new Oracle();
    connection.correct();
}
}
