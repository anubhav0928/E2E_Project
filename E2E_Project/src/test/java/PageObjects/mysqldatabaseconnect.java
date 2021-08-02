		package PageObjects;
		
		import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.ResultSet;
		import java.sql.SQLException;
		import java.sql.Statement;
		
		
		
		public class mysqldatabaseconnect {
		
			public static void main(String[] args) throws SQLException {
				// TODO Auto-generated method stub
		String HOST="199.212.26.208";
		String pORT="1521";
		
			     
			
			  String use= "COMP122M21_001_P_16";
			  String pass="password"; 
			  try {
			  Class.forName("oracle.jdbc.driver.OracleDriver");
			  Connection con=DriverManager.getConnection(  
						 "jdbc:oracle:thin:@199.212.26.208:1521/SQLD",use,pass);
						Statement s=con.createStatement();
						System.out.println(con);
						String quer1="insert INTO countries(country_id,country_name,region_id)VALUES(24,'usd',27)";
						String quer2="Select * From Countries where region_id='27'";
						s.execute(quer1);
						ResultSet rs=s.executeQuery(quer2);
						
						while(rs.next()) {
							System.out.println(rs.getString("COUNTRY_ID"));
							System.out.println(rs.getString("COUNTRY_NAME"));
							System.out.println(rs.getString("REGION_ID"));
						}
						
		}  
			  catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		        
			}
		
		}
