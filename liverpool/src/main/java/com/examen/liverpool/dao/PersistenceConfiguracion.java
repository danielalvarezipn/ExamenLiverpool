package com.examen.liverpool.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Logger;

@Component
public class PersistenceConfiguracion {

    Logger logger = Logger.getLogger(getClass().getName());

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PersistenceConfiguracion(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Connection generarConexion() throws SQLException {
        DataSource dataSource = jdbcTemplate.getDataSource();
        return dataSource != null ? dataSource.getConnection() : null;

    }


    public void cerrarConexion(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                logger.info("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
}
