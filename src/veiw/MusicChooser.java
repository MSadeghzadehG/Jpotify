package veiw;

import logic.AlbumManager;
import logic.MusicPlayer;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.io.File;

public class MusicChooser extends JFileChooser {


    public MusicChooser()
    {
        super(FileSystemView.getFileSystemView().getHomeDirectory());
        this.setSize(400, 400);
        this.setVisible(true);
        int returnValue = showOpenDialog(null);
        this.setMultiSelectionEnabled(false);
        // int returnValue = jfc.showSaveDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File file = getSelectedFile();
            AlbumManager.getInstance().addNewSong(file.getAbsolutePath());
        }

    }
}
