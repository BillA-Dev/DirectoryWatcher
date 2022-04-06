import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;


public class Director extends JFrame {


    private JPanel contentPane;

    private JTextField imgTextField;

    private JTextField compressedFeild;

    private JTextField exefield;

    private JTextField vidfeild;

    private JTextField audiofiel;

    private JTextField otherfield;


    private JCheckBox[] arr;
    private JCheckBox chckbxNewCheckBox;
    private JCheckBox chckbxbmp;
    private JCheckBox chckbxgif;
    private JCheckBox chckbxico;
    private JCheckBox chckbxjpeg;
    private JCheckBox chckbxNewCheckBox_4_1;
    private JCheckBox chckbxNewCheckBox_4_2;
    private JCheckBox chckbxNewCheckBox_4_2_1;
    private JCheckBox chckbxNewCheckBox_4_2_2;
    private JCheckBox chckbxNewCheckBox_4_2_3;
    private JCheckBox chckbxz;
    private JCheckBox chckbxarj;
    private JCheckBox chckbxdeb;
    private JCheckBox chckbxpkg;
    private JCheckBox chckbxrar;
    private JCheckBox chckbxNewCheckBox_4_1_1;
    private JCheckBox chckbxNewCheckBox_4_2_4;
    private JCheckBox chckbxNewCheckBox_4_2_1_1;
    private JCheckBox chckbxNewCheckBox_4_2_2_1;
    private JCheckBox chckbxapk;
    private JCheckBox chckbxarj_1;
    private JCheckBox chckbxdeb_1;
    private JCheckBox chckbxpkg_1;
    private JCheckBox chckbxrar_1;
    private JCheckBox chckbxNewCheckBox_4_1_1_1;
    private JCheckBox chckbxNewCheckBox_4_2_4_1;
    private JCheckBox chckbxNewCheckBox_4_2_1_1_1;
    private JCheckBox chckbxNewCheckBox_4_2_2_1_1;
    private JCheckBox chckbxNewCheckBox_4_2_1_1_1_1;
    private JCheckBox chckbxNewCheckBox_4_2_1_1_1_1_1;
    private JCheckBox chckbxg;
    private JCheckBox chckbxarj_1_1;
    private JCheckBox chckbxdeb_1_1;
    private JCheckBox chckbxpkg_1_1;
    private JCheckBox chckbxrar_1_1;
    private JCheckBox chckbxNewCheckBox_4_1_1_1_1;
    private JCheckBox chckbxNewCheckBox_4_2_4_1_1;
    private JCheckBox chckbxNewCheckBox_4_2_1_1_1_2;
    private JCheckBox chckbxNewCheckBox_4_2_2_1_1_1;
    private JCheckBox chckbxNewCheckBox_4_2_1_1_1_1_2;
    private JCheckBox chckbxNewCheckBox_4_2_1_1_1_1_1_1;
    private JCheckBox chckbxNewCheckBox_4_2_1_1_1_1_2_1;
    private JCheckBox chckbxdeb_1_1_1;
    private JCheckBox chckbxNewCheckBox_4_1_1_1_1_1;
    private JCheckBox chckbxaif;
    private JCheckBox chckbxarj_1_1_1;
    private JCheckBox chckbxdeb_1_1_2;
    private JCheckBox chckbxpkg_1_1_1;
    private JCheckBox chckbxrar_1_1_1;
    private JCheckBox chckbxNewCheckBox_4_1_1_1_1_2;
    private JCheckBox chckbxNewCheckBox_4_2_4_1_1_1;
    private JCheckBox chckbxNewCheckBox_4_2_1_1_1_2_1;
    private JCheckBox chckbxNewCheckBox_4_2_2_1_1_1_1;
    private JCheckBox chckbxNewCheckBox_1;
    private JCheckBox chckbxNewCheckBox_11;


    /**
     * Launch the application.
     */

