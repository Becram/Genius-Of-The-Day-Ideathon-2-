package info.androidhive.tabsswipe;


import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
public class spash extends Activity {
MediaPlayer ourSong;
@Override
protected void onCreate(Bundle BecramLovesDhoju) {
// TODO Auto-generated method stub
super.onCreate(BecramLovesDhoju);
setContentView(R.layout.splash);
//ourSong=MediaPlayer.create(Splash.this, R.raw.sano);
//ourSong.start();
Thread timer =new Thread(){
public void run (){
try{
sleep(2000);
}catch (InterruptedException e){
e.printStackTrace();
}finally{
Intent openStartingPoint=new Intent(spash.this,MainActivity.class);
startActivity(openStartingPoint);
}
}
};
timer.start();
}
@Override
protected void onPause() {
// TODO Auto-generated method stub
super.onPause();
//ourSong.release();
finish();
}
}
