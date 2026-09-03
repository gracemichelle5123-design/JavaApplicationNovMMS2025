package main;

import school.service.SchoolService;

public class AutoSaveThread extends Thread {
    private SchoolService service;
    
    public AutoSaveThread(SchoolService service) {
        this.service = service;
        setDaemon(true); // runs in background
    }
    
    @Override
    public void run() {
        // PART 32: Threading. PART 33: Timer
        while(true) {
            try {
                Thread.sleep(60000); // 60 seconds
                System.out.println("\n[AUTO-SAVE] Saving data to file...");
                service.saveAllToFile();
                service.saveAllToDB();
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}