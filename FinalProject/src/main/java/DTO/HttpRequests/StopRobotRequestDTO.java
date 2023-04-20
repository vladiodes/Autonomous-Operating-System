package DTO.HttpRequests;

import backend.finalproject.IntegrationRequests.IntegrationRequestsHandler;
import utils.IntegrationRequestResponse;

public class StopRobotRequestDTO implements HttpRequestDTO{

    public StopRobotRequestDTO(){

    }
    @Override
    public IntegrationRequestResponse visit(IntegrationRequestsHandler handler) {
        return handler.handle(this);
    }

}
