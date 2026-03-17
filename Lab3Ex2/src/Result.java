public class Result {
    private boolean success;
    private Object data;
    private Exception error;

    public Result(boolean success, Object data, Exception error) {
        this.success = success;
        this.data = data;
        this.error = error;
    }

    public boolean isSuccess() {
        return success;
    }

    public Object getData() {
        return data;
    }

    public Exception getError() {
        return error;
    }

}
