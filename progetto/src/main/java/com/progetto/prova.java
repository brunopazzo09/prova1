@DocsService(name = "prova", description = "Service description")
public class prova extends KokosService {

    @DocsServiceMethod(component = "TRE", function = "[METHOD_NAME]", obj1 = @DocsServiceParam(param = "[T1];[P1];[K1]", optional = false), p = {}, input = {}, description = "Service method description")
    @ServiceMethod([METHOD_NAME])
    public void methodName(Fun fun, ExecutionContext context) throws Exception {
    }
}