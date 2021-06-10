package ko.northwind.core.utilities.results;
//T burada DataResult'a farklı tiplerde verilerin hangisini döndürdüğünü söyler.
public class DataResult<T> extends Result{
    private T data;
    public DataResult(T data,boolean success,String message){
        super(success,message);
        this.data=data;
    }

    public DataResult(T data , boolean success) {
        super(success);
        this.data=data;
    }
    public T getData(){

        return  this.data;

    }
}
