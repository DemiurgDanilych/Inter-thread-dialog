import java.util.ArrayList;
import java.util.List;

public class MainStream {
	
	public static void main(String[] args) {
		
		MyThread secondaryThread = new MyThread();
		List<Thread> threadList = new ArrayList<>();
		ThreadGroup threadGroup = new ThreadGroup("threadGroup");
		final int numbeOfThreads = 4;
		
		// Создаём потоки .
		System.out.println("Создаём потоки...");
		for (int i = 1; i <= numbeOfThreads; i++) {
			Thread t = new Thread(threadGroup,secondaryThread,"" + i +"");
			threadList.add(t);
		}
		
		//Запускаем потоки.
		for (Thread t: threadList) {
			t.start();
		}
		
		//Усыпляем основной поток.
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e){
		
		}
		
		//Завершаем потоки...
		threadGroup.interrupt();
		System.out.println("Завершаю все потоки.");
	}
}