    public static void execute() {

        EventQueue.invokeLater(new Runnable() {

            public void run() {

                try {

                    Director frame = new Director();

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

    public Director() {


        try {


            BufferedReader bufferedReader = new BufferedReader(

                    new FileReader(Paths.get("JCheckBox_Checked.txt").toString()));


            String sCurrentLine;

            ArrayList<Boolean> arr = new ArrayList<>();

            while ((sCurrentLine = bufferedReader.readLine()) != null) {


                arr.add(Boolean.parseBoolean(sCurrentLine));


            }


            //TextField.txt


            BufferedReader bufferedReader2 = new BufferedReader(

                    new FileReader(Paths.get("TextField.txt").toString()));


            String[] text = new String[6];
            int i = 0;

            while ((sCurrentLine = bufferedReader2.readLine()) != null) {


                text[i] = sCurrentLine;
                i++;


            }


            BufferedReader bufferedReader3 = new BufferedReader(

                    new FileReader(Paths.get("Other.txt").toString()));


            String[] other = new String[2];
            i = 0;

            while ((sCurrentLine = bufferedReader3.readLine()) != null) {


                other[i] = sCurrentLine;
                i++;


            }

            createGUI(arr, text, other);


        } catch (Exception e) {
            createGUI(null, null, null); //YK not save found so send null
        }

    }


    public void createGUI(ArrayList<Boolean> arr, String[] text, String[] otherText) {

        // TODO Auto-generated catch block

        // FILE NOT FOUND

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); // THIS IS GOOD
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | UnsupportedLookAndFeelException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        setType(Type.POPUP);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setBounds(100, 100, 1046, 798);

        contentPane = new JPanel();

        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);


        contentPane.setLayout(null);


        JPanel panel = new JPanel();

        panel.setBounds(0, 0, 1030, 707);

        contentPane.add(panel);

        panel.setLayout(null);


        ////////////////////////////////////////////// IMGAE////////////////////////////////////////////////

        JPanel Image_Panel = new JPanel();

        Image_Panel.setBounds(0, 0, 1030, 110);

        panel.add(Image_Panel);

        Image_Panel.setLayout(null);


        JLabel lblNewLabel = new JLabel("IMAGES");

        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);

        lblNewLabel.setBounds(-1, 4, 1030, 14);

        Image_Panel.add(lblNewLabel);


        chckbxNewCheckBox = new JCheckBox(".ai");

        chckbxNewCheckBox.setFocusPainted(false);

        chckbxNewCheckBox.setBounds(10, 18, 43, 23);

        Image_Panel.add(chckbxNewCheckBox);


        chckbxbmp = new JCheckBox(".bmp");

        chckbxbmp.setFocusPainted(false);

        chckbxbmp.setBounds(10, 44, 52, 23);

        Image_Panel.add(chckbxbmp);


        chckbxgif = new JCheckBox(".gif");

        chckbxgif.setFocusPainted(false);

        chckbxgif.setBounds(10, 70, 43, 23);

        Image_Panel.add(chckbxgif);


        chckbxico = new JCheckBox(".ico");

        chckbxico.setFocusPainted(false);

        chckbxico.setBounds(64, 21, 43, 23);

        Image_Panel.add(chckbxico);


        chckbxjpeg = new JCheckBox(".jpg");

        chckbxjpeg.setFocusPainted(false);

        chckbxjpeg.setBounds(64, 44, 52, 23);

        Image_Panel.add(chckbxjpeg);


        chckbxNewCheckBox_4_1 = new JCheckBox(".png");

        chckbxNewCheckBox_4_1.setFocusPainted(false);

        chckbxNewCheckBox_4_1.setBounds(64, 70, 52, 23);

        Image_Panel.add(chckbxNewCheckBox_4_1);


        chckbxNewCheckBox_4_2 = new JCheckBox(".psd");

        chckbxNewCheckBox_4_2.setFocusPainted(false);

        chckbxNewCheckBox_4_2.setBounds(115, 21, 52, 23);

        Image_Panel.add(chckbxNewCheckBox_4_2);


        imgTextField = new JTextField();

        imgTextField.setEnabled(false);

        imgTextField.setBounds(254, 31, 620, 48);

        Image_Panel.add(imgTextField);

        imgTextField.setColumns(10);


        JButton imgbutton = new JButton("Choose Dir");

        imgbutton.setBounds(884, 44, 136, 23);
        imgbutton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser files = new JFileChooser();
                files.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                int answer = files.showOpenDialog(null);
                if (answer == JFileChooser.APPROVE_OPTION) {
                    File directorySelected = files.getSelectedFile();
                    imgTextField.setText(directorySelected.getAbsolutePath());
                }
            }
        });

        Image_Panel.add(imgbutton);


        chckbxNewCheckBox_4_2_1 = new JCheckBox(".ps");

        chckbxNewCheckBox_4_2_1.setFocusPainted(false);

        chckbxNewCheckBox_4_2_1.setBounds(115, 44, 52, 23);

        Image_Panel.add(chckbxNewCheckBox_4_2_1);


        chckbxNewCheckBox_4_2_2 = new JCheckBox(".svg");

        chckbxNewCheckBox_4_2_2.setFocusPainted(false);

        chckbxNewCheckBox_4_2_2.setBounds(115, 70, 52, 23);

        Image_Panel.add(chckbxNewCheckBox_4_2_2);


        chckbxNewCheckBox_4_2_3 = new JCheckBox(".tif");

        chckbxNewCheckBox_4_2_3.setFocusPainted(false);

        chckbxNewCheckBox_4_2_3.setBounds(164, 43, 52, 23);

        Image_Panel.add(chckbxNewCheckBox_4_2_3);


        JCheckBox[] img = {chckbxNewCheckBox, chckbxbmp, chckbxgif, chckbxico, chckbxjpeg, chckbxNewCheckBox_4_1,

                chckbxNewCheckBox_4_2, chckbxNewCheckBox_4_2_1, chckbxNewCheckBox_4_2_2, chckbxNewCheckBox_4_2_3};


        ///////////////////////////// IMAGE

        ///////////////////////////// PANEL///////////////////////////////////////////////////////////////////////////////////


        JSeparator separator = new JSeparator();

        separator.setBounds(0, 110, 1030, 2);

        panel.add(separator);


        JPanel Compress_Panel = new JPanel();

        Compress_Panel.setLayout(null);

        Compress_Panel.setBounds(1, 112, 1030, 110);

        panel.add(Compress_Panel);


        JLabel lblCompressed = new JLabel("Compressed");

        lblCompressed.setHorizontalAlignment(SwingConstants.CENTER);

