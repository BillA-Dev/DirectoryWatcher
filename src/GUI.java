import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GUI extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private boolean started = false;

    protected Director d = new Director();
    private final JButton btnNewButton_2;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GUI frame = new GUI();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public GUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 687, 181);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); // THIS IS GOOD
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | UnsupportedLookAndFeelException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 671, 142);
        contentPane.add(panel);
        panel.setLayout(null);

        textField = new JTextField();
        textField.setEditable(false);
        textField.setBounds(10, 31, 527, 33);
        panel.add(textField);
        textField.setColumns(10);

        JButton DirectoryButton = new JButton("Choose Directory");
        DirectoryButton.setBounds(542, 36, 124, 23);
        DirectoryButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                JFileChooser files = new JFileChooser();
                files.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                int answer = files.showOpenDialog(null);
                if (answer == JFileChooser.APPROVE_OPTION) {
                    File directorySelected = files.getSelectedFile();
                    textField.setText(directorySelected.getAbsolutePath());
                }
            }

        });
        panel.add(DirectoryButton);


        JButton Start = new JButton("Start");
        Start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!textField.getText().equals("")) {


                    //Get all the fields and pass it to the program.execute();
                    if ((d.getImageChecked() == null || d.getImageChecked().size() == 0) || (d.getCompressChecked() == null || d.getCompressChecked().size() == 0) || (d.getExtensionChecked() == null || d.getExtensionChecked().size() == 0) || (d.getAudioChecked() == null || d.getAudioChecked().size() == 0) || (d.getVideoChecked() == null || d.getVideoChecked().size() == 0)) {

                        JOptionPane.showMessageDialog(null, "Directories are missing and/or checkboxes are not checked. Please checks the settings to make sure you have everything correct!");
                    } else {
                        WathDirector program = new WathDirector(textField.getText(), d.getImageChecked(), d.getCompressChecked(), d.getExtensionChecked(), d.getVideoChecked(), d.getAudioChecked(), d.getPaths());
                        started = true;
                        DirectoryButton.setEnabled(false);

                        System.out.println(d.getImageChecked());
                        System.out.println(d.getCompressChecked());
                        System.out.println(d.getExtensionChecked());
                        System.out.println(d.getVideoChecked());
                        System.out.println(d.getAudioChecked());
                        System.out.println(Arrays.toString(d.getPaths()));

                        System.out.print(d.isOtherChecked());
                        System.out.print(d.getOtherPath());

                        program.execute();
                        btnNewButton_2.setEnabled(false);

                    }


                } else {
                    JOptionPane.showMessageDialog(null, "Please select a directory!");
                }
            }
        });
        Start.setBounds(10, 108, 89, 23);
        panel.add(Start);

        btnNewButton_2 = new JButton("Setting");
        btnNewButton_2.setEnabled(true);
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                d.execute();
            }
        });
        btnNewButton_2.setBounds(448, 108, 89, 23);
        panel.add(btnNewButton_2);

        JLabel lblNewLabel = new JLabel("Directory Watcher");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(0, 11, 671, 14);
        panel.add(lblNewLabel);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    class WathDirector extends SwingWorker<Void, Void> {

        protected String pathOfDirectory;
        protected ArrayList<String> img;
        protected ArrayList<String> compress;
        protected ArrayList<String> exe;
        protected ArrayList<String> vid;
        protected ArrayList<String> audio;
        protected String[] pathstomovefile;


        public WathDirector(String s, ArrayList<String> img, ArrayList<String> compress, ArrayList<String> exe, ArrayList<String> vid, ArrayList<String> audio, String[] arr) {
            pathOfDirectory = s;
            this.img = img;
            this.compress = compress;
            this.exe = exe;
            this.vid = vid;
            this.audio = audio;
            this.pathstomovefile = arr;
        }

        @Override
        protected Void doInBackground() throws Exception {
            // TODO Auto-generated method stub
            System.out.print("Started");

            try (WatchService service = FileSystems.getDefault().newWatchService();) {
                Map<WatchKey, Path> keymap = new HashMap<>();

                Path path = Paths.get(pathOfDirectory);

                keymap.put(path.register(service, StandardWatchEventKinds.ENTRY_CREATE), path);

                WatchKey watchKey;

                do {
                    watchKey = service.take();
                    Path eventDir = keymap.get(watchKey);

                    for (WatchEvent<?> event : watchKey.pollEvents()) {
                        Path eventPath = (Path) event.context();
                        System.out.println(eventDir + ":" + eventPath);
                        String name = String.valueOf(eventPath);
                        boolean found = false;
                        for (String s : img) {
                            if (name.substring(name.indexOf(".")).equals(s)) {
                                Thread.sleep(800);
                                String og = eventDir + "\\" + eventPath;
                                System.out.println("Found Image");
                                try {
                                    File f = new File(og);
                                    f.renameTo(new File(pathstomovefile[0] + "\\" + eventPath));
                                    found = true;
                                    break;
                                } catch (Exception e) {
                                    //Failed
                                }

                            }
                        }

                        for (String s : compress) {
                            if (name.substring(name.indexOf(".")).equals(s)) {
                                Thread.sleep(800);
                                String og = eventDir + "\\" + eventPath;
                                try {
                                    File f = new File(og);
                                    f.renameTo(new File(pathstomovefile[1] + "\\" + eventPath));
                                    found = true;
                                    break;
                                } catch (Exception e) {
                                    //Failed
                                }

                            }
                        }
                        for (String s : exe) {
                            if (name.substring(name.indexOf(".")).equals(s)) {
                                Thread.sleep(800);
                                String og = eventDir + "\\" + eventPath;
                                try {
                                    File f = new File(og);
                                    f.renameTo(new File(pathstomovefile[2] + "\\" + eventPath));
                                    found = true;
                                    break;
                                } catch (Exception e) {
                                    //Failed
                                }

                            }
                        }
                        for (String s : vid) {
                            if (name.substring(name.indexOf(".")).equals(s)) {
                                Thread.sleep(800);
                                String og = eventDir + "\\" + eventPath;
                                try {
                                    File f = new File(og);
                                    f.renameTo(new File(pathstomovefile[3] + "\\" + eventPath));
                                    found = true;
                                    break;
                                } catch (Exception e) {
                                    //Failed
                                }

                            }
                        }
                        for (String s : audio) {
                            if (name.substring(name.indexOf(".")).equals(s)) {
                                Thread.sleep(800);
                                String og = eventDir + "\\" + eventPath;
                                try {
                                    File f = new File(og);
                                    f.renameTo(new File(pathstomovefile[4] + "\\" + eventPath));
                                    found = true;
                                    break;
                                } catch (Exception e) {
                                    //Failed
                                }

                            }
                        }

                        if (Boolean.parseBoolean(getOtherStuff()[0]) && !found) {
                            Thread.sleep(800);
                            String og = eventDir + "\\" + eventPath;
                            try {
                                File f = new File(og);
                                f.renameTo(new File(getOtherStuff()[1] + "\\" + eventPath));

                            } catch (Exception e) {
                                //Failed
                            }
                        }


                    }
                } while (watchKey.reset());

            } catch (Exception e) {

            }


            return null;
        }

        public String[] getOtherStuff() throws Exception {
            BufferedReader bufferedReader3 = new BufferedReader(

                    new FileReader(Paths.get("Other.txt").toString()));


            String[] other = new String[2];
            int i = 0;

            String sCurrentLine = null;

            while ((sCurrentLine = bufferedReader3.readLine()) != null) {


                other[i] = sCurrentLine;
                i++;


            }

            return other;
        }
    }
}


