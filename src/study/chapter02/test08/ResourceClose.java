package study.chapter02.test08;

public class ResourceClose implements AutoCloseable {

    private long startTime;

    public ResourceClose() {
        startTime = System.currentTimeMillis();
        System.out.println("ResourceClose创建了");
    }

    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    @Override
    public void close() throws Exception {
        long endTime = System.currentTimeMillis();
        System.out.println("ResourceClose的close方法关闭了");
        System.out.println("创建到调用finalize方法的时间:" + (endTime - this.startTime));
    }
}
