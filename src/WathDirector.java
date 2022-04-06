
import javax.swing.*;
import java.io.File;
import java.nio.file.*;
import java.util.HashMap;
import java.util.Map;

public class WathDirector extends SwingWorker<Void, Void> {

    public static void main(String[] args) {
        try(WatchService service = FileSystems.getDefault().newWatchService();){
            Map<WatchKey, Path> keymap = new HashMap<>();

            Path path = Paths.get("C:\\Users\\Bilal Ahmed\\Downloads");

            keymap.put(path.register(service, StandardWatchEventKinds.ENTRY_CREATE), path);

            WatchKey watchKey;

            do{
                watchKey = service.take();
                Path eventDir = keymap.get(watchKey);

                for (WatchEvent<?> event: watchKey.pollEvents()){
                    Path eventPath = (Path) event.context();
                    System.out.println(eventDir + ":" + eventPath);
                    String name = String.valueOf(eventPath);

                    if(name.substring(name.indexOf(".")).equals(".png") || name.substring(name.indexOf(".")).equals(".jpg")) {
                        Thread.sleep(800);
                        String og = eventDir + "\\" + eventPath;
                        try {
                            File f = new File(og);
                            f.renameTo(new File("C:\\Users\\Bilal Ahmed\\Downloads\\Images\\" + eventPath));

                        } catch (Exception e) {

                        }

                    }


                }
            }while(watchKey.reset());

        }catch(Exception e){

        }

        //Since intiated in try catch section, after the try is done, the vairable will be destroyed no need to call close explictly
    }
    public static void test(Path og, Path n){
//
//                    Path original = Paths.get(og);
//                    Path newPath = Paths.get("C:\\Users\\Bilal Ahmed\\Downloads\\Images");
//
//                    test(original, newPath);
    }


    @Override
    protected Void doInBackground() throws Exception {
        return null;
    }
}