        lblCompressed.setBounds(-1, 4, 1030, 14);

        Compress_Panel.add(lblCompressed);


        chckbxz = new JCheckBox(".7z");

        chckbxz.setFocusPainted(false);

        chckbxz.setBounds(10, 18, 43, 23);

        Compress_Panel.add(chckbxz);


        chckbxarj = new JCheckBox(".arj");

        chckbxarj.setFocusPainted(false);

        chckbxarj.setBounds(10, 44, 52, 23);

        Compress_Panel.add(chckbxarj);


        chckbxdeb = new JCheckBox(".deb");

        chckbxdeb.setFocusPainted(false);

        chckbxdeb.setBounds(10, 70, 52, 23);

        Compress_Panel.add(chckbxdeb);


        chckbxpkg = new JCheckBox(".pkg");

        chckbxpkg.setFocusPainted(false);

        chckbxpkg.setBounds(64, 21, 52, 23);

        Compress_Panel.add(chckbxpkg);


        chckbxrar = new JCheckBox(".rar");

        chckbxrar.setFocusPainted(false);

        chckbxrar.setBounds(64, 44, 52, 23);

        Compress_Panel.add(chckbxrar);


        chckbxNewCheckBox_4_1_1 = new JCheckBox(".rpm");

        chckbxNewCheckBox_4_1_1.setFocusPainted(false);

        chckbxNewCheckBox_4_1_1.setBounds(64, 70, 52, 23);

        Compress_Panel.add(chckbxNewCheckBox_4_1_1);


        chckbxNewCheckBox_4_2_4 = new JCheckBox(".tar.gz");

        chckbxNewCheckBox_4_2_4.setFocusPainted(false);

        chckbxNewCheckBox_4_2_4.setBounds(115, 21, 72, 23);

        Compress_Panel.add(chckbxNewCheckBox_4_2_4);


        compressedFeild = new JTextField();

        compressedFeild.setEnabled(false);

        compressedFeild.setColumns(10);

        compressedFeild.setBounds(254, 31, 620, 48);

        Compress_Panel.add(compressedFeild);


        JButton compbutton = new JButton("Choose Dir");

