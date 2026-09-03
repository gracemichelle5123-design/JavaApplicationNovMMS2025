package school.service;

public class AutoSaveThread extends Thread {
    private SchoolService service;
    private volatile boolean running = true;

    public AutoSaveThread(SchoolService service){ 
        this.service = service; 
        setDaemon(true); 
    }
    
    public void run(){
        while(running){
            try{ 
                Thread.sleep(300000);
                service.saveAllToDB();
                System.out.println("Auto-save completed");
            } catch(InterruptedException e){ 
                running = false;
            }
        }
    }
    
    public void stopAutoSave() {
        running = false;
        this.interrupt();
    }
}