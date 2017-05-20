package com.adaptionsoft.games.uglytrivia;


public class MailingListDispatcher {
    private MailService service;
    int status;

    public MailingListDispatcher() {
        service = new MailService();
        status = 0;
        int clientType = 12;
        service.connect();
        if (service.getStatus() == MailService.MS_AVAILABLE) {
            service.register(this, clientType);
            service.setParam(clientType);
        }
        else
            status = -1;
    }

    public void sendMessage(String message) {

    }
}
