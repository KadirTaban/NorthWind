package ko.northwind.core.utilities.results;

public class Result {
    private boolean sucess;
    private String message;

    public Result(boolean success) {
        this.sucess=success;

    }
    public Result(boolean success,String message) {
        this(success);
        this.message=message;

    }

    public boolean isSucess(){
        return this.sucess;
    }
    public String getMessage(){
        return this.message;
    }
}
