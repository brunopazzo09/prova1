package com.progetto;

public class App{

    private static final String ME_ID = "[App]";

    public static void main(String[] args) throws Exception {
        RestApi.startServer(ME_ID, MicroExecutorConfiguration.class);
        //RestApi.startServer([MICRO EXECUTOR ID], [CLASS extends MicroExecutorConfiguration], [CALLBACK]);

    }
}

/*
@DocsService(name = "[SERVICE_NAME]", description = "Test Service description")
public class JA_TST_00 extends KokosService {

    @DocsServiceMethod(component = "TRE", function = "GET.TRE", obj1 = @DocsServiceParam(param = "[T1];[P1];[K1]", optional = false), p = {}, input = {}, description = "Service method description")
    @ServiceMethod("GET.TRE")
    public void getTRE(Fun fun, ExecutionContext context) throws Exception {
    }

}*/