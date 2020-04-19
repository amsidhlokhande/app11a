package app11a.dao;

import java.sql.Connection;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;



public class DAOBase implements DAO
{
	public Connection getConnection() throws DAOException
	{
		ServletContext servletContext = ServletActionContext
				.getServletContext();
		/*
		 * DataSource dataSource = (DataSource)
		 * servletContext.getAttribute("dataSource"); Connection connection =
		 * null; if (dataSource != null) { try { connection =
		 * dataSource.getConnection(); } catch (SQLException e) {
		 * System.out.println("DAOBase"); throw new DAOException(); } }
		 */
		Connection connection = null;
		try
		{
			System.out.println(servletContext.getAttribute("myCon"));
			connection = (Connection) servletContext.getAttribute("myCon");

			System.out.println(connection);
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
		return connection;
	}
}
