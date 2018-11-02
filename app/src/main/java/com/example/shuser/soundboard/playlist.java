package com.example.shuser.soundboard;

import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.io.IOException;

public class playlist extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {




    private AssetManager mAssetManager;
    private SoundPool mSoundPool;
    private int Sound2, Sound3, Sound4, Sound5,Sound6,Sound7,Sound8,Sound9,Sound10,Sound11,Sound12,Sound13,Sound14,Sound15,Sound16,Sound17,Sound18,Sound19,Sound20,Sound21,Sound22,Sound23,Sound24,Sound25,Sound26,Sound27,Sound28,Sound29,Sound30,Sound31,Sound32,Sound33,Sound34,Sound35,Sound36,Sound37,Sound38,Sound39,Sound40,Sound41,Sound42,Sound43,Sound44,Sound45,Sound46,Sound47,Sound48,Sound49,Sound50,Sound51,Sound52,Sound53,Sound54,Sound55,Sound56,Sound57,Sound58,Sound59,Sound60,Sound61,Sound62;
    private int mStreamID;
    private int flagSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //tets
        setContentView(R.layout.activity_playlist);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


//Sound
        createNewSoundPool();
        mAssetManager = getAssets();
        Sound2=loadSound("all_dead.mp3");
        Sound3=loadSound("brutal-savage-rekt.mp3");
        Sound4=loadSound("chatwheel_tian_huo.mp3");
        Sound5=loadSound("dota-2-eto.-prosto.-nechto._(mp3CC.biz) (www.mp3cut.ru).mp3");
        Sound6=loadSound("dota-bozhe-ty-posmotri-vokrug-chto-proishodit_(mp3CC.biz).mp3");
        Sound7=loadSound("easiest-money-of-my-life.mp3");
        Sound8=loadSound("its-a-disaster.mp3");
        Sound9=loadSound("lakat matataaaag(www.mp3cut.ru).mp3");
        Sound10=loadSound("PFZ (mp3cut.net).mp3");
        Sound11=loadSound("UAGH.mp3");
        Sound12=loadSound("нисибусие.mp3");
        Sound13=loadSound("ой ой ой (www.mp3cut.ru).mp3");
        Sound14=loadSound("chatwheel_charge.mp3");
        Sound15=loadSound("chatwheel_crash_burn.mp3");
        Sound16=loadSound("chatwheel_crowd_lv_01.mp3");
        Sound17=loadSound("chatwheel_crybaby.mp3");
        Sound18=loadSound("chatwheel_ehto_g_g.mp3");
        Sound19=loadSound("chatwheel_frog.mp3");
        Sound20=loadSound("chatwheel_headshake.mp3");
        Sound21=loadSound("ibuttons-drumroll.mp3");
        Sound22=loadSound("vilat-aj-aj-aj-aj-aj-chto-sejchas-proizoshlo_(mp3CC.biz).mp3");
        Sound23=loadSound("ойойой бежать (www.mp3cut.ru).mp3");
        Sound24=loadSound("э ты ё ла.mp3");
        Sound25=loadSound("это ненормально.mp3");
        Sound26=loadSound("4to eto.wav");
        Sound27=loadSound("a kak dumat ina4e.wav");
        Sound28=loadSound("anuliroval moi slova.wav");
        Sound29=loadSound("dadada.wav");
        Sound30=loadSound("eeee ya catch you.wav");
        Sound31=loadSound("gore pobejdenn.wav");
        Sound32=loadSound("help.wav");
        Sound33=loadSound("i 4to.wav");
        Sound34=loadSound("kak ti menya besish.wav");
        Sound35=loadSound("ladno.wav");
        Sound36=loadSound("sho.wav");
        Sound37=loadSound("zdarova.wav");
        Sound38=loadSound("crickets.swf.mp3");
        Sound39=loadSound("engineer_no01 (1).mp3");
        Sound40=loadSound("fatality.swf.mp3");
        Sound41=loadSound("hellodarknessmyoldfriend.mp3");
        Sound42=loadSound("joke_drum_effect.mp3");
        Sound43=loadSound("meme-big-boy_QPtF1VU.mp3");
        Sound44=loadSound("nooo.mp3");
        Sound45=loadSound("sadtrombone.swf.mp3");
        Sound46=loadSound("the-simpsons-nelsons-haha.mp3");
        Sound47=loadSound("they-ask-you-how-you-are-and-you-just-have-to-say-that-youre-fine-sound-effect_IgYM1CV.mp3");
        Sound48=loadSound("tmpktrnct0r.mp3");
        Sound49=loadSound("trollolol.swf.mp3");
        Sound50=loadSound("dejavu-i-just-been-in-this-place-before (www.mp3cut.ru).mp3");
        Sound51=loadSound("felix_bit_subarus_ear_scene_rezeroconverttoaudio.mp3");
        Sound52=loadSound("kono-dio-da99.mp3");
        Sound53=loadSound("no-problem-desu_2.mp3");
        Sound54=loadSound("over-9000.mp3");
        Sound55=loadSound("re-zero-betelgeuse-romanee-conti-desu (www.mp3cut.ru).mp3");
        Sound56=loadSound("strongpunch.mp3");
        Sound57=loadSound("sugoi-sugoi.mp3");
        Sound58=loadSound("tuturu_1.mp3");
        Sound59=loadSound("untitled_1071.mp3");
        Sound60=loadSound("yes-yes-yes-yes-yes.mp3");
        Sound61=loadSound("za-warudo-stop-time-sound.mp3");




        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this,curper));

        gridview.setOnItemClickListener(gridviewOnItemClickListener);






    }



    int curper=0;

    public void All(MenuItem menuItem){
        curper=0;
        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this,curper));

        gridview.setOnItemClickListener(gridviewOnItemClickListener);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    public void Per1(MenuItem menuItem){
        curper=1;
        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this,curper));

        gridview.setOnItemClickListener(gridviewOnItemClickListener);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    public void Per2(MenuItem menuItem){
        curper=2;
        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this,curper));

        gridview.setOnItemClickListener(gridviewOnItemClickListener);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    public void Per3(MenuItem menuItem){
        curper=3;
        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this,curper));

        gridview.setOnItemClickListener(gridviewOnItemClickListener);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    public void Per4(MenuItem menuItem){
        curper=4;
        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this,curper));

        gridview.setOnItemClickListener(gridviewOnItemClickListener);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    public void Per5(MenuItem menuItem){
        curper=5;
        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this,curper));

        gridview.setOnItemClickListener(gridviewOnItemClickListener);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    public void Per6(MenuItem menuItem){
        curper=6;
        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this,curper));

        gridview.setOnItemClickListener(gridviewOnItemClickListener);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    public void exit(MenuItem menuItem) {
        finishAffinity();
    }
    public void about(MenuItem menuItem){

    }









    GridView.OnItemClickListener gridviewOnItemClickListener = new GridView.OnItemClickListener() {

        @Override
        public void onItemClick(AdapterView<?> parent, View v, int position,
                                long id) {

            if(curper==1 && position ==0)  playSound(Sound2);
            if(curper==1 && position ==1)  playSound(Sound3);
            if(curper==1 && position ==2)  playSound(Sound4);
            if(curper==1 && position ==3)  playSound(Sound5);
            if(curper==1 && position ==4)  playSound(Sound6);
            if(curper==1 && position ==5)  playSound(Sound7);
            if(curper==1 && position ==6)  playSound(Sound8);
            if(curper==1 && position ==7)  playSound(Sound9);
            if(curper==1 && position ==8)  playSound(Sound10);
            if(curper==1 && position ==9)  playSound(Sound11);
            if(curper==1 && position ==10) playSound(Sound12);
            if(curper==1 && position ==11) playSound(Sound13);
            if(curper==2 && position ==0)  playSound(Sound14);
            if(curper==2 && position ==1)  playSound(Sound15);
            if(curper==2 && position ==2)  playSound(Sound16);
            if(curper==2 && position ==3)  playSound(Sound17);
            if(curper==2 && position ==4)  playSound(Sound18);
            if(curper==2 && position ==5)  playSound(Sound19);
            if(curper==2 && position ==6)  playSound(Sound20);
            if(curper==2 && position ==7)  playSound(Sound21);
            if(curper==2 && position ==8)  playSound(Sound22);
            if(curper==2 && position ==9)  playSound(Sound23);
            if(curper==2 && position ==10) playSound(Sound24);
            if(curper==2 && position ==11) playSound(Sound25);
            if(curper==3 && position ==0)  playSound(Sound26);
            if(curper==3 && position ==1)  playSound(Sound27);
            if(curper==3 && position ==2)  playSound(Sound28);
            if(curper==3 && position ==3)  playSound(Sound29);
            if(curper==3 && position ==4)  playSound(Sound30);
            if(curper==3 && position ==5)  playSound(Sound31);
            if(curper==3 && position ==6)  playSound(Sound32);
            if(curper==3 && position ==7)  playSound(Sound33);
            if(curper==3 && position ==8)  playSound(Sound34);
            if(curper==3 && position ==9)  playSound(Sound35);
            if(curper==3 && position ==10) playSound(Sound36);
            if(curper==3 && position ==11) playSound(Sound37);
            if(curper==4 && position ==0)  playSound(Sound38);
            if(curper==4 && position ==1)  playSound(Sound39);
            if(curper==4 && position ==2)  playSound(Sound40);
            if(curper==4 && position ==3)  playSound(Sound41);
            if(curper==4 && position ==4)  playSound(Sound42);
            if(curper==4 && position ==5)  playSound(Sound43);
            if(curper==4 && position ==6)  playSound(Sound44);
            if(curper==4 && position ==7)  playSound(Sound45);
            if(curper==4 && position ==8)  playSound(Sound46);
            if(curper==4 && position ==9)  playSound(Sound47);
            if(curper==4 && position ==10) playSound(Sound48);
            if(curper==4 && position ==11) playSound(Sound49);
            if(curper==5 && position ==0)  playSound(Sound50);
            if(curper==5 && position ==1)  playSound(Sound51);
            if(curper==5 && position ==2)  playSound(Sound52);
            if(curper==5 && position ==3)  playSound(Sound53);
            if(curper==5 && position ==4)  playSound(Sound54);
            if(curper==5 && position ==5)  playSound(Sound55);
            if(curper==5 && position ==6)  playSound(Sound56);
            if(curper==5 && position ==7)  playSound(Sound57);
            if(curper==5 && position ==8)  playSound(Sound58);
            if(curper==5 && position ==9)  playSound(Sound59);
            if(curper==5 && position ==10) playSound(Sound60);
            if(curper==5 && position ==11) playSound(Sound61);

            //
            if(curper==0 && position ==0)  playSound(Sound2);
            if(curper==0 && position ==1)  playSound(Sound3);
            if(curper==0 && position ==2)  playSound(Sound4);
            if(curper==0 && position ==3)  playSound(Sound5);
            if(curper==0 && position ==4)  playSound(Sound6);
            if(curper==0 && position ==5)  playSound(Sound7);
            if(curper==0 && position ==6)  playSound(Sound8);
            if(curper==0 && position ==7)  playSound(Sound9);
            if(curper==0 && position ==8)  playSound(Sound10);
            if(curper==0 && position ==9)  playSound(Sound11);
            if(curper==0 && position ==10) playSound(Sound12);
            if(curper==0 && position ==11) playSound(Sound13);
            if(curper==0 && position ==12) playSound(Sound14);
            if(curper==0 && position ==13) playSound(Sound15);
            if(curper==0 && position ==14) playSound(Sound16);
            if(curper==0 && position ==15) playSound(Sound17);
            if(curper==0 && position ==16) playSound(Sound18);
            if(curper==0 && position ==17) playSound(Sound19);
            if(curper==0 && position ==18) playSound(Sound20);
            if(curper==0 && position ==19) playSound(Sound21);
            if(curper==0 && position ==20) playSound(Sound22);
            if(curper==0 && position ==21) playSound(Sound23);
            if(curper==0 && position ==22) playSound(Sound24);
            if(curper==0 && position ==23) playSound(Sound25);
            if(curper==0 && position ==24) playSound(Sound26);
            if(curper==0 && position ==25) playSound(Sound27);
            if(curper==0 && position ==26) playSound(Sound28);
            if(curper==0 && position ==27) playSound(Sound29);
            if(curper==0 && position ==28) playSound(Sound30);
            if(curper==0 && position ==29) playSound(Sound31);
            if(curper==0 && position ==30) playSound(Sound32);
            if(curper==0 && position ==31) playSound(Sound33);
            if(curper==0 && position ==32) playSound(Sound34);
            if(curper==0 && position ==33) playSound(Sound35);
            if(curper==0 && position ==34) playSound(Sound36);
            if(curper==0 && position ==35) playSound(Sound37);
            if(curper==0 && position ==36) playSound(Sound38);
            if(curper==0 && position ==37) playSound(Sound39);
            if(curper==0 && position ==38) playSound(Sound40);
            if(curper==0 && position ==39) playSound(Sound41);
            if(curper==0 && position ==40) playSound(Sound42);
            if(curper==0 && position ==41) playSound(Sound43);
            if(curper==0 && position ==42) playSound(Sound44);
            if(curper==0 && position ==43) playSound(Sound45);
            if(curper==0 && position ==44) playSound(Sound46);
            if(curper==0 && position ==45) playSound(Sound47);
            if(curper==0 && position ==46) playSound(Sound48);
            if(curper==0 && position ==47) playSound(Sound49);
            if(curper==0 && position ==48) playSound(Sound50);
            if(curper==0 && position ==49) playSound(Sound51);
            if(curper==0 && position ==50) playSound(Sound52);
            if(curper==0 && position ==51) playSound(Sound53);
            if(curper==0 && position ==52) playSound(Sound54);
            if(curper==0 && position ==53) playSound(Sound55);
            if(curper==0 && position ==54) playSound(Sound56);
            if(curper==0 && position ==55) playSound(Sound57);
            if(curper==0 && position ==56) playSound(Sound58);
            if(curper==0 && position ==57) playSound(Sound59);
            if(curper==0 && position ==58) playSound(Sound60);
            if(curper==0 && position ==59) playSound(Sound61);


        }
    };


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            finishAffinity();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.playlist, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }





    private void createNewSoundPool() {
        AudioAttributes attributes = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_GAME)
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .build();
        mSoundPool = new SoundPool.Builder()
                .setAudioAttributes(attributes)
                .build();
    }


    private int playSound(int sound) {
        if (sound > 0 && sound != flagSound) {
            flagSound = sound;
            mStreamID = mSoundPool.play(sound, 1, 1, 1, 0, 1);
        }
        else {
            mSoundPool.pause(mStreamID);
            flagSound = 0;
        }
        return mStreamID;
    }

    private int loadSound(String fileName) {
        AssetFileDescriptor afd;
        try {
            afd = mAssetManager.openFd(fileName);
        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(getApplicationContext(), "Не могу загрузить файл " + fileName,
                    Toast.LENGTH_SHORT).show();
            return -1;
        }
        return mSoundPool.load(afd, 1);
    }

    public void oprog(MenuItem menuItem){
        Intent intent = new Intent(playlist.this,MainActivity.class);
        startActivity(intent);

    }
    @Override
    protected void onResume() {
        super.onResume();
        createNewSoundPool();

        mAssetManager = getAssets();

        Sound2=loadSound("all_dead.mp3");
        Sound3=loadSound("brutal-savage-rekt.mp3");
        Sound4=loadSound("chatwheel_tian_huo.mp3");
        Sound5=loadSound("dota-2-eto.-prosto.-nechto._(mp3CC.biz) (www.mp3cut.ru).mp3");
        Sound6=loadSound("dota-bozhe-ty-posmotri-vokrug-chto-proishodit_(mp3CC.biz).mp3");
        Sound7=loadSound("easiest-money-of-my-life.mp3");
        Sound8=loadSound("its-a-disaster.mp3");
        Sound9=loadSound("lakat matataaaag(www.mp3cut.ru).mp3");
        Sound10=loadSound("PFZ (mp3cut.net).mp3");
        Sound11=loadSound("UAGH.mp3");
        Sound12=loadSound("нисибусие.mp3");
        Sound13=loadSound("ой ой ой (www.mp3cut.ru).mp3");
        Sound14=loadSound("chatwheel_charge.mp3");
        Sound15=loadSound("chatwheel_crash_burn.mp3");
        Sound16=loadSound("chatwheel_crowd_lv_01.mp3");
        Sound17=loadSound("chatwheel_crybaby.mp3");
        Sound18=loadSound("chatwheel_ehto_g_g.mp3");
        Sound19=loadSound("chatwheel_frog.mp3");
        Sound20=loadSound("chatwheel_headshake.mp3");
        Sound21=loadSound("ibuttons-drumroll.mp3");
        Sound22=loadSound("vilat-aj-aj-aj-aj-aj-chto-sejchas-proizoshlo_(mp3CC.biz).mp3");
        Sound23=loadSound("ойойой бежать (www.mp3cut.ru).mp3");
        Sound24=loadSound("э ты ё ла.mp3");
        Sound25=loadSound("это ненормально.mp3");
        Sound26=loadSound("4to eto.wav");
        Sound27=loadSound("a kak dumat ina4e.wav");
        Sound28=loadSound("anuliroval moi slova.wav");
        Sound29=loadSound("dadada.wav");
        Sound30=loadSound("eeee ya catch you.wav");
        Sound31=loadSound("gore pobejdenn.wav");
        Sound32=loadSound("help.wav");
        Sound33=loadSound("i 4to.wav");
        Sound34=loadSound("kak ti menya besish.wav");
        Sound35=loadSound("ladno.wav");
        Sound36=loadSound("sho.wav");
        Sound37=loadSound("zdarova.wav");
        Sound38=loadSound("crickets.swf.mp3");
        Sound39=loadSound("engineer_no01 (1).mp3");
        Sound40=loadSound("fatality.swf.mp3");
        Sound41=loadSound("hellodarknessmyoldfriend.mp3");
        Sound42=loadSound("joke_drum_effect.mp3");
        Sound43=loadSound("meme-big-boy_QPtF1VU.mp3");
        Sound44=loadSound("nooo.mp3");
        Sound45=loadSound("sadtrombone.swf.mp3");
        Sound46=loadSound("the-simpsons-nelsons-haha.mp3");
        Sound47=loadSound("they-ask-you-how-you-are-and-you-just-have-to-say-that-youre-fine-sound-effect_IgYM1CV.mp3");
        Sound48=loadSound("tmpktrnct0r.mp3");
        Sound49=loadSound("trollolol.swf.mp3");
        Sound50=loadSound("dejavu-i-just-been-in-this-place-before (www.mp3cut.ru).mp3");
        Sound51=loadSound("felix_bit_subarus_ear_scene_rezeroconverttoaudio.mp3");
        Sound52=loadSound("kono-dio-da99.mp3");
        Sound53=loadSound("no-problem-desu_2.mp3");
        Sound54=loadSound("over-9000.mp3");
        Sound55=loadSound("re-zero-betelgeuse-romanee-conti-desu (www.mp3cut.ru).mp3");
        Sound56=loadSound("strongpunch.mp3");
        Sound57=loadSound("sugoi-sugoi.mp3");
        Sound58=loadSound("tuturu_1.mp3");
        Sound59=loadSound("untitled_1071.mp3");
        Sound60=loadSound("yes-yes-yes-yes-yes.mp3");
        Sound61=loadSound("za-warudo-stop-time-sound.mp3");


    }

























}
