package org.ght.think;
import java.sql.*;

public class ProcedureTest {
	public static void main(String args[]) throws Exception {
		// ��������
		DriverManager.registerDriver(new sun.jdbc.odbc.JdbcOdbcDriver());
		// �������
		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/shiku_test", "root","123123");

		// �����洢���̵Ķ���
		CallableStatement c = conn.prepareCall("{call getsum(?)}");

		// ���洢���̵Ĳ�������ֵ
		c.setInt(1, 100); // ����һ��������ֵ���ó�100

		// ִ�д洢����
		c.execute();
		conn.close();
	}
}
 
