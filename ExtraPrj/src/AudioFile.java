import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;

import uk.co.caprica.vlcj.binding.LibVlc;
import uk.co.caprica.vlcj.player.MediaPlayerFactory;
import uk.co.caprica.vlcj.player.embedded.EmbeddedMediaPlayer;
import uk.co.caprica.vlcj.player.embedded.windows.Win32FullScreenStrategy;
import uk.co.caprica.vlcj.runtime.RuntimeUtil;

public class AudioFile 
{
	public static void main(String[] args)
	{
		//Create a GUI to display video
		JFrame F=new JFrame();
		F.setLocation(400,200);
		F.setSize(640,360);
		F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		F.setVisible(true);
		
		//Create an instance of Canvas for displaying video
		Canvas C=new Canvas();
		C.setBackground(Color.BLACK);
		
		JPanel P=new JPanel();
		P.setLayout(new BorderLayout());
		
		P.add(C);
		F.add(P);
		
		//Now, we read the video file using vlcj and the native library of VLC
		//Load the native library of VLC from the directory where VLC is installed
		NativeLibrary.addSearchPath(RuntimeUtil.getLibVlcLibraryName(), "C:/Program Files (x86)/VideoLAN/VLC");
		Native.loadLibrary(RuntimeUtil.getLibVlcLibraryName(), LibVlc.class);
		
		//initialize the media player
		MediaPlayerFactory mpf=new MediaPlayerFactory();
		//control all the interactions with the user
		EmbeddedMediaPlayer emp=mpf.newEmbeddedMediaPlayer(new Win32FullScreenStrategy(F));
		emp.setVideoSurface(mpf.newVideoSurface(C));
		//full screen
		emp.toggleFullScreen();
		//hide the cursor
		emp.setEnableMouseInputHandling(false);
		//disable the keyboard
		emp.setEnableKeyInputHandling(false);
	
		String file="D:/Anime/Dragon Ball/Dragon Ball Super/100 - Out of Control! The Savage Berserker Awakens!.mp4";
		//prepare file to read
		emp.prepareMedia(file);
		//read the file
		emp.play();
	}
}
