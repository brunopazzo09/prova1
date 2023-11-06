package com.progetto;

public class App{

    private static final String ME_ID = "[APPLICATION_ID]";

    public static void main(String[] args) throws Exception {
        RestApi.startServer(ME_ID, MicroExecutorConfiguration.class);
        //RestApi.startServer([MICRO EXECUTOR ID], [CLASS extends MicroExecutorConfiguration], [CALLBACK]);
    }
}