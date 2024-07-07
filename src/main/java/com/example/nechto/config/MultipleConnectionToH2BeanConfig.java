package com.example.nechto.config;

import org.h2.tools.Server;
import org.springframework.context.annotation.Bean;

import java.sql.SQLException;

public class MultipleConnectionToH2BeanConfig {

    @Bean(initMethod = "start", destroyMethod = "stop")
    public Server inMemoryH2DatabaseaServer() throws SQLException {
        return Server.createTcpServer("-tcp", "-tcpAllowOthers", "-tcpPort", "9090");
    }

}
