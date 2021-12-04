package com.szpiler._06_adapter.model;

import com.szpiler._06_adapter.model.AviPlayer;
import com.szpiler._06_adapter.model.MediaPlayer;
import com.szpiler._06_adapter.model.VlcPlayer;

public class AudioPlayerAdapter implements MediaPlayer {
  private final AviPlayer aviPlayer = new AviPlayer();
  private final VlcPlayer vlcPlayer = new VlcPlayer();

  @Override
  public String play(String file) {
    if (file.endsWith(".avi")) {
      String content = aviPlayer.playAvi(file);
      return content.substring(0, content.indexOf("|")).trim() + " [" + file + "]";
    } else if (file.endsWith(".vlc")) {
      String content = vlcPlayer.playVlc(file);
      return content.substring(0, content.indexOf("|")).trim() + " [" + file + "]";
    } else {
      throw new RuntimeException("Unsupported media format in file " + file);
    }
  }
}