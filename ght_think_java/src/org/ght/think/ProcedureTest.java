package org.ght.think;
import java.sql.*;

public class ProcedureTest {
	public static void main(String args[]) throws Exception {
		// 加载驱动
		DriverManager.registerDriver(new sun.jdbc.odbc.JdbcOdbcDriver());
		// 获得连接
		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/shiku_test", "root","123123");

		// 创建存储过程的对象
		CallableStatement c = conn.prepareCall("{call getsum(?)}");

		// 给存储过程的参数设置值
		c.setInt(1, 100); // 将第一个参数的值设置成100

		// 执行存储过程
		c.execute();
		conn.close();
	}
}
 
