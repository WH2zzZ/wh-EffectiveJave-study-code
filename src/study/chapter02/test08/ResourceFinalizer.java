package study.chapter02.test08;

public class ResourceFinalizer {

    private long startTime;

    public ResourceFinalizer() {
        startTime = System.currentTimeMillis();
    }

    private void close(){
        System.out.println("ResourceFinalizer的close的方法执行了");
    }

    @Override
    protected void finalize() throws Throwable {
        long endTime = System.currentTimeMillis();
        System.out.println("ResourceFinalizer的finalize方法开始执行了");
        System.out.println("创建到调用finalize方法的时间:" + (endTime - this.startTime));
        close();
        super.finalize();
    }
}
