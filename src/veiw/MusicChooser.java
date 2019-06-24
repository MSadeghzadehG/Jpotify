package veiw;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.io.File;

public class MusicChooser extends JFileChooser {


    public MusicChooser()
    {
        super(FileSystemView.getFileSystemView().getHomeDirectory());
        int returnValue = showOpenDialog(null);
        // int returnValue = jfc.showSaveDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = getSelectedFile();
            System.out.println(selectedFile.getAbsolutePath());
        }

    }
}
