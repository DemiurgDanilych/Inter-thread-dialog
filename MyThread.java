public class MyThread extends Thread{
	

	@Override
	public void run() {
		try {
			while (!isInterrupted()){
				Thread.sleep(1000);
				System.out.printf("Я поток %s. ", Thread.currentThread().getName());
				System.out.println("Всем привет!");
			}
		} catch (InterruptedException e){
		
		} finally {
			System.out.printf("Поток %s завершен \n", Thread.currentThread().getName());
		}
	}
}
