package com.szpiler._06_adapter.model;

public class AudioPlayer implements MediaPlayer {
  final private AudioPlayerAdapter audioPlayerAdapter = new AudioPlayerAdapter();

  @Override
  public String play(String file) {
    if (file.endsWith(".mp3")) {
      return "audio from MP3 file [" + file + "]";
    } else {
      return audioPlayerAdapter.play(file);
    }
  }
}