        compbutton.setBounds(884, 44, 136, 23);
        compbutton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser files = new JFileChooser();
                files.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                int answer = files.showOpenDialog(null);
                if (answer == JFileChooser.APPROVE_OPTION) {
                    File directorySelected = files.getSelectedFile();
                    compressedFeild.setText(directorySelected.getAbsolutePath());
                }
            }
        });

        Compress_Panel.add(compbutton);


        chckbxNewCheckBox_4_2_1_1 = new JCheckBox(".z");

        chckbxNewCheckBox_4_2_1_1.setFocusPainted(false);

        chckbxNewCheckBox_4_2_1_1.setBounds(115, 44, 52, 23);

        Compress_Panel.add(chckbxNewCheckBox_4_2_1_1);


        chckbxNewCheckBox_4_2_2_1 = new JCheckBox(".zip");

        chckbxNewCheckBox_4_2_2_1.setFocusPainted(false);

        chckbxNewCheckBox_4_2_2_1.setBounds(115, 70, 52, 23);

        Compress_Panel.add(chckbxNewCheckBox_4_2_2_1);


        JCheckBox[] compress = {chckbxz, chckbxarj, chckbxdeb, chckbxpkg, chckbxrar, chckbxNewCheckBox_4_1_1,

                chckbxNewCheckBox_4_2_4, chckbxNewCheckBox_4_2_1_1, chckbxNewCheckBox_4_2_2_1};

        /////////////////////////////////////////// COMPRES/////////////////////////////

        JSeparator separator_1 = new JSeparator();

        separator_1.setBounds(0, 223, 1030, 2);

        panel.add(separator_1);


        JPanel Executable = new JPanel();

        Executable.setLayout(null);

        Executable.setBounds(1, 224, 1030, 110);

        panel.add(Executable);


        JLabel lblExecutable = new JLabel("Executable");

        lblExecutable.setHorizontalAlignment(SwingConstants.CENTER);

        lblExecutable.setBounds(-1, 4, 1030, 14);

        Executable.add(lblExecutable);


        chckbxapk = new JCheckBox(".apk");

        chckbxapk.setFocusPainted(false);

        chckbxapk.setBounds(10, 18, 52, 23);

        Executable.add(chckbxapk);


        chckbxarj_1 = new JCheckBox(".bat");

        chckbxarj_1.setFocusPainted(false);

        chckbxarj_1.setBounds(10, 44, 52, 23);

        Executable.add(chckbxarj_1);


        chckbxdeb_1 = new JCheckBox(".bin");

        chckbxdeb_1.setFocusPainted(false);

        chckbxdeb_1.setBounds(10, 70, 52, 23);

        Executable.add(chckbxdeb_1);


        chckbxpkg_1 = new JCheckBox(".cgi");

        chckbxpkg_1.setFocusPainted(false);

        chckbxpkg_1.setBounds(64, 21, 52, 23);

        Executable.add(chckbxpkg_1);


        chckbxrar_1 = new JCheckBox(".com");

        chckbxrar_1.setFocusPainted(false);

        chckbxrar_1.setBounds(64, 44, 52, 23);

        Executable.add(chckbxrar_1);


        chckbxNewCheckBox_4_1_1_1 = new JCheckBox(".exe");

        chckbxNewCheckBox_4_1_1_1.setFocusPainted(false);

        chckbxNewCheckBox_4_1_1_1.setBounds(64, 70, 52, 23);

        Executable.add(chckbxNewCheckBox_4_1_1_1);


        chckbxNewCheckBox_4_2_4_1 = new JCheckBox(".gadget");

        chckbxNewCheckBox_4_2_4_1.setFocusPainted(false);

        chckbxNewCheckBox_4_2_4_1.setBounds(115, 21, 72, 23);

        Executable.add(chckbxNewCheckBox_4_2_4_1);


        exefield = new JTextField();

        exefield.setEnabled(false);

        exefield.setColumns(10);

        exefield.setBounds(254, 31, 620, 48);

        Executable.add(exefield);


        JButton exebutton = new JButton("Choose Dir");

        exebutton.setBounds(884, 44, 136, 23);
        exebutton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser files = new JFileChooser();
                files.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                int answer = files.showOpenDialog(null);
                if (answer == JFileChooser.APPROVE_OPTION) {
                    File directorySelected = files.getSelectedFile();
                    exefield.setText(directorySelected.getAbsolutePath());
                }
            }
        });

        Executable.add(exebutton);


        chckbxNewCheckBox_4_2_1_1_1 = new JCheckBox(".jar");

        chckbxNewCheckBox_4_2_1_1_1.setFocusPainted(false);

        chckbxNewCheckBox_4_2_1_1_1.setBounds(115, 44, 52, 23);

        Executable.add(chckbxNewCheckBox_4_2_1_1_1);


        chckbxNewCheckBox_4_2_2_1_1 = new JCheckBox(".msi");

        chckbxNewCheckBox_4_2_2_1_1.setFocusPainted(false);

        chckbxNewCheckBox_4_2_2_1_1.setBounds(115, 70, 52, 23);

        Executable.add(chckbxNewCheckBox_4_2_2_1_1);


        chckbxNewCheckBox_4_2_1_1_1_1 = new JCheckBox(".py");

        chckbxNewCheckBox_4_2_1_1_1_1.setFocusPainted(false);

        chckbxNewCheckBox_4_2_1_1_1_1.setBounds(189, 21, 52, 23);

        Executable.add(chckbxNewCheckBox_4_2_1_1_1_1);


        chckbxNewCheckBox_4_2_1_1_1_1_1 = new JCheckBox(".wsf");

        chckbxNewCheckBox_4_2_1_1_1_1_1.setFocusPainted(false);

        chckbxNewCheckBox_4_2_1_1_1_1_1.setBounds(189, 70, 52, 23);

        Executable.add(chckbxNewCheckBox_4_2_1_1_1_1_1);


        JCheckBox[] exe = {chckbxapk, chckbxarj_1, chckbxdeb_1, chckbxpkg_1, chckbxrar_1, chckbxNewCheckBox_4_1_1_1,

                chckbxNewCheckBox_4_2_4_1, chckbxNewCheckBox_4_2_1_1_1, chckbxNewCheckBox_4_2_2_1_1,

                chckbxNewCheckBox_4_2_1_1_1_1, chckbxNewCheckBox_4_2_1_1_1_1_1};

        ////////////////////////////////// EXE//////////////////////////////////////////////

        JSeparator separator_1_1 = new JSeparator();

        separator_1_1.setBounds(0, 335, 1030, 2);

        panel.add(separator_1_1);


        JPanel Video = new JPanel();

        Video.setLayout(null);

        Video.setBounds(0, 337, 1030, 143);

        panel.add(Video);


        JLabel VideoLabel = new JLabel("Video");

        VideoLabel.setHorizontalAlignment(SwingConstants.CENTER);

        VideoLabel.setBounds(-1, 4, 1030, 14);

        Video.add(VideoLabel);


        chckbxg = new JCheckBox(".3g2");

        chckbxg.setFocusPainted(false);

        chckbxg.setBounds(10, 18, 52, 23);

        Video.add(chckbxg);


        chckbxarj_1_1 = new JCheckBox(".3gp");

        chckbxarj_1_1.setFocusPainted(false);

        chckbxarj_1_1.setBounds(10, 44, 52, 23);

        Video.add(chckbxarj_1_1);


        chckbxdeb_1_1 = new JCheckBox(".avi");

        chckbxdeb_1_1.setFocusPainted(false);

        chckbxdeb_1_1.setBounds(10, 70, 52, 23);

        Video.add(chckbxdeb_1_1);


        chckbxpkg_1_1 = new JCheckBox(".flv");

        chckbxpkg_1_1.setFocusPainted(false);

        chckbxpkg_1_1.setBounds(64, 21, 52, 23);

        Video.add(chckbxpkg_1_1);


        chckbxrar_1_1 = new JCheckBox(".h264");

        chckbxrar_1_1.setFocusPainted(false);

        chckbxrar_1_1.setBounds(64, 44, 52, 23);

        Video.add(chckbxrar_1_1);


        chckbxNewCheckBox_4_1_1_1_1 = new JCheckBox(".m4v");

        chckbxNewCheckBox_4_1_1_1_1.setFocusPainted(false);

        chckbxNewCheckBox_4_1_1_1_1.setBounds(64, 70, 52, 23);

        Video.add(chckbxNewCheckBox_4_1_1_1_1);


        chckbxNewCheckBox_4_2_4_1_1 = new JCheckBox(".mkv");

        chckbxNewCheckBox_4_2_4_1_1.setFocusPainted(false);

        chckbxNewCheckBox_4_2_4_1_1.setBounds(115, 21, 72, 23);

        Video.add(chckbxNewCheckBox_4_2_4_1_1);


        vidfeild = new JTextField();

        vidfeild.setEnabled(false);

        vidfeild.setColumns(10);

        vidfeild.setBounds(254, 31, 620, 48);

        Video.add(vidfeild);


        JButton vidbutton = new JButton("Choose Dir");

        vidbutton.setBounds(884, 44, 136, 23);
        vidbutton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser files = new JFileChooser();
                files.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                int answer = files.showOpenDialog(null);
                if (answer == JFileChooser.APPROVE_OPTION) {
                    File directorySelected = files.getSelectedFile();
                    vidfeild.setText(directorySelected.getAbsolutePath());
                }
            }
        });

        Video.add(vidbutton);


        chckbxNewCheckBox_4_2_1_1_1_2 = new JCheckBox(".mov");

        chckbxNewCheckBox_4_2_1_1_1_2.setFocusPainted(false);

        chckbxNewCheckBox_4_2_1_1_1_2.setBounds(115, 44, 52, 23);

        Video.add(chckbxNewCheckBox_4_2_1_1_1_2);


        chckbxNewCheckBox_4_2_2_1_1_1 = new JCheckBox(".mp4");

        chckbxNewCheckBox_4_2_2_1_1_1.setFocusPainted(false);

        chckbxNewCheckBox_4_2_2_1_1_1.setBounds(115, 70, 52, 23);

        Video.add(chckbxNewCheckBox_4_2_2_1_1_1);


        chckbxNewCheckBox_4_2_1_1_1_1_2 = new JCheckBox(".mpg");

        chckbxNewCheckBox_4_2_1_1_1_1_2.setFocusPainted(false);

        chckbxNewCheckBox_4_2_1_1_1_1_2.setBounds(189, 21, 52, 23);

        Video.add(chckbxNewCheckBox_4_2_1_1_1_1_2);


        chckbxNewCheckBox_4_2_1_1_1_1_1_1 = new JCheckBox(".swf");

        chckbxNewCheckBox_4_2_1_1_1_1_1_1.setFocusPainted(false);

        chckbxNewCheckBox_4_2_1_1_1_1_1_1.setBounds(189, 70, 52, 23);

        Video.add(chckbxNewCheckBox_4_2_1_1_1_1_1_1);


        chckbxNewCheckBox_4_2_1_1_1_1_2_1 = new JCheckBox(".rm");

        chckbxNewCheckBox_4_2_1_1_1_1_2_1.setFocusPainted(false);

        chckbxNewCheckBox_4_2_1_1_1_1_2_1.setBounds(189, 44, 52, 23);

        Video.add(chckbxNewCheckBox_4_2_1_1_1_1_2_1);


        chckbxdeb_1_1_1 = new JCheckBox(".vob");

        chckbxdeb_1_1_1.setFocusPainted(false);

        chckbxdeb_1_1_1.setBounds(10, 98, 52, 23);

        Video.add(chckbxdeb_1_1_1);


        chckbxNewCheckBox_4_1_1_1_1_1 = new JCheckBox(".wmv");

        chckbxNewCheckBox_4_1_1_1_1_1.setFocusPainted(false);

        chckbxNewCheckBox_4_1_1_1_1_1.setBounds(189, 98, 52, 23);

        Video.add(chckbxNewCheckBox_4_1_1_1_1_1);

        JCheckBox[] vid = {chckbxg, chckbxarj_1_1, chckbxdeb_1_1, chckbxpkg_1_1, chckbxrar_1_1,

                chckbxNewCheckBox_4_1_1_1_1, chckbxNewCheckBox_4_2_4_1_1, chckbxNewCheckBox_4_2_1_1_1_2,

                chckbxNewCheckBox_4_2_2_1_1_1, chckbxNewCheckBox_4_2_1_1_1_1_2, chckbxNewCheckBox_4_2_1_1_1_1_1_1,

                chckbxNewCheckBox_4_2_1_1_1_1_2_1, chckbxdeb_1_1_1, chckbxNewCheckBox_4_1_1_1_1_1};

        ////////////////////////////////////////////////////////////////////////////////////// Video

        JSeparator separator_1_1_1 = new JSeparator();

        separator_1_1_1.setBounds(0, 482, 1030, 2);

        panel.add(separator_1_1_1);


        JPanel Audio = new JPanel();

        Audio.setLayout(null);

        Audio.setBounds(0, 484, 1030, 110);

        panel.add(Audio);


        JLabel lblOther = new JLabel("Audio");

        lblOther.setHorizontalAlignment(SwingConstants.CENTER);

        lblOther.setBounds(-1, 4, 1030, 14);

        Audio.add(lblOther);


        chckbxaif = new JCheckBox(".aif");

        chckbxaif.setFocusPainted(false);

        chckbxaif.setBounds(10, 18, 52, 23);

        Audio.add(chckbxaif);


        chckbxarj_1_1_1 = new JCheckBox(".cda");

        chckbxarj_1_1_1.setFocusPainted(false);

        chckbxarj_1_1_1.setBounds(10, 44, 52, 23);

        Audio.add(chckbxarj_1_1_1);


        chckbxdeb_1_1_2 = new JCheckBox(".mid");

        chckbxdeb_1_1_2.setFocusPainted(false);

        chckbxdeb_1_1_2.setBounds(10, 70, 52, 23);

        Audio.add(chckbxdeb_1_1_2);


        chckbxpkg_1_1_1 = new JCheckBox(".mp3");

        chckbxpkg_1_1_1.setFocusPainted(false);

        chckbxpkg_1_1_1.setBounds(64, 21, 52, 23);

        Audio.add(chckbxpkg_1_1_1);


        chckbxrar_1_1_1 = new JCheckBox(".mpa");

        chckbxrar_1_1_1.setFocusPainted(false);

        chckbxrar_1_1_1.setBounds(64, 44, 52, 23);

        Audio.add(chckbxrar_1_1_1);


        chckbxNewCheckBox_4_1_1_1_1_2 = new JCheckBox(".ogg");

        chckbxNewCheckBox_4_1_1_1_1_2.setFocusPainted(false);

        chckbxNewCheckBox_4_1_1_1_1_2.setBounds(64, 70, 52, 23);

        Audio.add(chckbxNewCheckBox_4_1_1_1_1_2);


        chckbxNewCheckBox_4_2_4_1_1_1 = new JCheckBox(".wav");

        chckbxNewCheckBox_4_2_4_1_1_1.setFocusPainted(false);

        chckbxNewCheckBox_4_2_4_1_1_1.setBounds(115, 21, 72, 23);

        Audio.add(chckbxNewCheckBox_4_2_4_1_1_1);


        audiofiel = new JTextField();

        audiofiel.setEnabled(false);

        audiofiel.setColumns(10);

        audiofiel.setBounds(254, 31, 620, 48);

        Audio.add(audiofiel);


        JButton audiobutton = new JButton("Choose Dir");

        audiobutton.setBounds(884, 44, 136, 23);
        audiobutton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser files = new JFileChooser();
                files.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                int answer = files.showOpenDialog(null);
                if (answer == JFileChooser.APPROVE_OPTION) {
                    File directorySelected = files.getSelectedFile();
                    audiofiel.setText(directorySelected.getAbsolutePath());
                }
            }
        });

        Audio.add(audiobutton);


        chckbxNewCheckBox_4_2_1_1_1_2_1 = new JCheckBox(".wma");

        chckbxNewCheckBox_4_2_1_1_1_2_1.setFocusPainted(false);

        chckbxNewCheckBox_4_2_1_1_1_2_1.setBounds(115, 44, 52, 23);

        Audio.add(chckbxNewCheckBox_4_2_1_1_1_2_1);


        chckbxNewCheckBox_4_2_2_1_1_1_1 = new JCheckBox(".wpl");

        chckbxNewCheckBox_4_2_2_1_1_1_1.setFocusPainted(false);

        chckbxNewCheckBox_4_2_2_1_1_1_1.setBounds(115, 70, 52, 23);

        Audio.add(chckbxNewCheckBox_4_2_2_1_1_1_1);


        JSeparator separator_1_1_1_1 = new JSeparator();

        separator_1_1_1_1.setBounds(0, 595, 1030, 2);

        panel.add(separator_1_1_1_1);


        JCheckBox[] audio = {chckbxaif, chckbxarj_1_1_1, chckbxdeb_1_1_2, chckbxpkg_1_1_1, chckbxrar_1_1_1,

                chckbxNewCheckBox_4_1_1_1_1_2, chckbxNewCheckBox_4_2_4_1_1_1, chckbxNewCheckBox_4_2_1_1_1_2_1,

                chckbxNewCheckBox_4_2_2_1_1_1_1};

        ///////////////////////////////////////////////////// AUDIO/////////////////////////////////////

        JPanel Other = new JPanel();

        Other.setLayout(null);

        Other.setBounds(0, 597, 1030, 110);

        panel.add(Other);


        JLabel lblOther_1 = new JLabel("OTHER");

        lblOther_1.setHorizontalAlignment(SwingConstants.CENTER);

        lblOther_1.setBounds(-1, 4, 1030, 14);

        Other.add(lblOther_1);


        otherfield = new JTextField();

        otherfield.setEnabled(false);

        otherfield.setColumns(10);

        otherfield.setBounds(254, 31, 620, 48);

        Other.add(otherfield);


        JButton btnNewButton_1_1_1_1_1 = new JButton("Choose Dir");

        btnNewButton_1_1_1_1_1.setEnabled(false);

        btnNewButton_1_1_1_1_1.setBounds(884, 44, 136, 23);
        btnNewButton_1_1_1_1_1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser files = new JFileChooser();
                files.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                int answer = files.showOpenDialog(null);
                if (answer == JFileChooser.APPROVE_OPTION) {
                    File directorySelected = files.getSelectedFile();
                    otherfield.setText(directorySelected.getAbsolutePath());
                }
            }
        });

        Other.add(btnNewButton_1_1_1_1_1);


        chckbxNewCheckBox_11 = new JCheckBox("ENABLE");

        chckbxNewCheckBox_11.setFocusPainted(false);

        chckbxNewCheckBox_11.setBounds(6, 44, 97, 23);
        chckbxNewCheckBox_11.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED)
                    btnNewButton_1_1_1_1_1.setEnabled(true);
                else {
                    btnNewButton_1_1_1_1_1.setEnabled(false);
                    otherfield.setText("");

                }
            }
        });

        Other.add(chckbxNewCheckBox_11);


        JButton Save_and_close = new JButton("Save and Close");

        Save_and_close.setBounds(913, 725, 89, 23);

        Save_and_close.addActionListener(new ActionListener() {


            @Override

            public void actionPerformed(ActionEvent e) {

                if (chckbxNewCheckBox_11.isSelected()) {

                    if (!(imgTextField.getText().equals("") && compressedFeild.getText().equals("") && exefield.getText().equals("") && vidfeild.getText().equals("") && audiofiel.getText().equals("") && otherfield.getText().equals(""))) {

                        ArrayList<Boolean> checkeds = new ArrayList<>();


                        for (JCheckBox j : img) {

                            checkeds.add(j.isSelected());

                        }

                        for (JCheckBox j : compress) {

                            checkeds.add(j.isSelected());

                        }


                        for (JCheckBox j : exe) {

                            checkeds.add(j.isSelected());

                        }


                        for (JCheckBox j : vid) {

                            checkeds.add(j.isSelected());

                        }


                        for (JCheckBox j : audio) {

                            checkeds.add(j.isSelected());

                        }


                        try {

                            //UNDERSTADN THIS FILEOUTPUTSTREAM

                            PrintWriter pw = new PrintWriter(new FileOutputStream("JCheckBox_Checked.txt"));

                            for (Boolean bool : checkeds)

                                pw.println(bool);

                            pw.close();


                        } catch (FileNotFoundException e1) {

                            // TODO Auto-generated catch block

                            e1.printStackTrace();

                        }

                        String[] text = {imgTextField.getText(), compressedFeild.getText(), exefield.getText(), vidfeild.getText(), audiofiel.getText()};

                        try {

                            //UNDERSTADN THIS FILEOUTPUTSTREAM

                            PrintWriter pw = new PrintWriter(new FileOutputStream("TextField.txt"));

                            for (String str : text)

                                pw.println(str);

                            pw.close();


                        } catch (FileNotFoundException e1) {
                            e1.printStackTrace();
                        }

                        try {

                            //UNDERSTADN THIS FILEOUTPUTSTREAM

                            PrintWriter pw = new PrintWriter(new FileOutputStream("Other.txt"));
                            pw.println(chckbxNewCheckBox_11.isSelected());
                            pw.println(otherfield.getText());

                            pw.close();


                        } catch (FileNotFoundException e1) {
                            e1.printStackTrace();
                        }


                        setVisible(false);
                        dispose();
                        System.out.println("weee");

                    } else
                        JOptionPane.showMessageDialog(null, "Fields not entered correctly");
                } else {
                    if (!(imgTextField.getText().equals("") && compressedFeild.getText().equals("") && exefield.getText().equals("") && vidfeild.getText().equals("") && audiofiel.getText().equals(""))) {

                        ArrayList<Boolean> checkeds = new ArrayList<>();


                        for (JCheckBox j : img) {

                            checkeds.add(j.isSelected());

                        }

                        for (JCheckBox j : compress) {

                            checkeds.add(j.isSelected());

                        }


                        for (JCheckBox j : exe) {

                            checkeds.add(j.isSelected());

                        }


                        for (JCheckBox j : vid) {

                            checkeds.add(j.isSelected());

                        }


                        for (JCheckBox j : audio) {

                            checkeds.add(j.isSelected());

                        }


                        try {

                            //UNDERSTADN THIS FILEOUTPUTSTREAM

                            PrintWriter pw = new PrintWriter(new FileOutputStream("JCheckBox_Checked.txt"));

                            for (Boolean bool : checkeds)

                                pw.println(bool);

                            pw.close();


                        } catch (FileNotFoundException e1) {

                            // TODO Auto-generated catch block

                            e1.printStackTrace();

                        }

                        String[] text = {imgTextField.getText(), compressedFeild.getText(), exefield.getText(), vidfeild.getText(), audiofiel.getText()};

                        try {

                            //UNDERSTADN THIS FILEOUTPUTSTREAM

                            PrintWriter pw = new PrintWriter(new FileOutputStream("TextField.txt"));

                            for (String str : text)

                                pw.println(str);

                            pw.close();


                        } catch (FileNotFoundException e1) {
                            e1.printStackTrace();
                        }

                        try {


                            PrintWriter pw = new PrintWriter(new FileOutputStream("Other.txt"));
                            pw.println(chckbxNewCheckBox_11.isSelected());
                            pw.println(otherfield.getText());

                            pw.close();


                        } catch (FileNotFoundException e1) {
                            e1.printStackTrace();
                        }


                        setVisible(false);
                        dispose();
                        System.out.println("weee");

                    } else
                        JOptionPane.showMessageDialog(null, "Fields not entered correctly");
                }
            }


        });

        contentPane.add(Save_and_close);


        if (arr != null) {


            int index = 0;


            for (int i = 0; i < img.length; i++) {

                img[i].setSelected(arr.get(index));

                index++;

            }

            for (int i = 0; i < compress.length; i++) {

                compress[i].setSelected(arr.get(index));

                index++;

            }

            for (int i = 0; i < exe.length; i++) {

                exe[i].setSelected(arr.get(index));

                index++;

            }

            for (int i = 0; i < vid.length; i++) {

                vid[i].setSelected(arr.get(index));

                index++;

            }

            for (int i = 0; i < audio.length; i++) {

                audio[i].setSelected(arr.get(index));

                index++;

            }


        }

        if (text != null) {
            //Set textfield text

            JTextField[] textFields = {imgTextField, compressedFeild, exefield, vidfeild, audiofiel};
            for (int i = 0; i < textFields.length; i++) {
                textFields[i].setText(text[i]);
            }

        }
        if (otherText != null) {
            chckbxNewCheckBox_11.setSelected(Boolean.parseBoolean(otherText[0]));
            otherfield.setText(otherText[1]);
        }


    }

    public String[] getPaths() {
        String[] text = {imgTextField.getText(), compressedFeild.getText(), exefield.getText(), vidfeild.getText(), audiofiel.getText()};
        return text;
    }

    public ArrayList<String> getImageChecked() {
        JCheckBox[] img = {chckbxNewCheckBox, chckbxbmp, chckbxgif, chckbxico, chckbxjpeg, chckbxNewCheckBox_4_1,

                chckbxNewCheckBox_4_2, chckbxNewCheckBox_4_2_1, chckbxNewCheckBox_4_2_2, chckbxNewCheckBox_4_2_3};
        ArrayList<String> imgExtension = new ArrayList<String>();
        for (JCheckBox j : img)
            if (j.isSelected())
                imgExtension.add(j.getText());

        return imgExtension;
    }

    public ArrayList<String> getCompressChecked() {
        JCheckBox[] compress = {chckbxz, chckbxarj, chckbxdeb, chckbxpkg, chckbxrar, chckbxNewCheckBox_4_1_1,

                chckbxNewCheckBox_4_2_4, chckbxNewCheckBox_4_2_1_1, chckbxNewCheckBox_4_2_2_1};
        ArrayList<String> imgExtension = new ArrayList<String>();
        for (JCheckBox j : compress)
            if (j.isSelected())
                imgExtension.add(j.getText());

        return imgExtension;
    }

    public ArrayList<String> getExtensionChecked() {
        JCheckBox[] exe = {chckbxapk, chckbxarj_1, chckbxdeb_1, chckbxpkg_1, chckbxrar_1, chckbxNewCheckBox_4_1_1_1,

                chckbxNewCheckBox_4_2_4_1, chckbxNewCheckBox_4_2_1_1_1, chckbxNewCheckBox_4_2_2_1_1,

                chckbxNewCheckBox_4_2_1_1_1_1, chckbxNewCheckBox_4_2_1_1_1_1_1};
        ArrayList<String> imgExtension = new ArrayList<String>();
        for (JCheckBox j : exe)
            if (j.isSelected())
                imgExtension.add(j.getText());

        return imgExtension;
    }

    public ArrayList<String> getVideoChecked() {
        JCheckBox[] vid = {chckbxg, chckbxarj_1_1, chckbxdeb_1_1, chckbxpkg_1_1, chckbxrar_1_1,

                chckbxNewCheckBox_4_1_1_1_1, chckbxNewCheckBox_4_2_4_1_1, chckbxNewCheckBox_4_2_1_1_1_2,

                chckbxNewCheckBox_4_2_2_1_1_1, chckbxNewCheckBox_4_2_1_1_1_1_2, chckbxNewCheckBox_4_2_1_1_1_1_1_1,

                chckbxNewCheckBox_4_2_1_1_1_1_2_1, chckbxdeb_1_1_1, chckbxNewCheckBox_4_1_1_1_1_1};
        ArrayList<String> imgExtension = new ArrayList<String>();
        for (JCheckBox j : vid)
            if (j.isSelected())
                imgExtension.add(j.getText());

        return imgExtension;
    }

    public ArrayList<String> getAudioChecked() {
        JCheckBox[] audio = {chckbxaif, chckbxarj_1_1_1, chckbxdeb_1_1_2, chckbxpkg_1_1_1, chckbxrar_1_1_1,

                chckbxNewCheckBox_4_1_1_1_1_2, chckbxNewCheckBox_4_2_4_1_1_1, chckbxNewCheckBox_4_2_1_1_1_2_1,

                chckbxNewCheckBox_4_2_2_1_1_1_1};
        ArrayList<String> imgExtension = new ArrayList<String>();
        for (JCheckBox j : audio)
            if (j.isSelected())
                imgExtension.add(j.getText());

        return imgExtension;
    }


    public boolean isOtherChecked() {
        return chckbxNewCheckBox_11.isSelected();
    }

    public String getOtherPath() {
        return otherfield.getText();
    }


}