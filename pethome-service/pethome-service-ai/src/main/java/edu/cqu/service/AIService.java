package edu.cqu.service;

import edu.cqu.common.Response;
import org.springframework.stereotype.Service;


public interface AIService{
    public Response processPic(String picBase64) throws Exception;
    public Response processText(String text);
}
