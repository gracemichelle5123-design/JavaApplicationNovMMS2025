package school.service;

public class BackupThread extends Thread {
    private SchoolService service;
    private volatile boolean running = true;

    public BackupThread(SchoolService service) {
        this.service = service;
    }

    public void stopThread() {
        running = false;
    }

    public void run() {
        while(running) {
            try {
                Thread.sleep(60000); 
                if(running) {
                    service.saveToFile();
                    System.out.println("Auto Backup Done...");
                }
            } catch(Exception e) {}
        }
    }
}