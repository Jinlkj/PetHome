package edu.cqu.service.impl;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import edu.cqu.common.Response;
import edu.cqu.service.AIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AIServiceImpl implements AIService {
    @Autowired
    Connection connection;
    @Override
    public Response processPic(String picBase64) throws Exception{
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();
        channel.queueDeclare("ai_task_queue", false, false, false, null);
        channel.basicPublish("", "ai_task_queue", null, picBase64.getBytes());
        return Response.okResult(200," [x] Sent '" + picBase64 + "'",null);
    }

    @Override
    public Response processText(String text) {
        return null;
    }
}
