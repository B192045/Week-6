package Sounds;

interface dolby{
 void playDolby();
 void playPodcast();}

class Sound implements dolby{
 public void playPodcast(){
 System.out.print("podcast sound");}
 public void playDolby(){
  System.out.print("dolby sound");
 }}
 