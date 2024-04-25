package threadbasic;

class Downloading implements Runnable{
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


public class ThreadwithRunnable {
 public static void main(String[] args) {
  Thread thread1 = new Thread();
  thread1.start();
  }

 }

