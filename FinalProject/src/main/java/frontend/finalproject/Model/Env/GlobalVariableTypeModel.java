package frontend.finalproject.Model.Env;

public class GlobalVariableTypeModel {
    protected String TypeName;
    protected String Type;

    public GlobalVariableTypeModel(String TypeName, String Type){
        this.TypeName = TypeName;
        this.Type = Type;
    }

    public String getTypeName() {
        return TypeName;
    }

    public String getType() {
        return Type;
    }
}
