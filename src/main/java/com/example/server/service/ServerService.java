package com.example.server.service;

import com.example.server.model.Server;
import com.example.server.repo.ServerRepo;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Collection;

public interface ServerService {
    Server create(Server server);

    Server ping(String ipAddress) throws IOException;

    Collection<Server> list(int limit);

    Server get(Long id);

    Server update(Server server);

    Boolean delete(Long id);
}
