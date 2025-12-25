#### JDBC:- Java Database Connectivity



* JDBC API
* JDBC DRIVER

 	Type 1- JDBC ODBC Bridge Driver

 	Type 2- Native-API Driver

 	Type 3- Network Protocol Driver

 	Type 4- Thin Driver



1. what is IDE?
2. what is JDBC?
3. how many types of jdbc driver?
4. what is jdbc driver?
5. what is JDBC API?





**Simple SQL Queries**

**Statement Interface**



**Parameterized Queries**

**PreparedStatement Interface**



**PLSQL Queries**

**CallableStatement Interface**



**ResultSet Interface**



**ResultSetMetaData**



**DatabaseMetaData**



**RowSet**





#### **Use this 5 step**





1. Register Driver
2. Create Connection
3. Create Statement
4. Execute Queries
5. Close Connection





package test;



import java.sql.\*;



public class JdbcDemo {



&nbsp;	public static void main(String\[] args) {

&nbsp;		// TODO Auto-generated method stub

&nbsp;		try

&nbsp;		{

&nbsp;			//step 1: Register a Driver

&nbsp;			Class.forName("com.mysql.cj.jdbc.Driver");

&nbsp;			

&nbsp;			//step 2: Establish a Connection

&nbsp;			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","vaibhavi\_0627");

&nbsp;			

&nbsp;			//Step 3: Create a SQL Statement

&nbsp;			Statement stmt=con.createStatement();

&nbsp;			

&nbsp;			//Step 4:Execute a SQL statement

&nbsp;			ResultSet rs=stmt.executeQuery("select \* from person");

&nbsp;			while(rs.next())

&nbsp;				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));

&nbsp;			

&nbsp;			//Step 5: close Connection

&nbsp;			con.close();

&nbsp;		}catch(Exception e)

&nbsp;		{

&nbsp;			System.out.println(e);

&nbsp;		}

&nbsp;	}



}

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

package test;



import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.PreparedStatement;



public class PreparedStmtDemo {



&nbsp;	public static void main(String\[] args) {

&nbsp;		// TODO Auto-generated method stub

&nbsp;		try

&nbsp;		{

&nbsp;			// Step 1:Register a Driver

&nbsp;			Class.forName("com.mysql.cj.jdbc.Driver");

&nbsp;			

&nbsp;			// Step 2: Establish a Connection

&nbsp;			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","vaibhavi\_0627");



&nbsp;			// Step 3: Create Query

&nbsp;			

&nbsp;			PreparedStatement pst=con.prepareStatement("insert into person values(?,?,?)");

&nbsp;			pst.setInt(1,104);

&nbsp;			pst.setString(2,"Vaibhavi");

&nbsp;			pst.setInt(3,22);

&nbsp;			

&nbsp;			// Step 4: Execute Query

&nbsp;			int i=pst.executeUpdate();

&nbsp;			

&nbsp;			System.out.println(i+"Record Inserted");

&nbsp;			

&nbsp;			// Step 5: Close Connection

&nbsp;			con.close();

&nbsp;			

&nbsp;		}catch(Exception e)

&nbsp;		{

&nbsp;			System.out.println(e);

&nbsp;		}

&nbsp;	}



}



