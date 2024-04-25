package threadbasic;

class FileDownloader extends Thread{
    public void download() {
        System.out.println("Download File");
        for (int i = 1; i <= 10; i++) {
            System.out.println("From" + i * 10 + "% Download");
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
        public void run(){
            download();
    }
}

public class ThreadswithThreadClass {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        FileDownloader downloader1 = new FileDownloader();
        FileDownloader downloader2 = new FileDownloader();
        FileDownloader downloader3 = new FileDownloader();

        downloader1.setName("Downloader 1");
        downloader2.setName("Downloader 2");
        downloader3.setName("Downloader 3");


        downloader1.start();
        downloader2.start();
        downloader3.start();

        try {
            downloader1.join();
            downloader2.join();
            downloader3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long endTime = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName());
        long difference = (endTime - startTime) / 1000;
        System.out.println("Time Taken = " + difference + " secs");

    }
}